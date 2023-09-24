package MyPractice;
interface Bank1{
    void interest();
    double PI=3.14;
}
interface  Bank2 extends Bank1{
    void loan();
}

class MyWay implements Bank2{
   public  void interest(){
        System.out.println("I am out");
    }
    public void loan(){
        System.out.println("I am in");
    }
}
public class Interface_Example {
    public static void main(String[] args) {
        MyWay m=new MyWay();
        m.interest();
        m.loan();
    }
}
