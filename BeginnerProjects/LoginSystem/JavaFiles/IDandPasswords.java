//we make different classes that are placed on the same folder for much cleaner code

import java.util.HashMap;

public class IDandPasswords {

    // make a hashmap because it would be perfect for its "key" and "value"
    HashMap<String, String> login = new HashMap<String, String>();

    // constructor
    IDandPasswords() {
        login.put("Slushieee", "yoshiii"); // here "Slushieee" is the username, while "yoshiii" is the password
        login.put("yoshii", "1234");
        login.put("REYYY", "reyrey");
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
    
}
