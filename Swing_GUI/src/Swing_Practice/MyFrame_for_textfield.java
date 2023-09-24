package Swing_Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame_for_textfield extends JFrame implements ActionListener {
    JTextField t;
    JButton b;
    MyFrame_for_textfield(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         b=new JButton("Submit");
         b.setFocusable(false);
         b.addActionListener(this);

         t=new JTextField();
         t.setPreferredSize(new Dimension(250,40));
         t.setFont(new Font("Consolas",Font.BOLD,25));
         t.setForeground(Color.GREEN);
         t.setBackground(Color.black);
         t.setCaretColor(Color.WHITE);
         t.setText("Name");
      //   t.setEditable(false);

        this.add(b);
        this.add(t);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b){
            System.out.println("welcome "+t.getText());
            b.setEnabled(false);
            t.setEditable(false);
        }
    }
}
