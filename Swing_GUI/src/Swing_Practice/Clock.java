package Swing_Practice;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Clock extends JFrame {

    SimpleDateFormat time,day,date;
    JLabel timel,dayl,datel;
    String t,d,da;
    Clock(){

        time=new SimpleDateFormat("hh:mm:ss a");
        day=new SimpleDateFormat("EEEE");
        date=new SimpleDateFormat("MMMMM dd ,yyyy");

        timel=new JLabel();
        timel.setFont(new Font("verdana",Font.BOLD,50));
        timel.setForeground(new Color(0x00FF00));
        timel.setBackground(Color.BLACK);
        timel.setOpaque(true);

        dayl=new JLabel();
        dayl.setFont(new Font("verdana",Font.BOLD,35));

        datel=new JLabel();
        datel.setFont(new Font("verdana",Font.BOLD,25));



        this.add(timel);
        this.add(dayl);
        this.add(datel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Clock");
        this.setLayout(new FlowLayout());
        this.setSize(350,200);
        //this.setResizable(false);
        this.setVisible(true);
        setTime();
    }
    public  void setTime(){
        while(true){
            t=time.format(Calendar.getInstance().getTime());
            timel.setText(t);

            d=day.format(Calendar.getInstance().getTime());
            dayl.setText(d);

            da=date.format(Calendar.getInstance().getTime());
            datel.setText(da);


            try{
                Thread.sleep(1000);
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        new Clock();
    }
}
