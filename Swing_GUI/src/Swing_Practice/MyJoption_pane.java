package Swing_Practice;

import javax.swing.*;
//JOptionPane=it use to inform about something
public class MyJoption_pane {
    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null,"This is information","title",JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null,"This is information","title",JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"This is information","title",JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null,"This is information","title",JOptionPane.ERROR_MESSAGE);
//        JOptionPane.showMessageDialog(null,"This is information","title",JOptionPane.QUESTION_MESSAGE);
 //       JOptionPane.showConfirmDialog(null,"hello bro","THOR",JOptionPane.YES_NO_CANCEL_OPTION);

//        String name=JOptionPane.showInputDialog("What is your name");
        String[] response={"NO","THANK YOU","HELLO"};
        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("1.png"));
        JOptionPane.showOptionDialog(null,"Love you 3000",
                "hello",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,
                i,response,0);
    }
}
