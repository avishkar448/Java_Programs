package Swing_Practice;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

//JSlider = GUI component that user enter a value by using an adjustable sliding knob
//          on a track
public class JSlider12 implements ChangeListener {
    JFrame f;
    JPanel p;
    JLabel l;
    JSlider s;
    JSlider12(){
        f=new JFrame("slider demo");
        p=new JPanel();
        l=new JLabel();
        s=new JSlider(0,100,50);//min,max

        s.setPreferredSize(new Dimension(400,200));
        s.setPaintTicks(true);
        s.setMinorTickSpacing(10);

        s.setPaintTrack(true);
        s.setMajorTickSpacing(25);
        s.setPaintLabels(true);//It gives number to major text not miner text
        s.setFont(new Font("MV Boli",Font.PLAIN,20));
        l.setFont(new Font("MV Boli",Font.PLAIN,25));
        s.setOrientation(SwingConstants.VERTICAL);

        l.setText("% ="+s.getValue());
        s.addChangeListener(this);

        p.add(s);
        p.add(l);
        f.add(p);
        f.setSize(420,420);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        l.setText("% ="+s.getValue());
    }


}
