package com.collage;
class Phone{
    public void date(){
        System.out.println("7 September 2022");
    }
    public void music(){
        System.out.println("ROCK ON");
    }
}
class Smartphone extends Phone{
    public void game(){
        System.out.println("Free-Fire");
    }
    @Override
    public void music(){
        System.out.println("BEAST");
    }
}
public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        Phone ph = new Smartphone();
        ph.date();
        ph.music();
    }
}