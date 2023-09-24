package com.collage;
import java.util.*;
class Sort{
    int n;
    String[] a;
    Sort(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many City name you want! ");
        int n=sc.nextInt();
        String[] a =new String[n];

        System.out.println("Enter the element: ");
        for (int i=0;i<n;i++){
            a[i]= sc.nextLine();
        }
    }
    public void display(){
        String temp;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (a[j].compareTo(a[j])<0){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("\n Sorted names are: ");
        for (int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
public class Sort_city {
    public static void main(String[] args) {
        Sort s=new Sort();
        s.display();
    }
}
