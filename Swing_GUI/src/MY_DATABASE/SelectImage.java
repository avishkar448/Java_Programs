package MY_DATABASE;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.util.*;

public class SelectImage {
    public static void main(String[] args) {

        JLabel l=new JLabel();
        l.setBounds(100,250,50,50);
        l.setBackground(Color.BLACK);

        JButton b=new JButton();
        b.setBounds(300,160,70,35);
        b.setFocusable(false);
        b.setFont(new Font("Consolas",Font.BOLD,10));
        b.setText("Submit");

        JTextField t=new JTextField();
        t.setBounds(100,150,175,50);
        t.setFont(new Font("Consolas",Font.BOLD,25));

        JFrame f=new JFrame();
        f.add(l);
        f.add(t);
        f.add(b);
        f.setSize(750,500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
