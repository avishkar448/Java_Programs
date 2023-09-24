package Swing_Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animation_Panel extends JPanel implements ActionListener {
    final int width=500;
    final int height=500;
    Image ball;
    Image ib;
    Timer timer;
    int xVelocity=1;
    int yVelocity=1;
    int x=0;
    int y=0;

    Animation_Panel(){
        this.setPreferredSize(new Dimension(width,height));
        this.setBackground(Color.BLACK);
        ball=new ImageIcon("300.png").getImage();
        timer =new Timer(100,null);
        timer.start();
    }
    public void paint(Graphics g){

        super.paint(g);//paint background
        Graphics2D g2D=(Graphics2D) g;
        g2D.drawImage(ball,x,y,null);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(x>width-ball.getWidth(null)){
            xVelocity =xVelocity *-1;
        }
        x += xVelocity;
        repaint();
    }
}
