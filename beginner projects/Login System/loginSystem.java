//we make different classes that are placed on the same folder for much cleaner code

import java.util.HashMap;

public class loginSystem {
    
    public static void main(String[] args) {

        //creating instances for the different classes
        IDandPasswords idandPass = new IDandPasswords();
        LoginPage loginpage = new LoginPage(idandPass.getInfo());
    }
}
