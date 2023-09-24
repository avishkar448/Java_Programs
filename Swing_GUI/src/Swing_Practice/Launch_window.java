package Swing_Practice;

import javax.swing.*;
import java.awt.*;

public class Launch_window {
    JFrame f=new JFrame();
    JLabel l=new JLabel("LOVE YOU 3000");

    Launch_window(){
        l.setBounds(150,150,150,75);
        l.setFont(new Font("MV Boli",Font.BOLD,20));
        l.setForeground(Color.BLACK);
        l.setBackground(Color.pink);
        l.setOpaque(true);

        f.setSize(500,500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(l);
        f.setVisible(true);

    }
}
