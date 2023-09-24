package com.collage;
public class Prac {
    public static void main(String[] args) {
        int[] a ={9,5,4,3,2,1,6,8};
        int temp;
        for (int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Second largest value: "+a[a.length-2]);
        System.out.println("Second smallest value: "+a[1]);
    }
}
