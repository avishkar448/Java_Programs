package com.collage;
class Thor extends Thread{
    public Thor(String name){
        super(name);
    }
    public void run(){
        System.out.println("MY NAME IS AVISHKAR");
    }
}
public class Thread_Constructor {
    public static void main(String[] args) {
        Thor t1=new Thor("Avishkar");
        Thor t2=new Thor("AKASH");

        t1.start();
        t2.start();

        System.out.println("The name of the tread t1: "+t1.getName());
        System.out.println("The name of the tread t2: "+t2.getName());
        System.out.println("The id of the tread t1: "+t1.getId());
        System.out.println("The id of the tread t2: "+t2.getId());


    }
}
