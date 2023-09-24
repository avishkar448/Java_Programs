package com.collage;
import java.util.*;
public class Clock {
    int h,m,s;
    String mode;
    Scanner sc=new Scanner(System.in);
    Clock(int h,int m,int s){
        this.h=h;
        this.s=s;
        this.m=m;
    }
    void check_validity(){
        if(h>12&&h<1){
            System.out.println("your input is wrong");
        }
        if(s>60&&s<0){
            System.out.println("your input is wrong");
        }
        if(m>60&&m<0){
            System.out.println("your input is wrong");
        }
    }
    void set_time(){
        System.out.println("AM/PM");
        mode=sc.next();
    }
    void display(){
        System.out.println(h+":"+m+":"+s+"|"+mode);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the hour");
        int a=sc.nextInt();
        System.out.println("enter the min");
        int b=sc.nextInt();
        System.out.println("enter the sec");
        int c=sc.nextInt();

        Clock obj=new Clock(a,b,c);
        obj.check_validity();
        obj.set_time();
        obj.display();
    }
}
