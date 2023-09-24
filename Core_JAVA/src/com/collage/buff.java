package com.collage;
import java.io.*;

public class buff {
    public static void main(String[] args) throws Exception{
        int[] a ={10,21,56,78,34,22,34};
        int t=a.length;
        int temp;
        for(int i=0;i<t;i++){
            for(int j=i+1;j<t;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("second largest element: "+a[t-2]);
    }
}
