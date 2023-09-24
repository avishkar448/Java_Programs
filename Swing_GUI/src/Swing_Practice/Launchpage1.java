package Swing_Practice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Launchpage1 implements ActionListener {
    JFrame f=new JFrame();
    JButton b=new JButton("Click me");
    Launchpage1() {
        b.setBounds(150,150,200,75);
        b.setFocusable(false);
        b.addActionListener(this);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setLayout(null);
        f.add(b);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b){
            f.dispose();
            Launch_window lw= new Launch_window();
        }
    }
}
