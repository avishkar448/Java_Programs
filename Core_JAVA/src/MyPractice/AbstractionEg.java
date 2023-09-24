package MyPractice;
import java.util.*;
abstract class Employee{
     abstract void accept();
     abstract void display();
}
class Manager extends Employee{
    String mname;
    int mid,phno;
    Scanner sc=new Scanner(System.in);
     void accept(){
         System.out.println("enter mid , mname, phno: ");
         mid=sc.nextInt();
         phno=sc.nextInt();
         mname=sc.next();
     }
    void display(){
        System.out.println("MID: "+mid);
        System.out.println("MNAME: "+mname);
        System.out.println("PHONE-NO: "+phno);
    }
}
public class AbstractionEg {
    public static void main(String[] args) {
        Manager m=new Manager();
        m.accept();
        m.display();

    }
}
