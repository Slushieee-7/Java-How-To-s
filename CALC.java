import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CALC implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton[] numButtons = new JButton[10];// 10 indicating numbers 0-10 or the size of the array
    JButton[] funcButtons = new JButton[8]; // 8, indicating that there will be 8 function buttons
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton;
    JPanel panel; // panel to store all of the function buttons

    Font myFont = new Font("Montserrat", Font.BOLD, 20); // sets the font of the buttons

    double num1 = 0, num2 = 0, result = 0; // sets num1, num2 and result to 0
    char operator; // this holds all the function buttons

    CALC() {

        frame = new JFrame("Basic Calculator"); // name of the calculator
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550); // sets the size of the window
        frame.setLayout(null); // sets the window at the center

        textField = new JTextField(); // sets the textField
        textField.setBounds(50, 25, 300, 50); // sets the size of the textField
        textField.setFont(myFont); // since we already set a font, we will put "myFont" inside the parentheses
        textField.setEditable(false); // this means that the user can't type in the textField

        //sets the symbol for each button
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("x");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("<-");
        clrButton = new JButton("Clear");

        //groups all of the buttons to funcButton 
        funcButtons[0] = addButton;
        funcButtons[1] = subButton;
        funcButtons[2] = mulButton;
        funcButtons[3] = divButton;
        funcButtons[4] = decButton;
        funcButtons[5] = equButton;
        funcButtons[6] = delButton;
        funcButtons[7] = clrButton;

        //syntaxes to make everything in the window visible 
        frame.add(textField);
        frame.setVisible(true);

    }// constructor

    public static void main(String[] args) {

        CALC calculator = new CALC();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
