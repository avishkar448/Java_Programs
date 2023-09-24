package Swing_Practice;

import javax.swing.*;
import java.awt.*;

public class Grid_Layout {
    public static void main(String[] args) {
        //GridLayout= place component in grid of cell
        //            Each component takes all the available space within its cell,
        //            and each cell is the same size

        JFrame f=new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setLayout(new GridLayout(3,3,10,10));
        //JButton b1=new JButton();
        f.add(new JButton("1"));
        f.add(new JButton("2"));
        f.add(new JButton("3"));
        f.add(new JButton("4"));
        f.add(new JButton("5"));
        f.add(new JButton("6"));
        f.add(new JButton("7"));
        f.add(new JButton("8"));
        f.add(new JButton("9"));
        f.add(new JButton("10"));

        f.setVisible(true);
    }
}
