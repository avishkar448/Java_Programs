package com.collage;
import java.util.Scanner;
public class meth_fib {
    static int  fib(int n){
      /*  if(n==1){
            return 0;
        } else if (n==2) {
            return 1;
        }*/
        if(n==1 || n==2){
            return n-1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int a=sc.nextInt();

        int result=fib(a);
        System.out.println(result);


    }
}
