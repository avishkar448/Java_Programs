package MyPractice;
import java.io.*;
import java.util.*;
public class File_Read {
    public static void main(String[] args) {
        File f = new File("myfile1.txt");
        try {
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String line=sc.nextLine();
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
