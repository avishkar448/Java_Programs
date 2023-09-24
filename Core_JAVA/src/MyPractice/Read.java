package MyPractice;
import java.io.*;
import java.util.*;

public class Read {
    public static void main(String[] args) {
        File f = new File("xyz.txt");
        try {
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String line=sc.nextLine();
                System.out.println(line);

            }
            sc.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
