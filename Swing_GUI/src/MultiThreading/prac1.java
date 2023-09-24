package MultiThreading;

import java.util.Scanner;

class My extends Thread{
    int n;
    String msg;
    My(String msg,int n){
        this.msg=msg;
        this.n=n;
    }
    public void run(){
       try{
           for(int i=0;i<n;i++){
               System.out.println(msg+" : "+i+" times");
           }
       }
       catch (Exception e){
           e.printStackTrace();
       }
    }
}
public class prac1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        My t=new My("COVID19",n);
        My t1=new My("LOCKDOWN2020",n+10);
        My t2=new My("VACCINATED2021",n+20);

        t.start();
        t1.start();
        t2.start();
    }
}
