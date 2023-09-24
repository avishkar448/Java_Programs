package com.collage;
import java.util.*;
import java.io.*;
public class Content_raverse {
    public static void main(String[] args) throws IOException{
        FileReader f=new FileReader("avis.txt");
        Scanner sc=new Scanner(System.in);
        String a, b;
        while(sc.hasNextInt()){
            StringBuilder c=new StringBuilder();
            a=sc.next();
            b=a.toUpperCase();
            c.append(b);
            c.reverse();
            System.out.println(c);
        }
        f.close();
    }
}
