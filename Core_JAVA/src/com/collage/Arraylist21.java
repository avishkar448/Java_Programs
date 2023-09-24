package com.collage;
import java.util.*;
import java.util.Collection;

public class Arraylist21 {
    public static void main(String[] args) {
        ArrayList<Integer>a=new ArrayList<>();
        ArrayList<Integer>b=new ArrayList<>();
        a.add(4);
        a.add(5);
        a.add(8);
        a.add(12);
        a.add(49);
        a.add(23);

        b.add(123);
        b.add(543);
        b.add(657);
        b.add(897);

        System.out.println("My array list a: ");
        System.out.println(a);
        System.out.println("My array list b: ");
        System.out.println(b);
        System.out.println();

        a.addAll(b);
        System.out.println("After adding a&b : "+a);
        System.out.println();

        a.remove(4);
        System.out.println("Array list after removing\n" +a);
        System.out.println();

        System.out.println("List contain 5: "+ a.contains(5));
        System.out.println("List contain 90: "+a.contains(90));

        System.out.println();
        System.out.println("The occurence of 12 in a: "+a.indexOf(12));

        System.out.println();
        System.out.println("The occurence of 12 in a: "+a.indexOf(12));
        System.out.println("The last occurence of 12 in a: "+a.lastIndexOf(12));


    }
}
