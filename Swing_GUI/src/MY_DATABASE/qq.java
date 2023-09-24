package MY_DATABASE;

import javax.swing.*;
import java.awt.*;

public class qq extends JFrame {
    qq(){
        getContentPane().setBackground(Color.WHITE);

        JLabel l=new JLabel("Name: ");
        l.setBounds(20,50,100,25);
        l.setFocusable(false);
        this.add(l);

        this.setBackground(Color.WHITE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0,0,500,500);
        this.setLayout(null);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new qq();
    }
}
