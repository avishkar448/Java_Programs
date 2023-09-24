package com.collage;
import java.util.*;
abstract class Order1{
    int id;
    String description;
}
class Purches_1 extends Order1{
    String C_Name,V_name;
    Scanner sc=new Scanner(System.in);
    public void accept(){
        System.out.println("Enter the id: ");
        id= sc.nextInt();
        System.out.println("Description: ");
        description=sc.nextLine();
        System.out.println("Customer Name: ");
        C_Name=sc.nextLine();
        System.out.println("Vender Name: ");
        V_name=sc.nextLine();
    }
    public void display(){
        System.out.println("id: "+id);
        System.out.println("Description: "+description);
        System.out.println("Customer Name: "+C_Name);
        System.out.println("Vendor Name: "+V_name);
    }
}
public class Abs_Order {
    public static void main(String[] args) {
        Purches_1 a=new Purches_1();
        a.accept();
        a.display();
    }
}
