//we make different classes that are placed on the same folder for much cleaner code

import java.awt.Font;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegisterPage {

    // instantiate
    IDandPasswords idandPasswords;
    dropdownOptions dropdownOptions = new dropdownOptions();
    DatabaseHandler dbHandler = new DatabaseHandler();

    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Hi!");
    JTextField nameField = new JTextField();
    JLabel nameLabel = new JLabel("Name: ");
    JTextField emailField = new JTextField();
    JLabel emailLabel = new JLabel("Email: ");
    JComboBox<String> countryDropdown = new JComboBox<>(dropdownOptions.countries);
    JLabel countryLabel = new JLabel("Country: ");
    JComboBox<String> cityDropdown = new JComboBox<>(dropdownOptions.empty);
    JLabel cityLabel = new JLabel("City: ");
    JComboBox<String> barangayDropdown = new JComboBox<>(dropdownOptions.empty);
    JLabel barangayLabel = new JLabel("Sector: ");
    JPasswordField passwordField = new JPasswordField();
    JLabel passwordLabel = new JLabel("Password: ");
    JLabel warningLabel = new JLabel(" ");
    JButton regisButton = new JButton("Register");
    JButton backToLoginButton = new JButton("Back to Login");
    JButton showPass = new JButton("(─ ‿ ─)");

    RegisterPage(IDandPasswords idandPasswordsClass) {
        this.idandPasswords = idandPasswordsClass;

        //Show Password button
        showPass.setBounds(360, 240, 80, 25);
        showPass.setFocusable(false);
        showPass.addActionListener(e -> {
            if (String.valueOf(passwordField.getPassword()).isEmpty()) { //even if pass field is empty
                passwordField.setEchoChar('\u0000'); //when typed, it would show password (\u0000 means no masking meaning show password)
                showPass.setText("(⊙_⊙)"); //show password emoji
            } else {
                if (passwordField.getEchoChar() != '\u0000') { //If password is not masked (!\u0000)
                    passwordField.setEchoChar('\u0000'); //Show password
                    showPass.setText("(⊙_⊙)");
                } else { //if password is shown (\u0000)
                    passwordField.setEchoChar('•'); //Hide password
                    showPass.setText("(─ ‿ ─)"); //hide password emoji
                }
            }
        });
        frame.add(showPass);
        

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

        //setting the dropdowns
        countryDropdown.setBounds(150, 150, 200, 25);
        countryLabel.setBounds(50, 150, 75, 25);
        countryLabel.setFont(new Font(null, Font.PLAIN, 15));
        frame.add(countryDropdown);
        frame.add(countryLabel);

        cityDropdown.setBounds(150, 180, 200, 25);
        cityLabel.setBounds(50, 180, 75, 25);
        cityLabel.setFont(new Font(null, Font.PLAIN, 15));
        frame.add(cityDropdown);
        frame.add(cityLabel);

        barangayDropdown.setBounds(150, 210, 200, 25);
        barangayLabel.setBounds(50, 210, 75, 25);
        barangayLabel.setFont(new Font(null, Font.PLAIN, 15));
        frame.add(barangayDropdown);
        frame.add(barangayLabel);

        //setting up dropdowns logic
        countryDropdown.addActionListener(e -> {
            String selectedCountry = (String) countryDropdown.getSelectedItem();
            DefaultComboBoxModel<String> cityModel;

            switch (selectedCountry) {
                case "Philippines":
                    cityModel = new DefaultComboBoxModel<>(dropdownOptions.citiesPH);
                    break;
                case "France":
                    cityModel = new DefaultComboBoxModel<>(dropdownOptions.citiesFR);
                    break;
                case "Japan":
                    cityModel = new DefaultComboBoxModel<>(dropdownOptions.citiesJP);
                    break;
                case "Mexico":
                    cityModel = new DefaultComboBoxModel<>(dropdownOptions.citiesMX);
                    break;
                case "India":
                    cityModel = new DefaultComboBoxModel<>(dropdownOptions.citiesIN);
                    break;
                default:
                    cityModel = new DefaultComboBoxModel<>(dropdownOptions.empty);
                    break;
            }
            // Set the new model for the city dropdown
            cityDropdown.setModel(cityModel);
            // Also reset the sector/barangay dropdown
            barangayDropdown.setModel(new DefaultComboBoxModel<>(dropdownOptions.empty));
        });

        cityDropdown.addActionListener(e -> {
            // Check if a city is actually selected to avoid errors
            if (cityDropdown.getSelectedItem() == null) {
                return;
            }

            String selectedCountry = (String) countryDropdown.getSelectedItem();
            String selectedCity = (String) cityDropdown.getSelectedItem();
            DefaultComboBoxModel<String> barangayModel = new DefaultComboBoxModel<>(dropdownOptions.empty);

            switch (selectedCountry) {
                case "Philippines":
                    switch (selectedCity) {
                        case "Quezon": barangayModel = new DefaultComboBoxModel<>(dropdownOptions.barangaysPH_QC); break;
                        case "Manila": barangayModel = new DefaultComboBoxModel<>(dropdownOptions.barangaysPH_MN); break;
                        case "Makati": barangayModel = new DefaultComboBoxModel<>(dropdownOptions.barangaysPH_MK); break;
                        case "Pasig": barangayModel = new DefaultComboBoxModel<>(dropdownOptions.barangaysPH_PS); break;
                        case "Taguig": barangayModel = new DefaultComboBoxModel<>(dropdownOptions.barangaysPH_TG); break;
                    }
                    break;
                case "France":
                    switch (selectedCity) {
                        case "Paris": barangayModel = new DefaultComboBoxModel<>(dropdownOptions.barangaysFR_PA); break;
                        case "Marseille": barangayModel = new DefaultComboBoxModel<>(dropdownOptions.barangaysFR_MA); break;
                        case "Lyon": barangayModel = new DefaultComboBoxModel<>(dropdownOptions.barangaysFR_LY); break;
                        case "Toulouse": barangayModel = new DefaultComboBoxModel<>(dropdownOptions.barangaysFR_TO); break;
                        case "Nice": barangayModel = new DefaultComboBoxModel<>(dropdownOptions.barangaysFR_NI); break;
                    }
                    break;
                case "Japan":
                     switch (selectedCity) {
                        case "Tokyo": barangayModel = new DefaultComboBoxModel<>(dropdownOptions.barangaysJP_TO); break;
                        case "Osaka": barangayModel = new DefaultComboBoxModel<>(dropdownOptions.barangaysJP_OS); break;
                        case "Kyoto": barangayModel = new DefaultComboBoxModel<>(dropdownOptions.barangaysJP_KY); break;
                        case "Nagoya": barangayModel = new DefaultComboBoxModel<>(dropdownOptions.barangaysJP_NA); break;
                        case "Fukuoka": barangayModel = new DefaultComboBoxModel<>(dropdownOptions.barangaysJP_FU); break;
                    }
                    break;
                case "Mexico":
                     switch (selectedCity) {
                        case "Mexico City": barangayModel = new DefaultComboBoxModel<>(dropdownOptions.barangaysMX_QC); break;
                        case "Guadalajara": barangayModel = new DefaultComboBoxModel<>(dropdownOptions.barangaysMX_MN); break;
                        case "Monterrey": barangayModel = new DefaultComboBoxModel<>(dropdownOptions.barangaysMX_MK); break;
                        case "Puebla": barangayModel = new DefaultComboBoxModel<>(dropdownOptions.barangaysMX_PS); break;
                        case "Tijuana": barangayModel = new DefaultComboBoxModel<>(dropdownOptions.barangaysMX_TG); break;
                    }
                    break;
                case "India":
                     switch (selectedCity) {
                        case "Mumbai": barangayModel = new DefaultComboBoxModel<>(dropdownOptions.barangaysIN_MU); break;
                        case "New Delhi": barangayModel = new DefaultComboBoxModel<>(dropdownOptions.barangaysIN_ND); break;
                        case "Bangalore": barangayModel = new DefaultComboBoxModel<>(dropdownOptions.barangaysIN_BA); break;
                        case "Kolkata": barangayModel = new DefaultComboBoxModel<>(dropdownOptions.barangaysIN_KO); break;
                        case "Chennai": barangayModel = new DefaultComboBoxModel<>(dropdownOptions.barangaysIN_CH); break;
                    }
                    break;
            }
            // Set the new model for the sector/barangay dropdown
            barangayDropdown.setModel(barangayModel);
        });
        
        //setting the password field
        passwordField.setBounds(150, 240, 200, 25);
        passwordLabel.setBounds(50, 240, 75, 25);
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
            new LoginPage(new IDandPasswords().getInfo());//open the login page
        });

        //setting the registration button
        regisButton.setBounds(260, 340, 120, 25);
        regisButton.setFocusable(false);
        regisButton.addActionListener(e -> {
            try {
                if (nameField.getText().trim().isEmpty() || emailField.getText().trim().isEmpty() || String.valueOf(passwordField.getPassword()).trim().isEmpty()) {
                    throw new EmptyFieldException("Please fill in all required fields");
                }
                String name = nameField.getText();
                String email = emailField.getText();
                String country = (String) countryDropdown.getSelectedItem();
                String city = (String) cityDropdown.getSelectedItem();
                String sector = (String) barangayDropdown.getSelectedItem();
                String password = String.valueOf(passwordField.getPassword());

                validateName(name);
                validateEmail(email);
                validatePassword(password);
                
                if (dbHandler.checkUserExists(name, email)) {
                    throw new UserExistsException("Username or email already exists");
                }
                if (country.equals("Select Country") && city.equals("Select City") && sector.equals("Select Sector")) {
                    throw new InvalidSelectionException("Please select a country, city, and sector");
                }

                // Only insert user into SQLite database
                boolean dbSuccess = database.insertUser(name, email, password, country, city, sector);
                if (!dbSuccess) {
                    JOptionPane.showMessageDialog(frame, "Failed to save user to database.", "Database Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                JOptionPane.showMessageDialog(frame, "Registration Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                frame.dispose(); //close the current window
                new LoginPage(null); //open the login page (no local user info)
            } catch (InvalidNameException ex) {
                JOptionPane.showMessageDialog(frame, ex.getMessage(), "Registration Failed", JOptionPane.INFORMATION_MESSAGE);
            } catch (InvalidEmailException ex) {
                JOptionPane.showMessageDialog(frame, ex.getMessage(), "Registration Failed", JOptionPane.INFORMATION_MESSAGE);
            } catch (InvalidPasswordException ex) {
                JOptionPane.showMessageDialog(frame, ex.getMessage(), "Registration Failed", JOptionPane.INFORMATION_MESSAGE);
            } catch (InvalidSelectionException ex) {
                JOptionPane.showMessageDialog(frame, ex.getMessage(), "Registration Failed", JOptionPane.INFORMATION_MESSAGE);
            } catch (EmptyFieldException ex) {
                JOptionPane.showMessageDialog(frame, ex.getMessage(), "Registration Failed", JOptionPane.INFORMATION_MESSAGE);
            } catch (UserExistsException ex) {
                JOptionPane.showMessageDialog(frame, ex.getMessage(), "Registration Failed", JOptionPane.INFORMATION_MESSAGE);
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

    // Exception-based data validation
    private void validateEmail(String email) throws InvalidEmailException {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        if (!email.matches(emailRegex)) {
            throw new InvalidEmailException("Invalid email format");
        }
    }

    private void validateName(String name) throws InvalidNameException {
        if (!name.matches("^[a-zA-Z ]+$")) {
            throw new InvalidNameException("Name must only contain letters and spaces");
        }
    }

    private void validatePassword(String password) throws InvalidPasswordException {
        if (password.length() < 8) {
            throw new InvalidPasswordException("Password must be at least 8 characters long");
        }
        if (!password.matches(".*[A-Za-z].*")) {
            throw new InvalidPasswordException("Password must contain at least one letter");
        }
        if (!password.matches(".*\\d.*")) {
            throw new InvalidPasswordException("Password must contain at least one number");
        }
    }

    //custom exception classes
    static class InvalidNameException extends Exception {
        public InvalidNameException(String message) { super(message); }
    }
    static class InvalidEmailException extends Exception {
        public InvalidEmailException(String message) { super(message); }
    }
    static class InvalidPasswordException extends Exception {
        public InvalidPasswordException(String message) { super(message); }
    }
    static class InvalidSelectionException extends Exception {
        public InvalidSelectionException(String message) { super(message); }
    }
    static class EmptyFieldException extends Exception {
        public EmptyFieldException(String message) { super(message); }
    }
    static class UserExistsException extends Exception {
        public UserExistsException(String message) { super(message); }
    }
}