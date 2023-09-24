package MyPractice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWT_01 {
    AWT_01(){
        Frame f=new Frame("Avishakr");

        TextArea TA=new TextArea();
        TA.setBounds(250,40,200,200);
        f.add(TA);

        Label label=new Label("hello");
        label.setBackground(Color.CYAN);
        label.setBounds(20,90,150,30);
        f.add(label);

        TextField T=new TextField("avi");
        T.setBackground(Color.BLUE);
        T.setBounds(20,120,150,30);
        f.add(T);

        Button B=new Button("click");
        B.setBackground(Color.red);
        B.setForeground(Color.white);
        B.setBounds(20,40,80,30);

        Checkbox c=new Checkbox("java");
        Checkbox c1=new Checkbox("python");

        c.setBounds(20,120,50,30);
        c1.setBounds(20,150,50,30);

        f.add(c);
        f.add(c1);

        B.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("button click!!");
            }
        });

        f.add(B);

       f.setSize(500,500);
       f.setLayout(null);
       f.setVisible(true);
       f.addWindowListener(new WindowAdapter() {
           @Override
           public void windowClosing(WindowEvent e) {
               f.dispose();
           }
       });

    }
    public static void main(String[] args) {
        AWT_01 a=new AWT_01();
    }
}
