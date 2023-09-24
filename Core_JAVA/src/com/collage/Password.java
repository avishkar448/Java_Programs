package com.collage;

import java.util.Scanner;

class PassInvalid extends Exception{
    public String toString(){
        return " Invalid input";
    }
}
public class Password {
    public static int radius(int a) throws PassInvalid{
        if(a<0){
            throw new  PassInvalid();
        }
        int re=a*a;
        return re;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ");
        int x=sc.nextInt();
        try {
            int r=radius(x);
            System.out.println("result: ");
            System.out.println(r);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
