package com.collage;
import java.io.*;
public class File_create {
    public static void main(String[] args) {
        File f=new File("avi.txt");
        try{
            f.createNewFile();
            System.out.println("file has been crested");
        }
        catch (IOException e){
            System.out.println("file not create due to: ");
            System.out.println(e);
        }
    }
}
