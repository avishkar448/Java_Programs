package MyPractice;
import java.io.*;
public class Create {
    public static void main(String[] args) throws Exception {
        File f=new File("xyz.txt");
        try{
            f.createNewFile();
            System.out.println("file has been created: "+f.getName());
        }
        catch (IOException e){
            System.out.println(e);

        }
    }
}
