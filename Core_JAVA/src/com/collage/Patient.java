package com.collage;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class patien{
    String p_name;
    int p_age;
    int p_oxy_level;
    int p_HRCT;
    patien(String p_name,int p_age,int p_oxy_level,int p_HRCT){
        this.p_name=p_name;
        this.p_age=p_age;
        this.p_oxy_level=p_oxy_level;
        this.p_HRCT=p_HRCT;
    }
    void display(){
        System.out.println("name: "+p_name);
        System.out.println("age: "+p_age);
        System.out.println("oygen: "+p_oxy_level);
        System.out.println("HRCT: "+p_HRCT);
    }
}
class PException extends Exception{
    public String toString(){
        return "Patient is covid positive and need to hospitalized";
    }
}
public class Patient {
    public static void main(String[] args) throws PException {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name: ");
        String a=sc.next();
        System.out.println("enter age: ");
        int b=sc.nextInt();
        System.out.println("enter oxy: ");
        int c=sc.nextInt();
        System.out.println("enter HRTC: ");
        int d=sc.nextInt();

        patien p=new patien(a,b,c,d);
        try{
            if(c<95 && d>10){
                throw new PException();
            }
        }
        catch (PException e){
            System.out.println(e);
        }
        finally {
            p.display();
        }
    }
}
