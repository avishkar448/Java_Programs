package com.collage;
import java.util.Scanner;
public class meth_star_pattern {
    static void star(int n){
        for(int i=0;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Scanner ac=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a=ac.nextInt();
        star(a);
    }
}
