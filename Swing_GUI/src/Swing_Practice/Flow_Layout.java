package Swing_Practice;

import javax.swing.*;
import java.awt.*;

public class Flow_Layout {
    public static void main(String[] args) {
        //Flowlayout= place component in a row ,size at their preffered size ,
        // if the horizontal space in the container is too small ,
        //the flowed layout class uses the next available row
        JFrame f=new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

        JPanel p=new JPanel();
        p.setPreferredSize(new Dimension(100,250));
        p.setBackground(Color.orange);
        p.setLayout(new FlowLayout());

        p.add(new JButton("1"));
        p.add(new JButton("2"));
        p.add(new JButton("3"));
        p.add(new JButton("4"));
        p.add(new JButton("5"));
        p.add(new JButton("6"));
        p.add(new JButton("7"));
        p.add(new JButton("8"));
        p.add(new JButton("9"));

        f.add(p);
        f.setVisible(true);
    }
}
