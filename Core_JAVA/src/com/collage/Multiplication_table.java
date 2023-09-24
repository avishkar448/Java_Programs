package com.collage;

public class Multiplication_table {
    public static void main(String[] args) {
        int n=1;
        while(n<16){
            System.out.printf("Multiplication table of %d\n",n);
        for (int i=1;i<=10;i++) {
            System.out.printf("%d X %d = %d\n", n, i, n * i);
        }
        n++;
      }
    }
}
