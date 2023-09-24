package com.collage;
import java.util.Scanner;
public class arg_avg {
    static int average(int...arr){
      int sum=0;
      for(int element: arr ){
          sum +=element;
      }
      return sum;
    }

    public static void main(String[] args) {
        Scanner ac=new Scanner(System.in);
        System.out.println("how many number do you want to print in first array: ");
        int n=ac.nextInt();

        int[] a =new int[n];
        System.out.println("enter the element in first array: ");

        for(int i=0;i<n;i++){
            a[i]=ac.nextInt();
        }



    }
}
