package Swing_Practice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Menubar_Creation extends JFrame implements ActionListener {
    JMenuBar mb;
    JMenu file;
    JMenu edit;
    JMenu help;
    ImageIcon i;

    JMenuItem l1;
    JMenuItem l2;
    JMenuItem l3;
    Menubar_Creation(){
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        JMenuBar mb=new JMenuBar();
        JMenu file=new JMenu("File");
        JMenu edit=new JMenu("Edit");
        JMenu help=new JMenu("Help");

        //i=new ImageIcon(ClassLoader.getSystemResource("1.png"));
         l1=new JMenuItem("Load");
         l2=new JMenuItem("save");
         l3=new JMenuItem("exit");

        file.setMnemonic(KeyEvent.VK_F);//use Alt+f
        edit.setMnemonic(KeyEvent.VK_B);
        help.setMnemonic(KeyEvent.VK_A);

         l1.setMnemonic(KeyEvent.VK_L);//it is used for keyboard shortcut
         l2.setMnemonic(KeyEvent.VK_E);
         l3.setMnemonic(KeyEvent.VK_H);

        l1.addActionListener(this);
        l2.addActionListener(this);
        l3.addActionListener(this);
        //l1.setIcon(i);

        file.add(l1);
        file.add(l2);
        file.add(l3);

        mb.add(file);
        mb.add(edit);
        mb.add(help);


        this.setJMenuBar(mb);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==l1){
            System.out.println("load a file");
        }
        else if(e.getSource()==l2){
            System.out.println("Edit ");
        }
        else if (e.getSource()==l3) {
           System.exit(0);

        }
    }
}
