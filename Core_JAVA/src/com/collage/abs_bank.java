package com.collage;
abstract class Bank{
    abstract int getRateOfInterest();
}
class SBI extends Bank{
    int getRateOfInterest(){
        return 4;
    }
}
class IBPS extends Bank{
    int getRateOfInterest(){
        System.out.println("I am running");
        return 8;
    }
}
public class abs_bank {
    public static void main(String[] args) {
        Bank b=new IBPS();
        b.getRateOfInterest();

    }
}
