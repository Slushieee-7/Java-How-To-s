import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TicTacToe implements ActionListener {

    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel titlepanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[9]; // indication that there wil be 9 slots
    boolean player1Turn;

    TicTacToe() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(Color.GRAY);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textfield.setBackground(Color.black); // bg color
        textfield.setForeground(Color.white); // color of the font
        textfield.setFont(new Font("Arial", Font.BOLD, 50));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Tic Tac Toe");
        textfield.setOpaque(true);

        titlepanel.setLayout(new BorderLayout());
        titlepanel.setBounds(0, 0, 800, 100);

        buttonPanel.setLayout(new GridLayout(3, 3));
        buttonPanel.setBackground(Color.gray);

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttonPanel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.BOLD, 120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        titlepanel.add(textfield);
        frame.add(titlepanel, BorderLayout.NORTH);
        frame.add(buttonPanel);

        first();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 9; i++) {
            if (e.getSource() == buttons[i]) {
                if (player1Turn) {
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(Color.darkGray);
                        buttons[i].setText("X");
                        player1Turn = false;
                        textfield.setText("O turn");
                        check();
                    }
                } else {
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(Color.orange);
                        buttons[i].setText("O");
                        player1Turn = true;
                        textfield.setText("X turn");
                        check();
                    }
                }
            }
        }

    }

    public void first() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } // adds a delay transition from title to "turn" messages

        if (random.nextInt(2) == 0) {
            player1Turn = true;
            textfield.setText("X turn");
        } else {
            player1Turn = false;
            textfield.setText("O turn");
        }
    }

    public void check() {
        // check if x wins
        if ((buttons[0].getText() == "X") &&
            (buttons[1].getText() == "X") &&
            (buttons[2].getText() == "X")) {
                xWins(0, 1, 2);

        }

        if ((buttons[3].getText() == "X") &&
            (buttons[4].getText() == "X") &&
            (buttons[5].getText() == "X")) {
                xWins(3, 4, 5);

        }

        if ((buttons[6].getText() == "X") &&
            (buttons[7].getText() == "X") &&
            (buttons[8].getText() == "X")) {
                xWins(6, 7, 8);

        }

        if ((buttons[0].getText() == "X") &&
            (buttons[3].getText() == "X") &&
            (buttons[6].getText() == "X")) {
                xWins(0, 3, 6);

        }

        if ((buttons[1].getText() == "X") &&
            (buttons[4].getText() == "X") &&
            (buttons[7].getText() == "X")) {
                xWins(1, 4, 7);

        }

        if ((buttons[2].getText() == "X") &&
            (buttons[5].getText() == "X") &&
            (buttons[8].getText() == "X")) {
                xWins(2, 5, 8);
        }

        if ((buttons[0].getText() == "X") &&
            (buttons[4].getText() == "X") &&
            (buttons[8].getText() == "X")) {
                xWins(0, 4, 8);
        }

        if ((buttons[2].getText() == "X") &&
            (buttons[4].getText() == "X") &&
            (buttons[6].getText() == "X")) {
                xWins(2, 4, 6);

        }

        // check if O wins
        if ((buttons[0].getText() == "O") &&
        (buttons[1].getText() == "O") &&
        (buttons[2].getText() == "O")) {
            oWins(0, 1, 2);

    }

    if ((buttons[3].getText() == "O") &&
        (buttons[4].getText() == "O") &&
        (buttons[5].getText() == "O")) {
            oWins(3, 4, 5);

    }

    if ((buttons[6].getText() == "O") &&
        (buttons[7].getText() == "O") &&
        (buttons[8].getText() == "O")) {
            oWins(6, 7, 8);

    }

    if ((buttons[0].getText() == "O") &&
        (buttons[3].getText() == "O") &&
        (buttons[6].getText() == "O")) {
            oWins(0, 3, 6);

    }

    if ((buttons[1].getText() == "O") &&
        (buttons[4].getText() == "O") &&
        (buttons[7].getText() == "O")) {
            oWins(1, 4, 7);

    }

    if ((buttons[2].getText() == "O") &&
        (buttons[5].getText() == "O") &&
        (buttons[8].getText() == "O")) {
            oWins(2, 5, 8);
    }

    if ((buttons[0].getText() == "O") &&
        (buttons[4].getText() == "O") &&
        (buttons[8].getText() == "O")) {
            oWins(0, 4, 8);
    }

    if ((buttons[2].getText() == "O") &&
        (buttons[4].getText() == "O") &&
        (buttons[6].getText() == "O")) {
            oWins(2, 4, 6);

    }
        
    }

    public void xWins(int a, int b, int c) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i = 0; i <9; i++){
            buttons[i].setEnabled(false);
        } //disables all buttons

        textfield.setText("X wins!");
    }

    public void oWins(int a, int b, int c) {
        buttons[a].setBackground(Color.YELLOW);
        buttons[b].setBackground(Color.YELLOW);
        buttons[c].setBackground(Color.YELLOW);

        for (int i = 0; i <9; i++){
            buttons[i].setEnabled(false);
        } //disables all buttons

        textfield.setText("O wins!");
    }
}
