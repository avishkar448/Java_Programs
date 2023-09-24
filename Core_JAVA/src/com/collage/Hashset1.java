package com.collage;

import java.util.HashSet;

public class Hashset1 {
    public static void main(String[] args) {
        HashSet<Integer>a=new HashSet<>();
        a.add(2);
        a.add(6);
        a.add(8);
        a.add(9);
        a.add(3);

        System.out.println(a);
        a.remove(8);
        System.out.println("myhashset after remove 8: "+a);
        System.out.println(a.isEmpty());
        //a.clear();
      //  System.out.println("after clearing: "+a);
        System.out.println("The size of a: "+a.size());
    }
}
