package MultiThreading;


class avi12 implements Runnable{
    public void run(){


           try{
               for (int i=0;i<100;i++) {
                   System.out.println("Number : " + i);
                   Thread.sleep(2000);
               }
           }
           catch (Exception ex){
               ex.printStackTrace();
           }

    }
}
class avi34 extends Thread{
    char i;
    public void run(){
        try{
            for(i='A';i<='Z';i++){
                System.out.println(i);
                Thread.sleep(2000);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
public class Practice {

    public static void main(String[] args) {
        avi12 a=new avi12();
        avi34 b=new avi34();
        Thread t1=new Thread(a);

        t1.start();
        b.start();
    }
}
