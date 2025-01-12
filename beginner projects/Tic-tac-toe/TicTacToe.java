import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.event.*;

public class TicTacToe implements ActionListener {

    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel titlepanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[9]; //indication that there wil be 9 slots 
    boolean player1Turn;
     

    TicTacToe() {
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(Color.GRAY);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textfield.setBackground(Color.black);
        textfield.setForeground(Color.black);
        textfield.setFont(new Font("Arial", Font.BOLD, 50));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Tic Tac Toe");
        textfield.setOpaque(true);

        titlepanel.setLayout(new BorderLayout());
        titlepanel.setBounds(0, 0, 800, 100);
        
        titlepanel.add(textfield);
        frame.add(titlepanel,BorderLayout.NORTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void first() {

    }

    public void check(){

    }

    public void xWins(int a, int b, int c){

    }

    public void oWins(){

    }
}
