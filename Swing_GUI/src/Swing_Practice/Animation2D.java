package Swing_Practice;

import javax.swing.*;

public class Animation2D extends JFrame {
    Animation_Panel p;
    Animation2D(){
        p=new Animation_Panel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(p);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }
}
