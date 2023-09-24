package com.collage;
import java.util.*;
class Country{
    String a;
    Country(String a){
        this.a=a;
    }
}
class State extends Country{
    String b;
    State(String a,String b){
        super(a);
        this.b=b;
    }
}
class City extends State{
    String c;
    City(String a,String b,String c){
        super(a,b);
        this.c=c;
    }
    public void display(){
        System.out.println("Country : "+a);
        System.out.println("State : "+b);
        System.out.println("City : "+c);
    }
}
public class Multilevel {
    public static void main(String[] args) {
        City ap=new City("New-zeland","Maharashtra","Pune");
        ap.display();
    }
}
