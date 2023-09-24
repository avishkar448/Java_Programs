package com.collage;
import java.io.*;
import java.util.Scanner;

public class File_read {
    public static void main(String[] args) throws Exception {
        File f=new File("avi.txt");
        try{
            Scanner sc=new Scanner(f);
            while(sc.hasNextLine()){
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
