package MyPractice;

class Smartphone{
    void display(){
        System.out.println("I am smartphone");
    }
}
class lenovo extends Smartphone{
    void display(){
        System.out.println("My brand is lenovo");
    }
}
class nokia extends Smartphone{
    void display(){
        System.out.println("my brand is nokia");
    }
}
public class Polymorphism_example {
    public static void main(String[] args) {
        Smartphone s1=new Smartphone();
        Smartphone s2=new lenovo();
    }
}
