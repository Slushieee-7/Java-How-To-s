//we make different classes that are placed on the same folder for much cleaner code

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RegisterPage {

    // insantiate
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Hi!");
    JTextField nameField = new JTextField();
    JLabel nameLabel = new JLabel("Name: ");
    JButton backToLoginButton = new JButton("Back to Login");

    RegisterPage() { //we user String userID, so that the code accepts the userID, and will display the userID with the message

        //setting the label or the message of the window
        welcomeLabel.setBounds(130, 50, 300, 25);
        welcomeLabel.setFont(new Font(null, Font.BOLD, 20));
        welcomeLabel.setText("Welcome new user!" + " ^-^");

        //setting the name field
        nameField.setBounds(100, 90, 200, 25);
        nameLabel.setBounds(50, 90, 75, 25);
        nameLabel.setFont(new Font(null, Font.PLAIN, 15));
        frame.add(nameLabel);
        frame.add(nameField);


        //setting the button
        backToLoginButton.setBounds(130, 370, 120, 25);
        backToLoginButton.setFocusable(false);
        backToLoginButton.addActionListener(e -> { 
            frame.dispose(); //close the current window
            new LoginPage(new java.util.HashMap<String, String>()); //open the login page
        });

        // setting the frame
        frame.setSize(500, 500); // sets the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // sets the default exit window
        frame.setLayout(null); // sets the layout to null
        frame.setVisible(true); // sets the window to be visible
        frame.setLocationRelativeTo(null);// sets the window at the center of the screen
        frame.add(welcomeLabel);
        frame.add(backToLoginButton);
    }
}
