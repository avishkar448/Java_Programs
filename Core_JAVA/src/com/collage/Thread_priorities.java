package com.collage;

import javax.xml.namespace.QName;

class puppy extends Thread{
    public puppy(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<500) {
            System.out.println("Welcome HOME!!!  "+this.getName());
            i++;
        }
    }
}
public class Thread_priorities {
    public static void main(String[] args) {
        puppy p1=new puppy("ROCK");
        puppy p2=new puppy("RDJ");
        puppy p3=new puppy("JONNY DEPP");
        puppy p4=new puppy("TOM CRUSE");
        puppy p5=new puppy("STEVE");

        p2.setPriority(Thread.MAX_PRIORITY);
        p1.setPriority(Thread.MAX_PRIORITY);
        p3.setPriority(Thread.MIN_PRIORITY);
        p4.setPriority(Thread.MIN_PRIORITY);
        p5.setPriority(Thread.MIN_PRIORITY);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();


    }
}
