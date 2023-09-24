package MultiThreading;

class Prac extends Thread{
    public void run(){
        try {
            int i=100;
            while (i>0){
                System.out.println(i);
                i--;
                Thread.sleep(2000);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
public class SetA_b {
    public static void main(String[] args) {
        Prac p=new Prac();
        p.start();
    }
}
