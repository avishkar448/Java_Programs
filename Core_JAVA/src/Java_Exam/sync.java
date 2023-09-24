package Java_Exam;
import java.io.*;

class B extends Thread{
    synchronized void display(){
        try{
            for(char i='a';i<'f';i++){
                System.out.println(i);
                Thread.sleep(2000);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
class A extends Thread{
    synchronized void display(){
        for(int i=0;i<100;i++){
            System.out.println(i);
        }
    }
}

public class sync {
    public static void main(String[] args) {
         B b=new B();
         A a=new A();
         b.start();
         a.start();
         b.display();
         a.display();
    }
}
