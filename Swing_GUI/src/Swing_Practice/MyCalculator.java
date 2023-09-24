package Swing_Practice;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyCalculator implements ActionListener {
    JFrame f;
    JTextField t;
    JButton [] b=new JButton[10];
    JButton[] function =new JButton[9];//for addition,sub,div
    JButton add,sub,div,mul;
    JButton dec,eq,del,clr,neg;
    JPanel p;

    Font myfont=new Font("Droid Sans Mono",Font.BOLD,25);

    double n1=0,n2=0,result=0;
    char operator;

    MyCalculator(){

        f=new JFrame("Calculator");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(420,550);
        f.setLayout(null);
        f.setResizable(false);

        t=new JTextField();
        t.setBounds(50,25,300,50);
        t.setFont(myfont);
        t.setEditable(false);//when we set it false we cannot type anything

        add=new JButton("+");
        sub=new JButton("-");
        mul=new JButton("*");
        div=new JButton("/");
        dec=new JButton(".");
        eq=new JButton("=");
        del=new JButton("Delete");
        clr=new JButton("Clear");
        neg=new JButton("(-)");

        function[0]=add;
        function[1]=sub;
        function[2]=mul;
        function[3]=div;
        function[4]=dec;
        function[5]=eq;
        function[6]=del;
        function[7]=clr;
        function[8]=neg;

        for(int i=0;i<9;i++){
            function[i].addActionListener(this);
            function[i].setFont(myfont);
            function[i].setFocusable(false);
        }
        for(int i=0;i<10;i++){
            b[i]=new JButton(String.valueOf(i));
            b[i].addActionListener(this);
            b[i].setFont(myfont);
            b[i].setFocusable(false);
            b[i].setBackground(Color.BLACK);
            b[i].setForeground(Color.white);
        }

        neg.setBounds(50,430,100,50);
        del.setBounds(150,430,100,50);
        clr.setBounds(250,430,100,50);

        p=new JPanel();
        p.setBounds(50,100,300,300);
        p.setLayout(new GridLayout(4,4,10,10));
       // p.setBackground(Color.gray);
        p.add(b[1]);
        p.add(b[2]);
        p.add(b[3]);
        p.add(add);
        p.add(b[4]);
        p.add(b[5]);
        p.add(b[6]);
        p.add(sub);
        p.add(b[7]);
        p.add(b[8]);
        p.add(b[9]);
        p.add(mul);
        p.add(dec);
        p.add(b[0]);
        p.add(eq);
        p.add(div);

        f.add(p);
        f.add(del);
        f.add(clr);
        f.add(neg);
        f.add(t);
        f.setVisible(true);

    }
    public static void main(String[] args) {
        MyCalculator cal=new MyCalculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0;i<10;i++){
            if(e.getSource()==b[i]){
                t.setText(t.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource()==dec){
            t.setText(t.getText().concat("."));
        }
        if (e.getSource()==add){
            n1=Double.parseDouble(t.getText());
            operator = '+';
            t.setText("");
        }
        if (e.getSource()==sub){
            n1=Double.parseDouble(t.getText());
            operator = '-';
            t.setText("");
        }
        if (e.getSource()==mul){
            n1=Double.parseDouble(t.getText());
            operator = '*';
            t.setText("");
        }
        if (e.getSource()==div){
            n1=Double.parseDouble(t.getText());
            operator = '/';
            t.setText("");
        }
        if(e.getSource()==eq){
            n2=Double.parseDouble(t.getText());

            switch (operator){
                case '+':
                    result=n1+n2;
                    break;
                case '-':
                    result=n1-n2;
                    break;
                case '*':
                    result=n1*n2;
                    break;
                case '/':
                    result=n1/n2;
                    break;
            }
            t.setText(String.valueOf(result));//settext also ise for update textfield
            n1=result;
        }
        if(e.getSource()==clr){
            t.setText("");
        }
        if(e.getSource()==del){
            String str=t.getText();
            t.setText("");
            for (int i=0;i<str.length()-1;i++){
                t.setText(t.getText()+str.charAt(i));
            }
        }
        if(e.getSource()==neg){
            double temp=Double.parseDouble(t.getText());
            temp *= -1;
            t.setText(String.valueOf(temp));
        }
    }
}
