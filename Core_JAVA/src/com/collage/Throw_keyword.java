package com.collage;

import com.sun.source.tree.BreakTree;

class Negative extends Exception{
    public String toString(){
        return "Radius cannot be negative";
    }
}
public class Throw_keyword {
    public static double area(int r) throws Negative{
        if(r<0){
            throw new Negative();
        }
        double result=Math.PI*r*r;
        return result;
    }
  public static   int divide(int a, int b) throws ArithmeticException{

        int result =a/b;
        return result;
    }
    public static void main(String[] args) {
      try {
          //int c=divide(6,0);
          //System.out.println(c);
          double ar=area(-6);
          System.out.println(ar);
      }
      catch (Exception e){
          System.out.println("Exception");
      }

    }
}
