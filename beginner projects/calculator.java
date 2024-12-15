import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class calculator extends JFrame implements KeyListener {

    JTextField textField = new JTextField(20);

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new calculator().showPanel()); // needed to run of AWT for the GUI
    }

    private void showPanel() {
        setTitle("Calculator");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout()); // Use BorderLayout for proper placement
        setLocationRelativeTo(null);

        // JPanel panel = new JPanel();
        // panel.setLayout(new FlowLayout());

        String[] numbers = {
                "7", "8", "9", "+",
                "4", "5", "6", "-",
                "1", "2", "3", "*",
                "<-", "0", "ENTER", "/"
        }; // the names and layout of the buttons

        JPanel calcKeyboard = new JPanel(new GridLayout(4, 4)); // layout of the window
        JPanel textFieldJPanel = new JPanel(new GridLayout());
        textField.setSize(2000, 1000);
        textFieldJPanel.add(textField);
        textField.setPreferredSize(new Dimension(200, 30));
        textField.addKeyListener(this); // whenever a key is pressed, it will be displayed at the textField
        add(textField, BorderLayout.NORTH); // puts the textField at the top of the panel
        for (String numkey : numbers) {
            JButton button = new JButton(numkey); // groups with calckeyboard
            button.setFont(new Font("Consolas", Font.PLAIN, 20));
            button.addActionListener(e -> ButtonPress(numkey));
            calcKeyboard.add(button);
        }

        add(calcKeyboard, BorderLayout.CENTER);
        setVisible(true);
    }

    private void ButtonPress(String key) {
        if (key.equals("<-")) {
            String text = textField.getText();
            if (text.length() > 0) {
                textField.setText(text.substring(0, text.length() - 1)); // performs a backspace
            }
        } else if (key.equals("Enter")) {
            System.out.println("The answer is: " + textField.getText());
        } else {
            textField.setText(textField.getText() + key);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Key Typed: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed: " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));
    }
}