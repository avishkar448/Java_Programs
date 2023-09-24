package com.collage;
import java.util.Scanner;

public class km_to_miles {
    public static void main(String[] arg){
        System.out.println("Distance in kilometer: ");
        Scanner sc= new Scanner(System.in);
        float km=sc.nextFloat();

        //convert it into miles
        System.out.println("kilometer converted into miles");
        float miles= 0.621371f*km;
        System.out.println(miles);
    }
}
