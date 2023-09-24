package com.collage;
class Country1{
    String c_name;
    Country1(String c){
        this.c_name=c;
    }
}
class state1 extends Country1{
    String s_name;
   public state1(String c,String s){
        super(c);
        this.s_name=s;
    }
    public void display(){
        System.out.println("c_name: "+c_name);
        System.out.println("s_name: "+s_name);
    }
}
public class Countryname {
    public static void main(String[] args) {
        state1 s1=new state1("abc","xyz");
        s1.display();
    }
}
