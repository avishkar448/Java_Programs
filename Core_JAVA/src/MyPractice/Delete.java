package MyPractice;
import java.io.*;

public class Delete {
    public static void main(String[] args) {
        File f=new File("xyz.txt");
        if(f.delete()){
            System.out.println("delete: "+f.getName());
        }
        else {
            System.out.println("not delete due to some error");
        }
    }
}
