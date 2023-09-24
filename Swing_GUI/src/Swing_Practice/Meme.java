package Swing_Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Meme extends JFrame implements MouseListener {
    JLabel l=new JLabel();
    ImageIcon i;
    ImageIcon i1;
    Meme(){
       i= new ImageIcon(ClassLoader.getSystemResource("priti.jpg"));
       i1= new ImageIcon(ClassLoader.getSystemResource("kabir.jpeg"));

       l=new JLabel();
       l.setIcon(i);
       this.setSize(700,500);
       this.addMouseListener(this);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setLayout(new FlowLayout());
       this.add(l);
    //   this.pack();
       this.setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        l.setIcon(i1);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
