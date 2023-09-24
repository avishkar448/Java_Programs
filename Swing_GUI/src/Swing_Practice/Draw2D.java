package Swing_Practice;

import javax.swing.*;
import java.awt.*;

public class Draw2D extends JFrame {
    MyPanel_draw p;
    Draw2D(){
        p=new MyPanel_draw();
        this.add(p);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

}
