package com.collage;
import java.io.*;
import java.util.Scanner;

public class Filehandle {
    public static void main(String[] args) throws IOException {
      /*  File f=new File("myfile.txt");
        try {
            f.createNewFile();
            System.out.println("file create");
        }
        catch(IOException e){
            System.out.println("file not created");
        }

       */
       /* FileWriter f=new FileWriter("myfile.txt");
        try {
            f.write("My name is Avishkar\n I am king of my own world!!");
            f.close();
        }
        catch (IOException e){
            System.out.println("we cannot write in file: ");
            //System.out.println(e);
            e.printStackTrace();
        }

        */
       /* File f=new File("myfile.txt");
        //Scanner sc=new Scanner(System.in);
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

        */
        File f=new File("myfile.txt");
        if(f.delete()){
            System.out.println("file has been delete");
        }
        else{
            System.out.println("not delete ");
        }
    }
}
