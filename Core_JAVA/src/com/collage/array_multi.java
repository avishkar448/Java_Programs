package com.collage;
import java.util.*;
public class array_multi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many rows you want in first array");
        int r1=sc.nextInt();
        System.out.println("How many columns you want in first array");
        int c1=sc.nextInt();

        int [][]a=new int[r1][c1];
        System.out.println("Enter the array element: ");
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("How many rows you want in second array");
        int r2=sc.nextInt();
        System.out.println("How many columns you want in second array");
        int c2=sc.nextInt();
        int [][]b=new int[r2][c2];
        System.out.println("Enter the array element: ");
        for (int i=0;i<r2;i++){
            for (int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }

        System.out.println("Multiplication of Matrix");
        int[][]mul=new int[r1][c1];
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                mul[i][j]=a[i][j]*b[i][j];
            }
        }
        System.out.println("Multiplication of array: ");
        for (int[] element1:mul){
            for (int element2: element1){
                System.out.print(element2 + "  ");
            }
            System.out.println();
        }
    }
}
