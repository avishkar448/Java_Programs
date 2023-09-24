package Java_Exam;

class avi extends Thread{
    public void run(){
        for(char i='A';i<='Z';i++){
            try{
                System.out.println(i);
                Thread.sleep(3000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

public class ThreadChar {
    public static void main(String[] args){
        avi t =new avi();
        t.start();

    }
}
