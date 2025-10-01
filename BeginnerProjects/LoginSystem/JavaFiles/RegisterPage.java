//we make different classes that are placed on the same folder for much cleaner code

import java.awt.Font;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.io.*;
import java.net.*;

public class RegisterPage {

    // insantiate
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Hi!");
    JTextField nameField = new JTextField();
    JLabel nameLabel = new JLabel("Name: ");
    JTextField emailField = new JTextField();
    JLabel emailLabel = new JLabel("Email: ");
    JComboBox<String> addressDropCountry = new JComboBox<>();
    JComboBox<String> addressDropCity = new JComboBox<>();
    JComboBox<String> addressDropBarangay = new JComboBox<>();
    JLabel addressLabel = new JLabel("Address: ");
    JPasswordField passwordField = new JPasswordField();
    JLabel passwordLabel = new JLabel("Password: ");
    JLabel warningLabel = new JLabel(" ");
    JButton regisButton = new JButton("Register");
    JButton backToLoginButton = new JButton("Back to Login");
    IDandPasswords idandPasswords;

    RegisterPage(IDandPasswords idandPasswordsClass) { //we use String userID, so that the code accepts the userID, and will display the userID with the message
        this.idandPasswords = idandPasswordsClass;

        //setting the label or the message of the window
        welcomeLabel.setBounds(130, 50, 300, 25);
        welcomeLabel.setFont(new Font(null, Font.BOLD, 20));
        welcomeLabel.setText("Welcome new user!" + " ^-^");

        //setting the name field
        nameField.setBounds(150, 90, 200, 25);
        nameLabel.setBounds(50, 90, 75, 25);
        nameLabel.setFont(new Font(null, Font.PLAIN, 15));
        frame.add(nameLabel);
        frame.add(nameField);

        //setting the email field
        emailField.setBounds(150, 120, 200, 25);
        emailLabel.setBounds(50, 120, 75, 25);
        emailLabel.setFont(new Font(null, Font.PLAIN, 15));
        frame.add(emailField);
        frame.add(emailLabel);

        //setting the address field
        // addressField.setBounds(150, 150, 200, 25);
        addressLabel.setBounds(50, 150, 75, 25);
        addressLabel.setFont(new Font(null, Font.PLAIN, 15));
        // frame.add(addressField);
        frame.add(addressLabel);

        //setting the password field
        passwordField.setBounds(150, 180, 200, 25);
        passwordLabel.setBounds(50, 180, 75, 25);
        passwordLabel.setFont(new Font(null, Font.PLAIN, 15));
        frame.add(passwordField);
        frame.add(passwordLabel);

        //setting the warning message
        warningLabel.setBounds(150, 210, 200, 25);
        warningLabel.setFont(new Font(null, Font.BOLD, 15));
        warningLabel.setForeground(Color.RED);
        frame.add(warningLabel);

        //setting the login button
        backToLoginButton.setBounds(120, 340, 120, 25);
        backToLoginButton.setFocusable(false);
        backToLoginButton.addActionListener(e -> { 
            frame.dispose(); //close the current window
            LoginPage loginPage = new LoginPage(idandPasswords.getInfo()); //open the login page
        });

        //setting the registration button
        regisButton.setBounds(260, 340, 120, 25);
        regisButton.setFocusable(false);
        regisButton.addActionListener(e -> {
            if (!nameField.getText().trim().isEmpty() && !emailField.getText().trim().isEmpty() && !String.valueOf(passwordField.getPassword()).trim().isEmpty()) {
                String name = nameField.getText();
                String email = emailField.getText();
                // String address = addressField.getText();
                String password = String.valueOf(passwordField.getPassword());
                System.out.println("Registered: " + name + ", " + email + ", " + ", " + password);

                // Store registration info in IDandPasswords.Register
                IDandPasswords.Register reg = new IDandPasswords.Register(name, email, password);
                idandPasswords.addRegister(reg);

                // Optionally, also add to login map for authentication
                idandPasswords.addUser(name, password);

            } else {
                warningLabel.setText("Please fill in all fields");
            }
        });

        // setting the frame
        frame.setSize(500, 500); // sets the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // sets the default exit window
        frame.setLayout(null); // sets the layout to null
        frame.setVisible(true); // sets the window to be visible
        frame.setLocationRelativeTo(null);// sets the window at the center of the screen
        frame.add(welcomeLabel);
        frame.add(backToLoginButton);
        frame.add(regisButton);
    }
}
