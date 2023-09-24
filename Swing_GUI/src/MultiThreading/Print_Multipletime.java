package MultiThreading;

class Mythread implements Runnable{

  public void run(){
      try{
          for (int i=0;i<10;i++){
              System.out.println("I am boss: "+i);
              Thread.sleep(2000);
          }
      }
      catch (Exception e){
          e.printStackTrace();
      }
  }
}
class MyThread1 implements Runnable{
    public  void run(){
        try{
           for (int i=0;i<10;i++){
               System.out.println("*****************");
               Thread.sleep(2000);
           }
        }
        catch(Exception e){
            e.printStackTrace();

        }    }
}

public class Print_Multipletime {
    public static void main(String[] args) {
        Mythread t=new Mythread();
        MyThread1 t1=new MyThread1();

        Thread a=new Thread(t);
        Thread b=new Thread(t1);

        a.start();
        b.start();

    }
}
