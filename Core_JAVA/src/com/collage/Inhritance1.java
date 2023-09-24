package com.collage;
import java.util.Scanner;
class Base1{
    Base1(){
        System.out.println("I am constructor");
    }
    Base1(int a){
        System.out.println("the value of a is : "+a);
    }
}
class Height1 extends Base1 {
    Height1() {
        //super(8);
        System.out.println("I am height class constructor");
    }

    Height1(int a, int b) {
        super(a);
        System.out.println("The value of b is : " + b);
    }
}
    class Length extends Height1{
    Length(){
        System.out.println("I am length class constructor");
    }
    Length(int a,int b,int c){
        super(a,b);
        System.out.println("The value of c is: "+c);
    }
}


public class Inhritance1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first no. :");
        int o=sc.nextInt();
        System.out.println("Enter the second no. :");
        int p= sc.nextInt();
        System.out.println("Enter the third no. :");
        int q= sc.nextInt();
      //  Base1 x=new Base1(3);
     //   Height1 y=new Height1(1,4);
        Length z=new Length(o,p,q);
    }
}
