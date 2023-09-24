package com.collage;
import java.util.*;
public class Array_present {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many array element you want: ");
        int a = sc.nextInt();
        // System.out.println("Enter the numbers");
        int[] n = new int[a];
        System.out.println("Enter the array element: ");
        for (int i = 0; i < a; i++) {
            n[i] = sc.nextInt();
        }
        System.out.println("Array is: ");
        for (int i = 0; i < a; i++) {
            System.out.print(" " + n[i]);
            System.out.println();
        }
        System.out.println("Which number you want to check");
        int n2=sc.nextInt();
        boolean found =false;
        for (int ele:n) {
            if(ele==n2){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println(+n2 +" is found");
        }
        else{
            System.out.println(+n2 +" is not found");
        }


        /*int []b={32,54,53,78,65,44};
        System.out.println("Which number you want to check");
        int n2=sc.nextInt();
        boolean found =false;
        for (int element:b) {
            if (element==n2){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println(+n2 +" is found");
        }
        else {
            System.out.println(+n2 +" is not found");
        }*/
    }
}
