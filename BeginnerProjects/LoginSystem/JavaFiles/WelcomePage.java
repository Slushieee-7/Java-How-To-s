//we make different classes that are placed on the same folder for much cleaner code

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {

    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Hi!");
    JLabel infoLabel = new JLabel();
    JButton logoutButton = new JButton("Logout");

    //welcome page for just greeting the user by their ID
    WelcomePage(IDandPasswords.Register reg) {
        // Try to load latest data from the SQLite DB using the provided name
        IDandPasswords.Register dbReg = database.getUserByName(reg.name);

        // fallback to passed Register fields if DB lookup fails
        String name = reg.name;
        String email = reg.email;
        String country = reg.country;
        String city = reg.city;
        String sector = reg.sector;

        if (dbReg != null) {
            if (dbReg.name != null) name = dbReg.name;
            if (dbReg.email != null) email = dbReg.email;
            if (dbReg.country != null) country = dbReg.country;
            if (dbReg.city != null) city = dbReg.city;
            if (dbReg.sector != null) sector = dbReg.sector;
        }

        // single setup of UI components (removed duplicated code)
        logoutButton.setBounds(200, 350, 100, 25);
        logoutButton.setFocusable(false);
        logoutButton.addActionListener(e -> {
            frame.dispose();
            new LoginPage(new IDandPasswords().getInfo());
        });
        frame.add(logoutButton);

        //welcome message and user info
        welcomeLabel.setBounds(50, 30, 400, 30);
        welcomeLabel.setFont(new Font(null, Font.BOLD, 20));
        welcomeLabel.setText("Good day! " + name);

        infoLabel.setBounds(50, 80, 400, 200);
        infoLabel.setFont(new Font(null, Font.PLAIN, 16));
        infoLabel.setText("<html>Your registered information is as follows:<br><br>" +
                          "Name: " + name + "<br>" +
                          "Email: " + email + "<br>" +
                          "Country: " + country + "<br>" +
                          "City: " + city + "<br>" +
                          "Sector: " + sector + "</html>");

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.add(welcomeLabel);
        frame.add(infoLabel);
        frame.setVisible(true);
    }
}