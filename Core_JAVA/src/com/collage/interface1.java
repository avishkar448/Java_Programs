package com.collage;
interface Car{
    void start(int a);
    void end(int b);
}
interface bike{
    void start1(int c);
    void end1(int d);
}
class TATA implements Car,bike{
    public void start(int a){
        System.out.println("Start the car: " +a);
    }
    public void end(int b){
        System.out.println("Stop the car: " +b);
    }
    public void start1(int c){
        System.out.println("start the bike: " +c);
    }
    public void end1(int d){
        System.out.println("stop the bike: " +d);
    }
}
public class interface1 {
    public static void main(String[] args) {
       TATA t=new TATA();
       t.end(9);
       t.end1(8);
    }
}