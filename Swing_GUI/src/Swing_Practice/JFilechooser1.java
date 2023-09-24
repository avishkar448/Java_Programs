package Swing_Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

//JFileChooser = A GUI mechanism that lets a user choose a file
public class JFilechooser1 extends JFrame implements ActionListener {
    JButton b;
        JFilechooser1(){
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(new FlowLayout());

            b=new JButton("Select file");
            b.addActionListener(this);
            b.setFocusable(false);

            this.add(b);
            this.pack();
            this.setVisible(true);
        }
    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==b){
                JFileChooser fc=new JFileChooser();

              fc.setCurrentDirectory(new File("E:\\Movies"));
            //    int response=fc.showOpenDialog(null);//select file to open
                int response=fc.showOpenDialog(null);//select file to open

                if(response==JFileChooser.APPROVE_OPTION){
                    File f=new File(fc.getSelectedFile().getAbsolutePath());
                    System.out.println(f);

              }
            }
    }
}
