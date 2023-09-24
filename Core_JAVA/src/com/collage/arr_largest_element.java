package com.collage;
import java.util.Scanner;
public class arr_largest_element {
    public static void main(String[] args) {
        int n,max=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of element in array");
        n=sc.nextInt();
        int[] a =new int [n];
        System.out.println("enter the element of array: ");

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("largest number is: "+max);
    }
}
