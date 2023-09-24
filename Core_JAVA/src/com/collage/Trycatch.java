package com.collage;

import java.util.Scanner;

public class Trycatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=120;
        int b=0;
        try{
            int[] arr ={1,2,3};
            //int c=a/b;
           // System.out.println(c);
            System.out.println(arr[10]);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
