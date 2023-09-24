package com.collage;
import java.util.Scanner;
class AB{
    public int a;
    AB(int a){
        this.a=a;
        System.out.println("value of A :"+a);
    }
    public int add(){
        return a+a;
    }
}
class CD extends AB{
    public int b;
    CD(int a,int b){
        super(a);
        this.b=b;
        System.out.println("value of B: "+b);
    }
    public int mul(){
        return a*a*b*b;
    }
}
public class pra_inheri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the A:");
        int p= sc.nextByte();
        System.out.println("enter the B:");
        int q= sc.nextByte();

        AB c=new CD(p,q);
        System.out.println("addition "+c.add());

    }
}
