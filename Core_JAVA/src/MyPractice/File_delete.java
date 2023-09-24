package MyPractice;
import java.io.*;
public class File_delete {
    public static void main(String[] args) {
        File f=new File("myfile3.txt");
        if(f.delete()){
            System.out.println("Succesfully deleted : "+f.getName());
        }
        else {
            System.out.println("Not deleted due to some reason");
        }
    }
}
