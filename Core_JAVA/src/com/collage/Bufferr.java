package com.collage;

import java.io.*;
public class Bufferr {
    public static void main(String[] args) throws Exception {
        String name;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //InputStreamReader r=new InputStreamReader(System.in);
        System.out.println("Enter your name: ");
         name=br.readLine();
        System.out.println("Your name: "+name);
    }
}
