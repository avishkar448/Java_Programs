package com.collage;
import java.util.*;
public class CityName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many number you want: ");
        int n=sc.nextInt();
        String[] name =new String[n];
        System.out.println("enter name: ");

        for(int i=0;i<n;i++){
            name[i]=sc.nextLine();
        }
        for(int i=0;i<n;i++){
            System.out.print("  "+name[i]);
        }
        String temp;
        for(int i=0;i< name.length;i++){
            for(int j=1;j< name.length;j++){
                if(name[j-1].compareTo(name[j])>0){
                    temp=name[j-1];
                    name[j-1]=name[j];
                    name[j]=temp;
                }
            }
        }
        System.out.println("sorted name: ");
        for(int i=0;i<n;i++){
            System.out.println(name[i]);
        }
    }
}
