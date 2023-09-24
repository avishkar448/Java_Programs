package Swing_Practice;

import javax.swing.*;
import java.awt.*;

public class MyTimepass {
    public static void main(String[] args) {
        JButton b=new JButton();
        b.setBounds(50,75,150,80);
        b.setText("Avishkar");
        b.setVisible(true);
        b.setFocusable(false);
        b.setBackground(Color.green);
        b.setForeground(Color.orange);
        b.setFont(new Font("Comic Sans",Font.BOLD,20));
        b.setBorder(BorderFactory.createEtchedBorder());

        JPanel p=new JPanel();
        p.setBounds(100,100,250,250);
        p.setLayout(null);
        p.setBackground(new Color(0x414192));
        p.setVisible(true);
        p.add(b);

        JFrame f=new JFrame();
        f.setSize(500,500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setResizable(false);
        f.add(p);
    }
}
