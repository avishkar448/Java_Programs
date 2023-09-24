package com.collage;

import java.util.Scanner;

public class try21 {
    public static void main(String[] args) {
        int [] marks=new int[5];
        marks[0]=70;
        marks[1]=90;
        marks[2]=80;
        marks[3]=60;
        marks[4]=100;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind=sc.nextInt();

        System.out.println("Enter the number you want to divide ");
        int n= sc.nextInt();

        try{
            System.out.println("The value of your index: "+marks[ind]);
            System.out.println("Division of marks and number : "+marks[ind]/n);
        }
        catch (ArithmeticException e){
            System.out.println("Its a Arithmatic exception");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("your array index is out of bound");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("some other error occure ");
            System.out.println(e);
        }
    }
}
