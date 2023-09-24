package MyPractice;
class Bank{
    int getInt(){
        return 0;
    }
}
class HDFC extends Bank{
    int getInt(){
        return 10;
    }
}
class SBI extends Bank{
    int getInt(){
        return 12;
    }
}
public class Overriding_Example {
    public static void main(String[] args) {
        Bank b=new Bank();
        HDFC h=new HDFC();
        SBI s=new SBI();

        System.out.println("Bank: "+b.getInt());
        System.out.println(" HDFC Bank: "+h.getInt());
        System.out.println("SBI Bank: "+s.getInt());
    }
}
