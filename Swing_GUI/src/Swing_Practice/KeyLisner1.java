package Swing_Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyLisner1 extends JFrame implements KeyListener {
    JLabel l;
    KeyLisner1(){
        this.setSize(500,500);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l=new JLabel();
        l.setBounds(0,0,100,100);
        l.setBackground(Color.red);
        l.setOpaque(true);

        this.add(l);
        this.addKeyListener(this);
        this.setVisible(true);
    }

    @Override
    //invoke when key is typed
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()){
           case 'a': l.setLocation(l.getX()-10,l.getY());
            break;
            case 'w':l.setLocation(l.getX(),l.getY()-10);
            break;
            case 's':l.setLocation(l.getX(),l.getY()+10);
            break;
            case 'd':l.setLocation(l.getX()+10,l.getY());
            break;
        }
    }

    @Override
    //invoke when physical key is pressed
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case 37: l.setLocation(l.getX()-10,l.getY());
                break;
            case 38:l.setLocation(l.getX(),l.getY()-10);
                break;
            case 39:l.setLocation(l.getX(),l.getY()+10);
                break;
            case 40:l.setLocation(l.getX()+10,l.getY());
                break;
        }
    }

    @Override
    //called whenever a button is released
    public void keyReleased(KeyEvent e) {
        System.out.println("You released key charecter "+e.getKeyChar());
        System.out.println("You released key code "+e.getKeyCode());
    }
}
