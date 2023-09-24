package com.collage;
import java.util.*;
class cylinder{
    private float radius;
    private float height;

    public float getR(){
        return radius;
    }
    public void setR(float radius){
        this.radius=radius;
    }
    public void setH(float height){
        this.height=height;
    }
    public float getH(){
        return height;
    }
    public double volumn(){
        return Math.PI*radius*radius*height;
    }
    public double surface_area(){
        return (2*Math.PI*radius*height)+(2*Math.PI*radius*radius);
    }
}
public class getter_setter_cylinder {
    public static void main(String[] args){
        cylinder c1=new cylinder();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius");
        float a=sc.nextFloat();
        System.out.println("enter the height");
        float b=sc.nextFloat();

        c1.setR(a);
        c1.setH(b);

        System.out.println("volumn of cylinder: ");
        System.out.println(c1.volumn());
        System.out.println("surface area of cylinder: ");
        System.out.println(c1.surface_area());


    }
}
