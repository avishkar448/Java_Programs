package com.collage;

import java.util.Scanner;

class Myexception12 extends Exception{
    public String toString(){
        return "I am to string()";
    }
    public String getMessage(){
        return "I am getmessage";
    }
}
class Myexception1 extends Exception {
    public String toString() {
        return "The number cannot be less than 99";
    }
}
public class Exception_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a > 99) {
            try {
                throw new Myexception1();

            } catch (Exception e) {
                //System.out.println(e.getMessage());
                System.out.println(e);
                //System.out.println(e);
                System.out.println("Number: " + a);
                // e.printStackTrace();
            }
        }

    }
}
