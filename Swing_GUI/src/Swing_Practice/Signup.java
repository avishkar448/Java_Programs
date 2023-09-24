package Swing_Practice;

import javax.swing.*;
import java.awt.*;
public class Signup extends JFrame {

        JLabel l1,type,card,number,pin,pnumber,services;
        JRadioButton r1,r2,r3,r4;
        JCheckBox c1,c2,c3,c4,c5,c6,c7;
        JButton submit,cancel;

        Signup()
        {
            getContentPane().setBackground(Color.WHITE);
            l1 = new JLabel("page 3: Account Details");
            l1.setFont(new Font("Raleway",Font.BOLD,28));
            l1.setBounds(280,35,400,40);
            add(l1);

            type = new JLabel("Account Type:-");
            type.setFont(new Font("Raleway",Font.BOLD,22));
            type.setBounds(100,120,200,30);
            add(type);

            r1=new JRadioButton("Saving Account");
            r1.setFont(new Font("Raleway",Font.BOLD,16));
            r1.setBackground(Color.WHITE);
            r1.setBounds(100,160,200,30);
            add(r1);

            r2=new JRadioButton("Fix Deposite Account");
            r2.setFont(new Font("Raleway",Font.BOLD,16));
            r2.setBackground(Color.WHITE);
            r2.setBounds(350,160,200,30);
            add(r2);

            r3=new JRadioButton("Current Account");
            r3.setFont(new Font("Raleway",Font.BOLD,16));
            r3.setBackground(Color.WHITE);
            r3.setBounds(100,200,200,30);
            add(r3);

            r4=new JRadioButton("Raccuring Account");//for tax account
            r4.setFont(new Font("Raleway",Font.BOLD,16));
            r4.setBackground(Color.WHITE);
            r4.setBounds(350,200,200,30);
            add(r4);

            ButtonGroup accountgroup = new ButtonGroup();
            accountgroup.add(r1);
            accountgroup.add(r2);
            accountgroup.add(r3);
            accountgroup.add(r4);

            card = new JLabel("Card no:-");
            card.setFont(new Font("Raleway",Font.BOLD,22));
            card.setBounds(100,280,200,30);
            add(card);

            number = new JLabel("xxxx-xxxx-xxxx-8549");
            number.setFont(new Font("Raleway",Font.BOLD,22));
            number.setBounds(330,280,300,30);
            add(number);

            pin = new JLabel("PIN:-");
            pin.setFont(new Font("Raleway",Font.BOLD,22));
            pin.setBounds(100,350,200,30);
            add(pin);

            pnumber = new JLabel("xxxx");
            pnumber.setFont(new Font("Raleway",Font.BOLD,22));
            pnumber.setBounds(330,350,300,30);
            add(pnumber);

            services = new JLabel("Services Required:-");
            services.setFont(new Font("Raleway",Font.BOLD,22));
            services.setBounds(100,400,300,30);
            add(services);

            c1=new JCheckBox("ATM Card");
            c1.setFocusable(false);
            c1.setBounds(330,400,100,50);
            c1.setFont(new Font("Raleway",Font.BOLD,15));
            c1.setBackground(Color.WHITE);
            this.add(c1);


            c2=new JCheckBox("Internet Banking");
            c2.setFocusable(false);
            c2.setBounds(430,400,200,50);
            c2.setFont(new Font("Raleway",Font.BOLD,15));
            c2.setBackground(Color.WHITE);
            this.add(c2);

           c3=new JCheckBox("Mobile Banking");
            c3.setFocusable(false);
            c3.setBounds(330,430,150,50);
            c3.setFont(new Font("Raleway",Font.BOLD,15));
            c3.setBackground(Color.WHITE);
            this.add(c3);

            c4=new JCheckBox("Email alerts");
            c4.setBackground(Color.WHITE);
            c4.setFont(new Font("Raleway",Font.BOLD,16));
            c4.setBounds(430,480,200,30);
            this.add(c4);

            c5=new JCheckBox("check book");
            c5.setBackground(Color.WHITE);
            c5.setFont(new Font("Raleway",Font.BOLD,16));
            setBounds(100,580,200,30);
            add(c5);

            c6=new JCheckBox("A-Statement");
            c6.setBackground(Color.WHITE);
            c6.setFont(new Font("Raleway",Font.BOLD,16));
            setBounds(350,580,200,30);
            add(c6);

            c7=new JCheckBox("other");
            c7.setBackground(Color.WHITE);
            c7.setFont(new Font("Raleway",Font.BOLD,16));
            setBounds(100,660,200,30);
            add(c7);

            submit = new JButton("submit");
            submit.setBackground(Color.BLACK);
            submit.setForeground(Color.WHITE);
            submit.setFont(new Font("Raleway",Font.BOLD,20));
            submit.setBounds(420,720,100,30);
            add(submit);

            cancel = new JButton("cancel");
            cancel.setBackground(Color.BLACK);
            cancel.setForeground(Color.WHITE);
            cancel.setFont(new Font("Raleway",Font.BOLD,20));
            cancel.setBounds(460,720,100,30);
            add(cancel);

            setLayout(null);
            setBounds(250,0,800,700);
            setVisible(true);
        }


    public static void main(String[] args) {
        new Signup();
    }
}

