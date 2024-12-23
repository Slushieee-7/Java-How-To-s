//we make different classes that are placed on the same folder for much cleaner code

import java.util.HashMap;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.Timer;

public class LoginPage implements ActionListener{

    HashMap<String, String> loginInfo = new HashMap<String, String>(); 

    JFrame frame = new JFrame(); //instantiate the frame
    JButton loginButton = new JButton("Login"); //make a login button
    JButton clearButton = new JButton("Clear"); //make a clear or reset button
    JTextField IDField = new JTextField(); //textField for user ID
    JPasswordField PassField = new JPasswordField(); //textField for user password and also for customization of password field
    JLabel userIDLabel = new JLabel("User ID: "); //Label the textField as UserID
    JLabel userPassLabel = new JLabel("Password: "); //label the textField as Password
    JLabel confirmMessage = new JLabel(); //make a message for successful login
    JLabel errorMessage = new JLabel(); //make a message for failed login

    LoginPage(HashMap<String, String> loginInfoOriginal) { // we will now make this class the copy for the information
                                                           // stored in the IDandPasswords
        loginInfo = loginInfoOriginal; // this will be the copy of our HashMap, wherein "loginInfo" is available
                                       // globally

        //setting the labels
        userIDLabel.setBounds(50, 100, 75, 25);
        userPassLabel.setBounds(50, 150, 75, 25);
        confirmMessage.setBounds(80, 250, 400, 35);
        confirmMessage.setFont(new Font(null, Font.BOLD, 25)); //set Font for the message
        errorMessage.setBounds(60, 250, 400, 35);
        errorMessage.setFont(new Font(null, Font.BOLD, 20)); //set Font for the message

        //set the text fields
        IDField.setBounds(120, 100, 200, 25);
        PassField.setBounds(120, 150, 200, 25);
        PassField.setEchoChar('•');

        //setting the buttons
        loginButton.setBounds(140,200, 70, 25);
        loginButton.addActionListener(this); //adds an action listener to this button
        loginButton.setFocusable(false); //no more borders when clicking the button
        clearButton.setBounds(220,200, 70, 25);
        clearButton.addActionListener(this); //adds an action listener to this button
        clearButton.setFocusable(false); //no more borders when clicking the button

        //adding the labels in the frame
        frame.add(userIDLabel);
        frame.add(userPassLabel);
        frame.add(confirmMessage);
        frame.add(errorMessage);

        //adding labels in the frame
        frame.add(IDField);
        frame.add(PassField);

        //adding the buttons in the frame
        frame.add(loginButton);
        frame.add(clearButton);

        //setting the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits the window on default 
        frame.setSize(500, 500); //sets the size of the window
        frame.setLayout(null); //no Layout needed
        frame.setVisible(true); //makes the window visible
        frame.setLocationRelativeTo(null); //sets the window at the center of the screen
    }

    @Override
    public void actionPerformed(ActionEvent e) { //whenever there is an "implements ActionListener", there must always have this actionPerformed unimplemented method
        if(e.getSource() == clearButton){ //when the clear button is pressed:
            IDField.setText(""); //sets the IDField blank
            PassField.setText(""); //sets the password field blank
            confirmMessage.setText(""); //clears the confirm message
            errorMessage.setText(""); //clears the error message
        }

        if(e.getSource() == loginButton){
            String userID = IDField.getText(); //gets the text from the IDField
            String userPass = String.valueOf(PassField.getPassword()); //gets the text from the PassField and also verifies the password

            if(loginInfo.containsKey(userID)){ //if there is a string entered at the ID Field:
                if(loginInfo.get(userID).equals(userPass)){ //if the entered user ID is equals to the password:
                    confirmMessage.setText("Login Successful ^o^");; //it will display "Login Successful!"
                    confirmMessage.setForeground(Color.BLACK); //its foreground will be blue

                    Timer timer = new Timer(2000, new ActionListener() { //sets a 2 seconds time interval
                        @Override
                        public void actionPerformed(ActionEvent evt) { //when the login button is pressed, and the login is successful
                            frame.dispose(); // Dispose the login frame, then display the welcome page
                            new WelcomePage(userID); // Open the welcome page, with the message of the window and userID
                        }
                    });
                    timer.setRepeats(false); // Only execute once
                    timer.start(); // Start the timer
                }
                else{
                    errorMessage.setText("Incorrect password (づ •. •)? "); //if the entered user ID is not equals to the password
                }
            }
            else {
                errorMessage.setText("Username not found (ㅠ︿ㅠ) "); //if there is no string entered at
            }
        }
    } 
}
