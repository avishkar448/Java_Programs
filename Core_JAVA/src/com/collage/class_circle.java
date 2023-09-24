package com.collage;
import java.util.Scanner;
class circle{
    float r;
    public float area(){

        return 3.14f*r*r;
    }
    public float circumference(){
        return 2*3.14f*r;
    }
    public void result(){
        System.out.println("Area of circle: "+area());
        System.out.println("Circumference of circle: "+circumference());
    }
}
public class class_circle{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the radius");
        circle avi=new circle();
        avi.r=sc.nextFloat();

       avi.result();


    }
}
