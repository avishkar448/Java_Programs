package com.collage;
import java.io.*;
import java.util.Scanner;

public class Perfect_number {
    public static void main(String[] args) throws Exception {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        int i=1;
        while(i<=n/2){
            if (n%i==0){
                sum+=i;
            }
            i++;
        }
        if(sum==n){
            System.out.println(n+ " is perfect number");
        }
        else{
            System.out.println(n+ " is not perfect number");
        }
    }
}
