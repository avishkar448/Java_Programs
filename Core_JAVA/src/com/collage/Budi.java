package com.collage;
class Continent{
    String Cont_name;
    Continent(String c){
        this.Cont_name=c;
    }
}
class Country12 extends Continent{
    String Count_name;
    Country12(String c,String cn){
        super(c);
        this.Count_name=cn;
    }
}
class State2 extends Country12{
    String state_name;
    State2(String c,String cn,String s){
        super(c,cn);
        this.state_name=s;
    }
    void display(){
        System.out.println("Continent: "+Cont_name);
        System.out.println("Country: "+Count_name);
        System.out.println("State: "+state_name);
    }

}
public class Budi {
    public static void main(String[] args) {
        State2 s=new State2("Asia","India","Maharastra");
        s.display();
    }
}
