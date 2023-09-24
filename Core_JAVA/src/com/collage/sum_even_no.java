package com.collage;
import java.util.Scanner;
public class sum_even_no {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        /*int sum=0;

        for(int i=0; i<=n; i++){
            sum= sum+ (2*i);
        }
        System.out.print("Sum of first n natural number: ");
        System.out.println(sum);*/

       //Multiplication table using for loop
       // int table=0;
       /* for(int i=1; i<=10 ;i++){
            table= n*i;
            System.out.printf("%d X %d = %d\n",n,i,table);
        }*/

        //Multiplication table using while loop
        /*int i=0;
        while(i<=10){
            table=n*i;
            System.out.printf("%d X %d = %d\n",n,i,table);
            i++;
        }*/

       // Multiplication table using reverse order
       /* for(int i=10;i>=1;i--){
            table=i*n;
            System.out.printf("%d X %d = %d\n",n,i,table);
        }*/

        //Factorial using While loop
        //int i=1;
        //int factorial=1;
        /*while(i<=n){
            factorial *=i;
            i++;
        }*/
       /* for(int i=1;i<=n;i++){
            factorial *=i;
        }
        System.out.println(factorial);*/

        int sum=0;
        for(int i=1; i<=10 ;i++){
            sum += n*i;
        }
        System.out.println(sum);

    }

}
