package com.collage;
import java.util.Scanner;
public class student {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the marks s1: ");
        float s1=sc.nextFloat();
        System.out.println("Enter the marks s2: ");
        float s2=sc.nextFloat();
        System.out.println("Enter the marks s3: ");
        float s3=sc.nextFloat();

        System.out.println("Total of marks is : ");
        float avg=s1+s2+s3;
        System.out.println(avg);

        System.out.println("The percentage is: ");
        float per=avg/3.0f;
        System.out.println(per);

        if(per>=40 && s1>=33 && s2>=33 && s3>=33){
            System.out.println("Congratulation!,You are pass");
        }
        else{
            System.out.println("You are FAIL now,better luck next time");
        }


    }
}
