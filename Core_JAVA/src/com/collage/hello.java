package com.collage;
import java.util.Scanner;
public class hello {
    public static void main(String[] arg){
        // System.out.println("what is your name :");
        //Scanner av= new Scanner(System.in);
        //String name=av.next();
        //System.out.println("hello "+ name +" Nice to meet you!!");
        System.out.println("Enter your number :");
        Scanner av= new Scanner(System.in);
        System.out.println(av.hasNextInt());
    }
}
