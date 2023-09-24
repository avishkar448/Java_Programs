package Java_Exam;

class ravi extends Thread{
    public void run(){
        try{
            for(int i=0;i<50;i++){
                System.out.println("Examination");
                Thread.sleep(2000);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
public class multi {
    public static void main(String[] args) {
        ravi r=new ravi();
        r.start();
    }
}
