package Swing_Practice;

import javax.swing.*;
import java.awt.*;

public class Border_Layout {
    public static void main(String[] args) {
        //Border layout=it place component in five areas
        //north,south,west,East,center
        JFrame f=new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setLayout(new BorderLayout(10,10));//we add some margin and padding
        f.setVisible(true);

        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        JPanel p3=new JPanel();
        JPanel p4=new JPanel();
        JPanel p5=new JPanel();

        p1.setBackground(Color.orange);
        p2.setBackground(Color.RED);
        p3.setBackground(Color.BLUE);
        p4.setBackground(Color.GREEN);
        p5.setBackground(Color.YELLOW);

        p1.setPreferredSize(new Dimension(100,100));
        p2.setPreferredSize(new Dimension(100,100));
        p3.setPreferredSize(new Dimension(100,100));
        p4.setPreferredSize(new Dimension(100,100));
        p5.setPreferredSize(new Dimension(100,100));


//sub panel
        p5.setLayout(new BorderLayout());

        JPanel p6=new JPanel();
        JPanel p7=new JPanel();
        JPanel p8=new JPanel();
        JPanel p9=new JPanel();
        JPanel p10=new JPanel();

        p6.setBackground(Color.black);
        p7.setBackground(Color.darkGray);
        p8.setBackground(Color.pink);
        p9.setBackground(Color.white);
        p10.setBackground(Color.LIGHT_GRAY);

        p6.setPreferredSize(new Dimension(50,50));
        p7.setPreferredSize(new Dimension(50,50));
        p8.setPreferredSize(new Dimension(50,50));
        p9.setPreferredSize(new Dimension(50,50));
        p10.setPreferredSize(new Dimension(50,50));

        p5.add(p6,BorderLayout.NORTH);
        p5.add(p7,BorderLayout.SOUTH);
        p5.add(p8,BorderLayout.EAST);
        p5.add(p9,BorderLayout.WEST);
        p5.add(p10,BorderLayout.CENTER);

        f.add(p1,BorderLayout.NORTH);
        f.add(p2,BorderLayout.EAST);
        f.add(p3,BorderLayout.WEST);
        f.add(p4,BorderLayout.SOUTH);
        f.add(p5,BorderLayout.CENTER);

    }
}
