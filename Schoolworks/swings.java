import javax.swing.*;
import java.awt.*;

public class swings {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Syntaxes of Java Swing"); //name of the window 
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the frame

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout()); // sets the panel into a Flow Layout
        // panel.setLayout(new BorderLayout()); // if u want on the border nakalagay mga functions

        // Create components
        JLabel label = new JLabel("Enter your name: "); // Label
        JTextField text = new JTextField(20); // Text field
        JButton exitbutton = new JButton("Exit"); // button when clicked will exit the window
        JButton button1 = new JButton("Click"); // Button when clicked will output a string
        String[] items = { "Option A", "Option B", "Option C" };
        JComboBox<String> options = new JComboBox<>(items); // dropdown options
        JCheckBox checkit = new JCheckBox("Accept Terms and Conditions"); // checkbox

        // black circle shading thingy
        JRadioButton radio1 = new JRadioButton("Radio 1");
        JRadioButton radio2 = new JRadioButton("Radio 2");
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2); 

        //Menu Bar 
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File"); //button that when clicked
        JMenuItem exitItem = new JMenuItem("Exit");

        exitItem.addActionListener(e -> System.exit(0));
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        // Add action listener to the button
        button1.addActionListener(e -> System.out.println("I have been clicked!")); //when "button1" is clicked, the message will be printed in the terminal
        exitbutton.addActionListener(e -> System.exit(0)); // exits the system once exit button is clicked

        // Add components to the panel
        panel.add(label);
        panel.add(text);
        panel.add(button1);
        panel.add(exitbutton);
        panel.add(options);
        panel.add(checkit);
        panel.add(radio1);
        panel.add(radio2);
        panel.add(menuBar);

        // Add the panel to the frame
        frame.add(panel);

        // Set frame visibility
        frame.setVisible(true);
    }

}

