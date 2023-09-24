package com.collage;

import java.util.Scanner;

public class Nested_try {
    public static void main(String[] args) {
        int[] arr =new int[5];
        arr[0]=100;
        arr[1]=200;
        arr[2]=300;
        arr[3]=400;
        arr[4]=500;

        Scanner sc=new Scanner(System.in);

        boolean flag=true;
        while(flag){
            System.out.println("Enter the array index: ");
            int ind=sc.nextInt();

            System.out.println("Enter the number you want to divide: ");
            int n=sc.nextInt();
            try{
                System.out.println(" WELCOME");
                try {
                    System.out.println("The value of array index enter is:"+arr[ind]);
                    System.out.println("Division: "+1000/arr[ind]);
                    flag=false;

                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Array out of index");
                    System.out.println(e);
                }
                catch (ArithmeticException e){
                    System.out.println("Arithetic Error");
                    System.out.println(e);
                }
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("It is end of program");
        }
    }
}
