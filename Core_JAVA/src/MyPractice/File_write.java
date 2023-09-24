package MyPractice;
import java.io.*;
public class File_write {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("myfile1.txt");
            f.write("Tony Stark is IRONMAN");
            f.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
