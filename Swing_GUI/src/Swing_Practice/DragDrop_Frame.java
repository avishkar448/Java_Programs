package Swing_Practice;

import javax.swing.*;

public class DragDrop_Frame extends JFrame {
    DragDrop1 d=new DragDrop1();
    DragDrop_Frame(){
        this.add(d);
        this.setTitle("Drag Drop demo");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
