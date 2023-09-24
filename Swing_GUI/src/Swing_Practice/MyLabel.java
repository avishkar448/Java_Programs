package Swing_Practice;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyLabel {
    public static void main(String[] args) {

     //   ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("1.png"));
     //   Border b=BorderFactory.createLineBorder(Color.green,3);


        JLabel label=new JLabel();//create a label
     //   label.setText("Gaitonde");//set text of label
      //  label.setIcon(i);
        label.setForeground(Color.green);
        label.setHorizontalTextPosition(JLabel.CENTER);//set text left center right
        label.setVerticalTextPosition(JLabel.TOP);//Set text top bottom
        label.setFont(new Font("MV Boli",Font.PLAIN,50));
        label.setIconTextGap(-20);
        label.setBackground(Color.black);//set Background color
        label.setOpaque(true);//display background color
 //       label.setBorder(b);
        label.setVerticalAlignment(JLabel.CENTER);//SET vertical position of icon text
        label.setHorizontalAlignment(JLabel.CENTER);//set horizontal position of icon and text manager
        label.setBounds(100,100,400,400);//set x and y position

        JFrame f=new JFrame();
      //  f.setSize(500,500);
      //  f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(new Color(0xE6E0E0));
        f.setVisible(true);
        f.add(label);
        f.pack();//size of  the component resize
    }

}
