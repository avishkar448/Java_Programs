package com.collage;
import java.util.*;

public class Try_Catch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the values: ");
        int a= sc.nextInt();
        int b= sc.nextInt();


        try{
         int  c=a/b;
            System.out.println("Division: "+c);
        }
        catch (Exception e){
            System.out.println("we failed");
            System.out.println(e);
        }
        System.out.println("end of program");
    }
}
