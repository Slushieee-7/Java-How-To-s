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

        // sets the symbol for each button
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("x");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("<-");
        clrButton = new JButton("Clear");

        // groups all of the buttons to funcButton
        funcButtons[0] = addButton;
        funcButtons[1] = subButton;
        funcButtons[2] = mulButton;
        funcButtons[3] = divButton;
        funcButtons[4] = decButton;
        funcButtons[5] = equButton;
        funcButtons[6] = delButton;
        funcButtons[7] = clrButton;

        // make a for loop to customize the function buttons
        for (int i = 0; i < 8; i++) {
            funcButtons[i].addActionListener(this);
            funcButtons[i].setFont(myFont);
            funcButtons[i].setFocusable(false); // so that when a button is pressed, there will be no outline of the
                                                // button
        }

        // make a loop for the number buttons
        for (int i = 0; i < 10; i++) {
            numButtons[i] = new JButton(String.valueOf(i)); // stores the value of the number
            numButtons[i].addActionListener(this);
            numButtons[i].setFont(myFont);
            numButtons[i].setFocusable(false);
        }

        delButton.setBounds(40, 430, 145, 50);
        clrButton.setBounds(190, 430, 145, 50);

        // we also need to instantiate the panel at the top
        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300); // sets the panel of the buttons of where the buttons will be placed
        panel.setLayout(new GridLayout(4, 4, 10, 10)); // sets the rows, columns and gaps of each button
        // panel.setBackground(Color.lightGray); // sets the color of that panel

        /*
         * // for loop for adding the buttons
         * for (int i = 0; i < 10; i++) {
         * panel.add(numButtons[i]);
         * for (int j = 0; j < 8; j++) {
         * if (j % 3 == 0) {
         * panel.add(funcButtons[j]);
         * }
         * }
         * 
         * }
         */

        // the Jpanel can't read or place each button into 4 columns, but can store the
        // buttons into 4 rows only

        panel.add(numButtons[1]);
        panel.add(numButtons[2]);
        panel.add(numButtons[3]);
        panel.add(addButton);
        panel.add(numButtons[4]);
        panel.add(numButtons[5]);
        panel.add(numButtons[6]);
        panel.add(subButton);
        panel.add(numButtons[7]);
        panel.add(numButtons[8]);
        panel.add(numButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        // syntaxes to make everything in the window visible
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(panel);
        frame.add(textField);
        frame.setVisible(true);

    }// constructor

    public static void main(String[] args) {

        CALC calculator = new CALC();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // for loop for number buttons
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numButtons[i]) { // e.getSource is the system that calls the button its source
                textField.setText(textField.getText().concat(String.valueOf(i))); // here is where the number will be
                                                                                  // displayed or in this syntax, the
                                                                                  // textField will now get the String
                                                                                  // of that button that was pressed
            }
        }

        // if loop for the decimal button
        if (e.getSource() == decButton) {
            textField.setText(textField.getText().concat("."));
        } // impliments that whenever the decimal button is pressed, it will be called
          // first by the e.getSource, then it will be displayed in the textField

        // if loop for the add button
        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }

        // if loop for the subtract button
        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }

        // if loop for the multiplication button
        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }

        // if loop for the division button
        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '÷';
            textField.setText("");
        }

        // if and switch statement for equals button
        if (e.getSource() == equButton) {
            num2 = Double.parseDouble(textField.getText()); // gets the value of the second input at num2

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    result = num1 / num2;
                    break;
            }
            textField.setText(String.valueOf(result)); // displays the result at the textField
            num1 = result; // to continue if we want to use the same number or result to be added,
                           // subtracted, multiplied, or divided to the next input
        }

        // clear button
        if (e.getSource() == clrButton) {
            textField.setText("");
        } // whenever the user hits the clear button, it clears the textField

        // delete button
        if (e.getSource() == delButton) {
            String string = textField.getText();
            textField.setText("");
            for (int i = 0; i < string.length() - 1; i++) { // deletes the string next to the cursor
                textField.setText(textField.getText() + string.charAt(i)); // displays the numbers left after the
                                                                           // deletion was made
            }
        }

        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
