package com.collage;
import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        System.out.println("--Before swap--");
        Scanner sc=new Scanner(System.in);

        System.out.println("The first number: ");
        float A=sc.nextFloat();

        System.out.println("The second  number: ");
        float B=sc.nextFloat();

        float temp= A;
        A=B;
        B=temp;

        System.out.println("--After swap--");
        System.out.println("The first number: "+A);
        System.out.println("The second number: "+B);

    }
}
