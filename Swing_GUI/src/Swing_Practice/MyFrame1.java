package Swing_Practice;

import javax.swing.*;
import java.awt.*;

public class MyFrame1 extends JFrame{
    MyFrame1(){
        this.setTitle("My frame title");//set title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
        this.setResizable(false);
        this.setSize(420,420);//x-dimension and y-dimension
        this.setVisible(true);

        ImageIcon image=new ImageIcon("1.png");//create a image icon
        this.setIconImage(image.getImage());//change icon of frame
        this.getContentPane().setBackground(new Color(255, 0, 200));//change background color
    }
    }

