package com.collage;
import java.util.Scanner;
import java.util.Arrays;
public class arr_merge2arr {
    public static void main(String[] arg){
        Scanner ac=new Scanner(System.in);
        System.out.println("how many number do you want to print in first array: ");
        int n=ac.nextInt();
        System.out.println("how many number do you want to print in second array: ");
        int m=ac.nextInt();

        int[] a =new int[n];
        System.out.println("enter the element in first array: ");

        for(int i=0;i<n;i++){
            a[i]=ac.nextInt();
        }
        int[] b =new int[m];
        System.out.println("enter the element in second array: ");

        for(int j=0;j<m;j++){
            b[j]=ac.nextInt();
        }

        //new array
        int[] new_array =new int[a.length + b.length];
        System.arraycopy(a, 0, new_array, 0, a.length);
        System.arraycopy(b, 0, new_array, 0, b.length);
        System.out.println();
    }
    }

