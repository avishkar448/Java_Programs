package com.collage;
class Weakup extends Thread{
    public void run(){
        //while(true) {
            System.out.println("good morning");
        //}
    }
}
class Weakup1 extends Thread{
    public void run(){
       // while(true) {
            System.out.println("welcome");
         /*   try{
                Thread.sleep(200);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }
//}
public class Thread_practice {
    public static void main(String[] args) {
        Weakup w=new Weakup();
        Weakup1 w1=new Weakup1();

        w.setPriority(7);
        w1.setPriority(9);
        System.out.println(w.getPriority());
        System.out.println(w1.getPriority());


        w.start();
        System.out.println(w.getState());
        System.out.println(Thread.currentThread());
        w1.start();
        System.out.println(w1.getState());
    }
}
