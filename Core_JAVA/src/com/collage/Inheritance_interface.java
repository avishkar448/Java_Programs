package com.collage;

import java.sql.SQLOutput;

interface Marvel{
    void Ironman();
    void Thor();
    void Captain_america();
}
interface DC extends Marvel{
    void Superman();
    void Batman();
    void Blackadam();
}
class Superhero implements DC{
    public void Batman() {
        System.out.println("I am Batman");
    }
    public void Superman() {
        System.out.println("I am Superman");
    }
    public void Blackadam() {
        System.out.println("I am Blackadam");
    }
    public void Thor() {
        System.out.println("I am Thor");
    }
    public void Captain_america() {
        System.out.println("I am Captain America");
    }
    public void Ironman() {
        System.out.println("I am Ironman");
    }
}
public class Inheritance_interface {
    public static void main(String[] args) {
        Superhero S=new Superhero();
        System.out.println("Marvel superhero");
        S.Captain_america();
        S.Thor();
        S.Ironman();
        System.out.println("DC superhero");
        S.Batman();
        S.Blackadam();
        S.Superman();
    }
}
