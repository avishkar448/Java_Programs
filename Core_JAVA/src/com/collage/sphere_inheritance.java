package com.collage;
import java.util.Scanner;
class Area1{
    public float r;
    Area1(float r){
        this.r=r;
    }
    public double area_sphere(){
        System.out.println("area of sphere: ");
         return 4*Math.PI*r*r;
    }
}
class Volumn1 extends Area1{
    public float h;
    Volumn1(float r,float h){
        super(r);
        this.h=h;
    }
    public double vol_cylinder(){
        return Math.PI*r*r*h;
    }
}
public class sphere_inheritance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius: ");
        float a= sc.nextFloat();
        System.out.println("enter the height: ");
        float b=sc.nextFloat();

        Volumn1 as=new Volumn1(a,b);
        //System.out.println("Area of sphere: "+as.area_sphere());
       // System.out.println(as.area_sphere());
       // as.area_sphere();
        System.out.println("area of sphere: "+as.area_sphere());
        System.out.println("volumn of cylinder: "+as.vol_cylinder());
    }
}
