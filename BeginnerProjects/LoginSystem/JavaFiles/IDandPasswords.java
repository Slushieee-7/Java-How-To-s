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

    // Static inner class to hold registration info
    public static class Register implements Serializable {
        public String name;
        public String email;
        public String address;
        public String password;

        public Register(String name, String email, String password) {
            this.name = name;
            this.email = email;
            this.password = password;
        }
    }

    // constructor
    IDandPasswords() {
        login.put("Slushieee", "yoshiii"); // here "Slushieee" is the username, while "yoshiii" is the password
        login.put("yoshii", "1234");
        login.put("REYYY", "reyrey");
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

    // Optionally, getter for registered users
    public ArrayList<Register> getRegisteredUsers() {
        return registeredUsers;
    }

    // Save registered users to file
    private void saveRegisteredUsers() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(USERS_FILE))) {
            oos.writeObject(registeredUsers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Load registered users from file
    private void loadRegisteredUsers() {
        File file = new File(USERS_FILE);
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
