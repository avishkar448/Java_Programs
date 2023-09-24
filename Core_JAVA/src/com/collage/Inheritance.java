package com.collage;
import java.util.*;
class base{
    int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        System.out.println("I am a first constructor");
        this.a = a;
    }
}
class height extends base{
    int c;
    public int getC(){
        return c;
    }
    public void setC(int c){
        System.out.println("I am second constructor");
        this.c=c;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        //base b=new base();
        height h=new height();
        h.setA(3);
        System.out.println("value of first constructor :"+h.getA());

        h.setC(10);
        System.out.println("value of second constructor: "+h.getC());
    }
}
