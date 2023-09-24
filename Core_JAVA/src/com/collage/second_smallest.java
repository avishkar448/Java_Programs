package com.collage;
import java.util.*;
public class second_smallest {
    public static void main(String[] args) {
        int[] a ={23,43,21,56,43,78,98,20};
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                 temp=a[i];
                 a[i]=a[j];
                 a[j]=temp;
                }
            }
        }
        System.out.println("Smallest Number: "+a[a.length-1]);
        System.out.println("Second Smallest Number: "+a[a.length-2]);

        int size=a.length;
        Arrays.sort(a);
        System.out.println("Sorted array: "+Arrays.toString(a));
        int result=a[a.length-2];
        System.out.println("Second largest :"+result);
        int res=a[1];
        System.out.println("second smallest: "+res);
    }
}
