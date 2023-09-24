package com.collage;
import java.util.*;
public class array123 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("row: ");
        int r=sc.nextInt();
        System.out.println("Colum: ");
        int c=sc.nextInt();

        int[][] a =new int[r][c];
        System.out.println("Enter the array element: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }

        for(int [] element :a){
            for(int ele: element){
                System.out.print(" "+ele);
            }
            System.out.println(" ");
        }
    }
}
