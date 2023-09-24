package com.collage;
import java.util.*;
    class Program1{
        double length;
        double breadth;
        Program1(double l,double b){
            this.length=l;
            this.breadth=b;
        }
        public  void Perimeter(){
            double peri=2*(length+breadth);
            System.out.println("Perimeter :"+peri);
        }
        public  void Area(){
            double area=length*breadth;
            System.out.println("Area: "+area);
        }
    }
public class Peri_area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length");
        double a=sc.nextDouble();
        System.out.println("Enter the breadth");
        double b=sc.nextDouble();

        Program1 obj=new Program1(a,b);
        obj.Area();
        obj.Perimeter();

    }
}
