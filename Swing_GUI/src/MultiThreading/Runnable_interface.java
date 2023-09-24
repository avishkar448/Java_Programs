package MultiThreading;

class avi implements Runnable{
    public void run(){
        int a=23;
        int b=30;
        int c=a+b;
        System.out.println("add: "+c);
    }
}
public class Runnable_interface {
    public static void main(String[] args) {
        avi12 a=new avi12();
        Thread t=new Thread(a);
        t.start();
    }
}
