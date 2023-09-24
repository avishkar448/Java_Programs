package MyPractice;
import java.io.*;
public class File_Create {
    public static void main(String[] args) {
        File f=new File("myfile3.txt");
        try{
            f.createNewFile();
            System.out.println("File has been created");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
