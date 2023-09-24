package MyPractice;
import java.io.*;
public class Display_word {
    public static void main(String[] args) {
        File f=new File("myfile1.txt");
        System.out.println("File name: "+f.getName());
        System.out.println("path name: "+f.getPath());
        System.out.println("parent name: "+f.getParent());
        System.out.println("File name: "+f.isFile());
        System.out.println(" length : "+f.length());
        System.out.println("File name: "+f.isAbsolute());
        System.out.println("File name: "+f.isDirectory());
    }
}
