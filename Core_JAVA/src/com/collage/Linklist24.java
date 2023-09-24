package com.collage;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linklist24{
    public static void main(String[] args) {
        LinkedList<Integer>a=new LinkedList<>();
        LinkedList<Integer>b=new LinkedList<>();
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

        System.out.println(a.contains(5));
        System.out.println(b.indexOf(657));
        System.out.println(b.lastIndexOf(657));

        a.set(1,34);

        for (int i=0;i<a.size();i++){
            System.out.print(a.get(i));
            System.out.print(" ");
        }
    }
}
