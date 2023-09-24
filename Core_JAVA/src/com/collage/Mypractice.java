package com.collage;
import java.io.*;
import java.util.Scanner;

class InvalidInput1 extends Exception{
    public String toString(){
        return "you cannot put this value";
    }
}
class addition{
    public int addition12(int a,int b) throws InvalidInput1{
        if(a==8 || b==8){
            throw new InvalidInput1();
        }
        int c=a+b;
        return c;
    }
}
public class Mypractice {
    public static void main(String[] args) throws InvalidInput1 {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number 1");
        int x=sc.nextInt();
        System.out.println("Enter the number 2");
        int y=sc.nextInt();
        try {
            addition c=new addition();
            System.out.println("addition : "+c.addition12(x,y));
        }
        catch (InvalidInput1 e){
            System.out.println(e);
        }
    }

}
