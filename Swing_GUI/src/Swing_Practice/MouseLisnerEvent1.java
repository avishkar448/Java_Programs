package Swing_Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseLisnerEvent1 extends JFrame implements MouseListener {
    JLabel l;
    ImageIcon i1;
    ImageIcon i2;
    ImageIcon i3;
    ImageIcon i4;

    MouseLisnerEvent1(){
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);//image appear at middle
//        l=new JLabel();
//        l.setBounds(100,80,300,300);
//        l.setBackground(Color.red);
//        l.setOpaque(true);
//        this.add(l);

        i1=new ImageIcon(ClassLoader.getSystemResource("em/100.png"));
        i2=new ImageIcon(ClassLoader.getSystemResource("em/200.png"));
        i3=new ImageIcon(ClassLoader.getSystemResource("em/300.png"));
        i4=new ImageIcon(ClassLoader.getSystemResource("em/bike.png"));

        l=new JLabel();
        l.setIcon(i1);
        this.add(l);
        this.addMouseListener(this);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
      //  System.out.println("You clicked mouse");
    }

    @Override
    //invoke when mouse button has been pressed on component
    public void mousePressed(MouseEvent e) {
//        System.out.println("you pressed the mouse");
//        l.setBackground(Color.orange);
        l.setIcon(i4);

    }

    @Override
    //invoke when mouse button has benn released on component
    public void mouseReleased(MouseEvent e) {
  //      System.out.println("You release the mouse");
  //      l.setBackground(Color.green);
        l.setIcon(i1);
    }

    @Override
    //invoked when the mouse enter a component
    public void mouseEntered(MouseEvent e) {
    //    System.out.println("You enter in component");
        //  l.setBackground(Color.BLUE);
        l.setIcon(i2);
    }

    @Override
    //Invoked when the mouse exits a component
    public void mouseExited(MouseEvent e) {
        //System.out.println("you exit the component");
        //l.setBackground(Color.CYAN);
        l.setIcon(i3);
    }
}
