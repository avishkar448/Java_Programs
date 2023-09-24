package com.collage;
import java.io.*;
import java.util.*;
public class Practice123 {
    public static void main(String[] args) throws Exception{
       int[] a ={10,20,30,40,50,60};
        int temp;

        for(int i=0;i<a.length;i++){
           for(int j=i+1;j<a.length;j++){
               if(a[i]>a[j]){
                   temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
               }
           }
       }
        System.out.println("second smallest no: "+a[1]);
        System.out.println("second largest no: "+a[a.length-2]);
    }
}
