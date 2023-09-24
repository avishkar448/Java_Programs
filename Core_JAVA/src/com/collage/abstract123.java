package com.collage;

abstract class Parent{
     public Parent(){
        System.out.println("I am constructor");
    }
    public void hii(){
        System.out.println("hello");
    }
    abstract public void go();
}
class child extends Parent{
    @Override
    public void go() {
        System.out.println("get out !!");
    }
}
abstract class child2 extends Parent{
    public void ww(){
        System.out.println("jai ho");
    }
}
public class abstract123 {
    public static void main(String[] args) {
        child c=new child();
        c.go();
        }
    }
