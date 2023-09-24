package com.collage;

import java.util.ArrayDeque;

public class Arraydeq {
    public static void main(String[] args) {
        ArrayDeque<Integer>a=new ArrayDeque<>();
        a.add(5);
        a.add(7);
        a.add(8);
        a.add(3);
        a.add(4);

        a.addFirst(61);
        a.offerFirst(21);
        a.addLast(45);
        a.offerLast(9090);
        System.out.println(a);

        System.out.println(a.peekFirst());
        System.out.println(a.getLast());

        a.removeFirst();
        a.removeLast();
        System.out.println(a);
    }
}
