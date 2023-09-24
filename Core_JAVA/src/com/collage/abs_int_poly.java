package com.collage;
abstract class Telephone{
    abstract void king();
    abstract void queen();
}
abstract class lift extends Telephone{
    abstract void on();
    abstract void off();
}

abstract class disconnect extends lift{
    abstract void out();
    abstract void come();
}

class Smart_telephone extends disconnect{
    void king(){
        System.out.println("You are king");
    }
    void queen(){
        System.out.println("You are queen");
    }
    void on(){
        System.out.println("You are on");
    }
    void off(){
        System.out.println("You are off");
    }
    void out(){
        System.out.println("You are out");
    }
    void come(){
        System.out.println("You are fool");
    }
}
public class abs_int_poly {
    public static void main(String[] args) {
        lift l=new Smart_telephone();
        l.king();

    }
}
