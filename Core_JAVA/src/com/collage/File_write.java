package com.collage;
import java.io.*;
public class File_write {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("avi.txt");
            f.write("My name is avishkar\n I am a programmer");
            f.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
