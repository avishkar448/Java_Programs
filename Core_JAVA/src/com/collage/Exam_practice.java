package com.collage;
import java.util.*;
public class Exam_practice {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("how many number you want in array: ");
        int a=sc.nextInt();
        int[] x =new int[a];
        int[] w ={12,33,45,65,67,54};
        System.out.println("enter the array element: ");
        for(int i=0;i<a;i++){
            x[i]=sc.nextInt();
        }
        System.out.println("array element: ");
        for(int element: x){
            System.out.println(element);
        }
        for(int i:w){
            System.out.println(i);
        }
    }
}
