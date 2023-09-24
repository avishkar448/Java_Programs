package MyPractice;
import java.io.*;
public class Write {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("xyz.txt");
            f.write("I am Iron man");
            f.close();
        }
        catch (IOException e){
            e.printStackTrace();

        }
    }
}
