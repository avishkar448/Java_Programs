package Swing_Practice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myframe_button extends JFrame  {
    JButton b;
    JLabel l;
    Myframe_button(){
        //ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("1.png"));
        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("3.png"));

        l=new JLabel();
        l.setIcon(i);
        l.setBounds(150,350,400,100);
        l.setVisible(false);

         b=new JButton();
        b.setBounds(150,150,200,100);
      //  b.addActionListener(e->b.setEnabled(false));
        b.addActionListener(e->l.setVisible(true));
        b.addActionListener(e-> System.out.println("Avishakr"));//short trick for action listner
        b.setText("IRONMAN");
        b.setFocusable(false);
       // b.setIcon(i);
        b.setHorizontalTextPosition(JButton.CENTER);
        b.setVerticalTextPosition(JButton.BOTTOM);
        b.setFont(new Font("Comic Sans",Font.BOLD,25));
        b.setIconTextGap(-1);
        b.setForeground(Color.blue);
        b.setBackground(Color.orange);
        b.setBorder(BorderFactory.createEtchedBorder());
      //  b.setEnabled(false);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700,700);
        this.setLayout(null);
        this.setVisible(true);
        this.add(b);
        this.add(l);
    }

 /*   @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b){

        }
    }*/
}



