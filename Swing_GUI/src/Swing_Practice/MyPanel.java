package Swing_Practice;

import javax.swing.*;
import java.awt.*;

public class MyPanel {
    //JPanel = a GUI component that function as a container to hold other component
    public static void main(String[] args) {
        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("1.png"));

        JLabel l=new JLabel();
        l.setText("AVISHKAR");
        l.setIcon(i);
      //  l.setVerticalAlignment(JLabel.BOTTOM);
      //  l.setHorizontalAlignment(JLabel.RIGHT);
        l.setBounds(0,0,50,50);

        JPanel p=new JPanel();
        p.setBackground(Color.red);
        p.setBounds(0,0,250,250);
        p.setLayout(null);

        JPanel p1=new JPanel();
        p1.setBackground(Color.blue);
        p1.setBounds(250,0,250,250);
        p1.setLayout(null);

        JPanel p2=new JPanel();
        p2.setBackground(Color.green);
        p2.setBounds(250,250,250,250);
        p2.setLayout(new BorderLayout());
        p2.setLayout(null);

        JPanel p3=new JPanel();
        p3.setBackground(Color.orange);
        p3.setBounds(0,250,250,250);
        p3.setLayout(null);
        JFrame f=new JFrame();
        f.setSize(750,750);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        p.add(l);
        f.add(p);
        f.add(p1);
        f.add(p2);
        f.add(p3);
        f.setVisible(true);
    }
}
