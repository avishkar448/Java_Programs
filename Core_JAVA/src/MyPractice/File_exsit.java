package MyPractice;
import java.io.*;
public class File_exsit {
    public static void main(String[] args) {
        File f=new File("myfile1.txt");
        if(f.exists()){
            System.out.println("File is exsist: "+f.getName());
            if(f.isFile()){
                System.out.println("Path: "+f.getPath());
                System.out.println("Name: "+f.getName());
                System.out.println("length: "+f.length());
                System.out.println("length: "+f.getParent());
            }
            else{
                System.out.println("It is directory: "+f.isDirectory());
                int filecount =f.list().length;
                System.out.println("File count : "+filecount);

            }
        }
        else{
            System.out.println("File is mot exsist");

        }    }
}
