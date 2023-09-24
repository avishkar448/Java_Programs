package com.collage;
import java.util.Scanner;
public class meth_square {
    static int square(int n){
        int sq=n*n;
        return sq;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int a=sc.nextInt();

        System.out.println("the square of number: ");
        System.out.println(square(a));
    }
}
