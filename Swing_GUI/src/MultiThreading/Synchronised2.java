package MultiThreading;
class A extends Thread{
    synchronized void display(){
        try {
            for (int i = 0; i < 10; i++) {

                System.out.println("Virat Kohli!!");
                Thread.sleep(2000);
            }
        }
        catch (Exception e){
            e.printStackTrace();

        }    }
}
class B extends Thread{
    synchronized void display(){
        for (int i=0;i<10;i++){
            System.out.println("RCB!");
        }
    }
}
public class Synchronised2 {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();

        a.start();
        b.start();
        a.display();
        b.display();
    }
}
