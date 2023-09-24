package com.collage;
import java.util.Scanner;
 class emp{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("id: "+id);
        System.out.println("name: "+name);
        System.out.println("salary: "+salary);

    }
    public String getName(){
        return name;
    }
}
public class own_java_class{
    public static void main(String[] args) {

        emp avishkar=new emp();

        Scanner sc=new Scanner(System.in);
        //System.out.println("enter the number: ");
        avishkar.id=sc.nextInt();

        //avishkar.id=1;
        avishkar.salary=150000;
        avishkar.name="Avishkar";

        avishkar.printDetails();
        avishkar.getName();
        System.out.println(avishkar.getName());
       /* System.out.println(avishkar.id);
        System.out.println(avishkar.salary);
        System.out.println(avishkar.name);*/


    }
}
