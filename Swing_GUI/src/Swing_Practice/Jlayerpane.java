package Swing_Practice;

import javax.swing.*;
import java.awt.*;

public class Jlayerpane {
    public static void main(String[] args) {
        //JLayeredPane= Swing container that provide a third dimension
        //              for positioning components ex.depth,z-index
        //JLayeredPane l=new JLayeredPane();
        JLabel l1=new JLabel();
        l1.setOpaque(true);
        l1.setBackground(Color.BLUE);
        l1.setBounds(50,50,200,200);

        JLabel l2=new JLabel();
        l2.setBounds(100,100,200,200);
        l2.setBackground(Color.orange);
        l2.setOpaque(true);

        JLabel l3=new JLabel();
        l3.setOpaque(true);
        l3.setBackground(Color.RED);
        l3.setBounds(150,150,200,200);

        JLayeredPane j=new JLayeredPane();
        j.setBounds(0,0,500,500);
//        j.add(l1,JLayeredPane.DEFAULT_LAYER);
//        j.add(l2,JLayeredPane.DEFAULT_LAYER);
//        j.add(l3,JLayeredPane.DRAG_LAYER);

        j.add(l1,Integer.valueOf(0));
        j.add(l2,Integer.valueOf(0));
        j.add(l3,Integer.valueOf(1));

        JFrame f=new JFrame();
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.add(j);
        f.setVisible(true);
    }
}
