package Swing_Practice;

import javax.swing.*;
import java.awt.*;

public class MyImage {
    public static void main(String[] args) {

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("em/300.png"));
        Image i2=i1.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l=new JLabel(i3);
        l.setBounds(125,100,50,50);

        JFrame f=new JFrame();
        f.add(l);
        f.setSize(500,500);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
}
