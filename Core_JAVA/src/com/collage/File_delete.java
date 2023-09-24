package com.collage;
import java.io.*;
public class File_delete {
    public static void main(String[] args) {
        File f =new File("avi.txt");
        if(f.delete()){
            System.out.println("file has been deleted : "+f.getName());
        }
        else{
            System.out.println("Unable to delete");
        }
    }
}
