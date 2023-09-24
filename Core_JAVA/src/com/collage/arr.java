package com.collage;
import java.util.*;
public class arr {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("how many number you watn in array: ");
        int n=sc.nextInt();
        int[] a =new int[n];

        System.out.println("enter the no: ");
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
       /* System.out.println("your array: ");
        for (int i=0;i<n;i++){
            System.out.print(" "+a[i]);
        }*/
        for(int  ele:a){
            System.out.print(" "+ele);
        }
    }
}
