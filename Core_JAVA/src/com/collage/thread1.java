package com.collage;
class MyThread1 extends Thread{
    @Override
    public void run(){
       // int i=0;
        while(true){
            System.out.println("I am IRONMAN");
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        // int i=0;
        while(true){
            System.out.println("I am BATMAN");
        }
    }
}
public class thread1 {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();

        t1.start();
        t2.start();
    }
}
