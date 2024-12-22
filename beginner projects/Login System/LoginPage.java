//we make different classes that are placed on the same folder for much cleaner code

import java.util.HashMap;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginPage implements ActionListener{

    HashMap<String, String> loginInfo = new HashMap<String, String>(); 

    JFrame frame = new JFrame(); //instantiate the frame
    JButton button = new JButton("Login"); //make a login button
    JButton button2 = new JButton("Clear"); //make a clear or reset button
    JTextField IDField = new JTextField(); //textField for user ID
    JTextField PassField = new JTextField(); //textField for user password
    JLabel userIDLabel = new JLabel("User ID: "); //Label the textField as UserID
    JLabel userPassLabel = new JLabel("Password: "); //label the textField as Password
    JLabel confirmMessage = new JLabel("Login Successful!"); //make a message for successful login
    JLabel errorMessage = new JLabel("Invalid User ID or Password"); //make a message for failed login

    LoginPage(HashMap<String, String> loginInfoOriginal) { // we will now make this class the copy for the information
                                                           // stored in the IDandPasswords
        loginInfo = loginInfoOriginal; // this will be the copy of our HashMap, wherein "loginInfo" is available
                                       // globally

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits the window on default 
        frame.setSize(300, 200); //sets the size of the window
        frame.setLayout(null); //no Layout needed
        frame.setVisible(true); //makes the window visible
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    } //whenever there is an "implements ActionListener", there must always have this actionPerformed unimplemented method
}
