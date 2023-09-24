package com.collage;

import java.util.Scanner;

class Excep extends Exception{
   public String toString(){
       return "Dont enter the negative value";
   }
}
public class Problem {
    public static int cube(int a) throws Excep{
        if(a<0){
            throw new Excep();
        }
        int result=a*a*a;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int s=sc.nextInt();
        try {
            int x=cube(s);
            System.out.println("cube is: ");
            System.out.println(x);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
