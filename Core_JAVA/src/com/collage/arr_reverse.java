package com.collage;
import java.util.Scanner;
public class arr_reverse {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("How many number do you want to insert ? :");
        n=sc.nextInt();
        int[] a =new int [n];
        System.out.println("Enter the element : ");

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        for(int i=a.length-1;i>=0;i--){
            System.out.print("reverse order of array is: ");
            System.out.println(+a[i]);
        }
    }
}
