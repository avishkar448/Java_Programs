package Swing_Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class KeyBinding_game {
    JFrame f;
    JLabel l;

    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;
    KeyBinding_game(){
      f=new JFrame("KeyBinding Demo");
      f.setSize(420,420);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setLayout(null);

      l=new JLabel();
      l.setBackground(Color.red);
      l.setBounds(100,100,100,100);
      l.setOpaque(true);

      upAction=new upAction();
      downAction=new downAction();
      leftAction=new leftAction();
      rightAction=new RightAction();

      l.getInputMap().put(KeyStroke.getKeyStroke("UP"),"upAction");
      l.getActionMap().put("upAction",upAction);

      l.getInputMap().put(KeyStroke.getKeyStroke("DOWN"),"downAction");
      l.getActionMap().put("downAction",downAction);

      l.getInputMap().put(KeyStroke.getKeyStroke("LEFT"),"leftAction");
      l.getActionMap().put("leftAction",leftAction);

      l.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"),"rightAction");
      l.getActionMap().put("rightAction",rightAction);

      f.add(l);
      f.setVisible(true);
    }
    public class upAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            l.setLocation((l.getX()),(l.getY()-10));
        }
    }
    public class downAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e) {
            l.setLocation((l.getX()),(l.getY()+10));
        }
    }
    public class leftAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            l.setLocation((l.getX()-10),(l.getY()));
        }
    }
    public class RightAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            l.setLocation((l.getX()+10),(l.getY()));
        }
    }
}
