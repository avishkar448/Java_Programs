package Swing_Practice;

import javax.swing.*;
import java.awt.*;

public class JProgressbar1 {
    //Progress bar =Visual aid to let the user know that operation is progress
    JFrame f=new JFrame();
    JProgressBar p=new JProgressBar();
    JProgressbar1(){
        p.setValue(0);
        p.setBounds(0,0,500,50);
        p.setStringPainted(true);//add percentage value of progress
        p.setFont(new Font("MV Boli",Font.BOLD,25));
        p.setForeground(Color.RED);
        p.setBackground(Color.black);

        f.add(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        fill();
    }

    public void fill()  {
        int count=0;

        while(count<=100) {
            p.setValue(count);
            try {
                Thread.sleep(150);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            count +=5;

        }
        p.setString("Done!!!");
    }
}
