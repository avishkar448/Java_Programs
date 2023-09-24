package com.collage;
class Myclass1 implements Runnable{

    public void run(){
        System.out.println("HII WELCOME!!!!");
    }
}
public class Thread_constructor1 {
    public static void main(String[] args) {
       // Myclass1 m=new Myclass1();
        Runnable r=new Myclass1();
        Thread s=new Thread(r,"AVISHKAR");

        s.start();
        System.out.println("Hmmmm " +s.getName());

        }
    }

