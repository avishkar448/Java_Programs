package com.collage;
class A{
    public void meth1(){
        System.out.println("I am meth1 of class A");
    }
    public void meth2(){
        System.out.println("I am meth2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2() {
        System.out.println("I am meth2 of class B ");
    }
    public void meth3(){
        System.out.println("I am meth3 of class C ");
    }
}
public class Overriding {
    public static void main(String[] args) {
        A a=new A();
        a.meth2();
        B b=new B();
        b.meth2();

    }
}
