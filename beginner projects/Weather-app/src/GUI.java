import javax.swing.*;

public class GUI extends JFrame{
        public GUI(){
            //setup our GUI
            super("Weather App"); //title of our app

            //configuration of GUI 
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(800, 600); //width and height of our app
            this.setLocationRelativeTo(null); //sets the frame at the center 
            this.setVisible(true); //makes the frame visible
            this.setResizable(false);//prevents the window to be resizeable
    }
}
