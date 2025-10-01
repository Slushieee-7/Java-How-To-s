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

    //class for welcome page after logging in
    public WelcomePage(IDandPasswords.Register user) {

        //logout button
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
        welcomeLabel.setText("Good Day! " + user.name + " ^-^");

        StringBuilder info = new StringBuilder("<html>");
        info.append("Name: ").append(user.name).append("<br>");
        info.append("Email: ").append(user.email).append("<br>");
        info.append("Country: ").append(user.country).append("<br>");
        info.append("City: ").append(user.city).append("<br>");
        info.append("Sector: ").append(user.sector).append("<br>");
        info.append("</html>");

        infoLabel.setBounds(50, 80, 400, 200);
        infoLabel.setFont(new Font(null, Font.PLAIN, 16));
        infoLabel.setText(info.toString());

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.add(welcomeLabel);
        frame.add(infoLabel);
    }

    //welcome page for just greeting the user by their ID
    WelcomePage(String userID) {
        welcomeLabel.setBounds(50, 50, 200, 25);
        welcomeLabel.setFont(new Font(null, Font.BOLD, 20));
        welcomeLabel.setText("Good Day! " + userID + " ^-^");

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.add(welcomeLabel);
    }
}
