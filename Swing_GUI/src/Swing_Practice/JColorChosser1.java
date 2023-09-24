package Swing_Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JColorChosser1 extends JFrame implements ActionListener {

    JButton b;
    JLabel l;

    JColorChosser1(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        b=new JButton("select a color");
        b.setFocusable(false);
        b.addActionListener(this);
        l=new JLabel();
        l.setBackground(Color.WHITE);
        l.setText("LOVE YOU 3000");
        l.setFont(new Font("MV Boli",Font.PLAIN,100));
        l.setOpaque(true);

        this.add(b);
        this.add(l);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b){
            JColorChooser c=new JColorChooser();

            Color color=JColorChooser.showDialog(null,"pick a color",Color.black);
           // l.setForeground(color);
            l.setBackground(color);
        }
    }
}
