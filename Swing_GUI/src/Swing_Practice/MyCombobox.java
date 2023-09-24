package Swing_Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCombobox extends JFrame implements ActionListener {
    JComboBox b;
    MyCombobox(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animal={"dog","cat","bird"};
         b=new JComboBox(animal);
        b.addActionListener(this);
       // b.setEditable(true);
       // System.out.println(b.getItemCount());
     //  b.addItem("horse");
        //    b.insertItemAt("pig",0);
        //    b.setSelectedIndex(1);
      //  b.removeItem("cat");
      //  b.removeItemAt(0);
        b.removeAllItems();
        this.add(b);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b){
           System.out.println("you select: "+b.getSelectedItem());
        //    System.out.println("you select: "+b.getSelectedIndex());
        }
    }
}
