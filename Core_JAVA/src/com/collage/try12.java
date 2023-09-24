package com.collage;

public class try12 {
    public static void main(String[] args) {
        int a=20;
        int b=2;

        try{
            int c=a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("Sorry!!! some error occure");
            System.out.println(e);
        }
    }
}
