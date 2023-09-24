package Swing_Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragDrop1 extends JPanel {
    ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("em/100.png"));

    final int width=i.getIconWidth();
    final int height=i.getIconHeight();
    Point imagecorner ;
    Point prept;
    DragDrop1(){
            imagecorner=new Point(0,0);
            clickLisner c=new clickLisner();
            DragLisner d=new DragLisner();
            this.addMouseListener(c);
            this.addMouseMotionListener(d);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        i.paintIcon(this,g,(int )imagecorner.getX(),(int )imagecorner.getY());
    }
    private class clickLisner extends MouseAdapter{
        public void mousepressed(MouseEvent e){
            prept=e.getPoint();
        }
    }
    private class DragLisner extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e){
            Point currentPt=e.getPoint();
            imagecorner.translate(
                    (int )(currentPt.getX()-prept.getX()),
                    (int )(currentPt.getY()-prept.getY())
            );
            prept=currentPt;
            repaint();
        }
    }
}
//    ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icon/1.png"));
//    Image i5=i4.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
//    ImageIcon i6=new ImageIcon(i5);
//    JLabel Profile=new JLabel(i6);
//        Profile.setBounds(40,10,50,50);
//                p1.add(Profile);