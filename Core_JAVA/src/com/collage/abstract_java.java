package com.collage;
abstract class avishkar123{

    public avishkar123(){
        System.out.println("Hi I am constructor");
    }
    abstract public  void sleep();
    abstract public void run1();
}
class sonu extends avishkar123{
    void display(){
        System.out.println("Hi!! i am jolly");
    }
   public  void sleep(){
       System.out.println("I am Avishkar");
   }
   public void run1(){
       System.out.println("I am future avishkar");
   }
}
public class abstract_java {
    public static void main(String[] args) {
        sonu s=new sonu();
        s.run1();
       s.display();
       s.sleep();
    }
}
