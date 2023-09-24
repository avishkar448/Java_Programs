package com.collage;
import java.util.*;


public class Fibbonaci_Series {
    public static int fib(int n){
        if(n<=1){
            return n;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.print(fib(i)+ " ");
        }




       /*Iterative Method
        int n1=0,n2=1;
        int temp=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();

        while (temp<=n){
            System.out.println("Fibonacci Series: ");
            System.out.print(n1 +" ");

            //swap
            int n3=n2+n1;
            n1=n2;
            n2=n3;
            temp=temp+1;

    }*/
    }
}
