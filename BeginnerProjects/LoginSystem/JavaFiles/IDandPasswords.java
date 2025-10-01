//we make different classes that are placed on the same folder for much cleaner code

import java.util.ArrayList;
import java.util.HashMap;
import java.io.*;

public class IDandPasswords {

    // make a hashmap because it would be perfect for its "key" and "value"
    HashMap<String, String> login = new HashMap<String, String>();

    // List to store registered users
    private ArrayList<Register> registeredUsers = new ArrayList<>();

    private static final String USERS_FILE = "users.dat";

    //holds the registration info
    public static class Register implements Serializable {
        public String name;
        public String email;
        public String country;
        public String city;
        public String sector;
        public String password;

        public Register(String name, String email, String country, String city, String sector, String password) {
            this.name = name;
            this.email = email;
            this.country = country;
            this.city = city;
            this.sector = sector;
            this.password = password;
        }
    }

    // constructor
    IDandPasswords() {
        loadRegisteredUsers();
        // Optionally, add loaded users to login map
        for (Register reg : registeredUsers) {
            login.put(reg.name, reg.password);
        }
    }

    protected void addUser(String name, String password) {
        login.put(name, password);
        System.out.println(name + ", " + password);
        System.out.println(login);
    }

    //now, we make a class that will get the information 
    protected HashMap getInfo(){
        return login;
    } //we use protected, so that it wouldn't be called by many classes because it has different usernames and passwords
    //we use HashMap because it is stored in a HashMap
    //return login - means that whenever the "getInfo" class is called, it will return the keys and values stored in the login HashMap

    // Add a Register object to the list
    public void addRegister(Register reg) {
        registeredUsers.add(reg);
        saveRegisteredUsers();
    }

    //getter for registered users
    public ArrayList<Register> getRegisteredUsers() {
        return registeredUsers;
    }

    //saves registered users to file
    private void saveRegisteredUsers() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(USERS_FILE))) {
            oos.writeObject(registeredUsers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //loads registered users from file
    private void loadRegisteredUsers() {
        File file = new File(USERS_FILE); //makes a file object for storing database
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                registeredUsers = (ArrayList<Register>) ois.readObject();
            } catch (Exception e) {
                e.printStackTrace();
                registeredUsers = new ArrayList<>();
            }
        }
    }
}
