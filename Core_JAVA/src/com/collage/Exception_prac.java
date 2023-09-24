package com.collage;

import java.util.Scanner;
class Limit extends Exception{
    @Override
    public String toString() {
        return "Limit is Over";
    }
}

public class Exception_prac {
    public static void throwexception() throws Limit{
        int i=0;
        if( i<=5){
            throw new Limit();
        }
    }
    public static void main(String[] args) {
        int[] arr =new int[5];
        int i=0;
        arr[0]=100;
        arr[1]=200;
        arr[2]=300;
        arr[3]=400;
        arr[4]=500;

        Scanner sc=new Scanner(System.in);
        //int i=0;
        boolean flag=true;
        while(flag && i<5){
          try {
              System.out.println("enter the index: ");
              int ind = sc.nextInt();
              System.out.println("The value of array: " + arr[ind]);
              break;
          }
          catch (Exception e){
              System.out.println("Invalid index");
              i++;
          }
        }
        if(i>=5){
          //  System.out.println("error");
            try {
                throwexception();
            }
            catch (Limit e){
                System.out.println(e);
            }
        }
    }
}
