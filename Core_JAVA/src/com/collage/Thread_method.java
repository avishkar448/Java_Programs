package com.collage;
class Me extends Thread{
    public Me(String Name){
        super(Name);
    }
    public void run(){
        int i=0;
        while(true){
            System.out.println("Thank you:  ");
            i++;
        }

    }
}
class Me1 extends Thread{
    public void run(){
        int i=0;
        while(true){
            System.out.println("Welcome:  ");
            try {
                Thread.sleep(20);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            //i++;
        }
    }
}
public class Thread_method {
    public static void main(String[] args) {
        Me m=new Me("Avishkar");
        Me1 n=new Me1();
      /*  try {
            m.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
*/
        m.start();
        n.start();
    }
}
