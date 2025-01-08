import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.*;

public class TicTacToe implements ActionListener {

    JFrame frame = new JFrame();

    TicTacToe() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 300);
        frame.setLayout(new BorderLayout());
        frame.add(new JLabel("Tic Tac Toe"), BorderLayout.NORTH);
        frame.setVisible(true);
        frame.setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void first() {

    }
}
