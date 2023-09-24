package MultiThreading;

public class Thread_class extends Thread{
    public static void main(String[] args) {
        Thread t=new Thread("Thread 1");
        t.start();
        System.out.println("Thread name: "+t.getName());

    }
}
