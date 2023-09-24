package Java_Exam;
import java.io.*;

class MyThread extends Thread{
   public void run(){
       System.out.println("Hello I am Ironman!!");
   }
}
class MyThread1 implements Runnable{
    public void run(){
        System.out.println("My name is Thor !!");
    }
}
public class Thread12 {
    public static void main(String[] args) {

        MyThread t=new MyThread();
        t.start();
        MyThread1 t1=new MyThread1();
        Thread t2=new Thread(t1);
        t2.start();
    }
}
