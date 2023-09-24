package Swing_Practice;

import javax.swing.*;
import java.awt.*;

public class Myframe4 {
    public static void main(String[] args) {
        JButton b=new JButton("Click");
        b.setBounds(200,100,50,50);
        b.setForeground(Color.black);
        b.setBackground(Color.red);
        b.setFocusable(false);

        JFrame j=new JFrame();
        j.add(b);
        j.setSize(500,500);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setResizable(false);
        j.setLayout(null);
        j.setVisible(true);
    }
}
