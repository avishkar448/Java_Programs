package Swing_Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyRadiobutton extends JFrame implements ActionListener {
    JRadioButton r1;
    JRadioButton r2;
    JRadioButton r3;
    ButtonGroup g;
    ImageIcon i;
    MyRadiobutton(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        i=new ImageIcon(ClassLoader.getSystemResource("1.png"));

         r1=new JRadioButton("pav bhaji");
         r2=new JRadioButton("Biryani");
         r3=new JRadioButton("veg pullav");

        r1.setFocusable(false);
        r2.setFocusable(false);
        r3.setFocusable(false);

         g=new ButtonGroup();
        g.add(r1);
        g.add(r2);
        g.add(r3);

        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);

        r1.setIcon(i);

        this.add(r1);
        this.add(r2);
        this.add(r3);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==r1){
            System.out.println("you order pav bhaji ");
        }
        else if(e.getSource()==r2){
            System.out.println("you order biryani ");
        }
        else if(e.getSource()==r3){
            System.out.println("you order veg pullav ");
        }
    }
}
