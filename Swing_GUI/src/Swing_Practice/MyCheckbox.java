package Swing_Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCheckbox extends JFrame implements ActionListener {
    JButton b;
    JCheckBox c;
    MyCheckbox(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

         b=new JButton();
        b.setText("submit");
        b.addActionListener(this);

        c=new JCheckBox();
        c.setText("apple");
        c.setFocusable(false);
        c.setFont(new Font("Consolas",Font.BOLD,20));

        this.add(b);
        this.add(c);
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b){
            System.out.println(c.isSelected());
        }
    }
}
