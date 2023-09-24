package com.collage;
import java.util.Scanner;
public class method_multiplication_table {
    static void multiplication(int a){
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d = %d\n",a,i,a*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Multiplicatin table of: ");
        int n=sc.nextInt();
        multiplication(n);

    }
}
