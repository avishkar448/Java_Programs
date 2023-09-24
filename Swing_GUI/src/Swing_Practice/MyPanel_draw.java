package Swing_Practice;

import javax.swing.*;
import java.awt.*;

public class MyPanel_draw extends JPanel {
    JPanel p;
    Image i;
    MyPanel_draw(){
        i=new ImageIcon("300.png").getImage();
        this.setPreferredSize(new Dimension(500,500));
    }
    public void paint(Graphics g){
        Graphics2D g2D=(Graphics2D)  g;

        g2D.setStroke(new BasicStroke(5));
      //  g2D.setColor(Color.BLUE);
      //  g2D.drawLine(0,0,500,500);
      //  g2D.drawRect(0,0,100,200);
      //  g2D.fillRect(0,0,100,200);
      //  g2D.setPaint(Color.ORANGE);
      //  g2D.drawOval(0,0,100,100);
      //  g2D.fillOval(0,0,100,100);

//        g2D.setPaint(Color.red);
//        g2D.drawArc(0,0,100,100,180,180);
//        g2D.fillArc(0,0,100,100,0,180);
//        g2D.setPaint(Color.WHITE);
//        g2D.fillArc(0,0,100,100,180,180);
//        int [] x={150,250,350};
//        int [] y={300,150,300};
//        g2D.setPaint(Color.yellow);
//        g2D.fillPolygon(x,y,3);

//        g2D.setPaint(Color.GREEN);
//        g2D.setFont(new Font("MV Boli",Font.BOLD,50));
//        g2D.drawString("You are winner ",50,50);

        g2D.drawImage(i,0,0,null);
    }
}
