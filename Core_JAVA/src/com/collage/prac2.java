package com.collage;
import java.util.Scanner;
import java.util.Random;
class Game1{
    public int i;
    public int num;
    public int chance=0;
   public void setChance(int chance){
       this.chance=chance;
   }
   public int getChance(){
       return chance;
   }
   Game1(){
       Random r=new Random();
       this.i=r.nextInt(20);
   }
   void input(){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter your number");
       num=sc.nextInt();
   }
   boolean correct(){
       chance++;
       if(num==i){
           System.out.println("Congratulation!!!! YOU WIN");
           System.out.printf("YOUR SCORE: %d",chance);
           return true;
       }
       else if(num<i){
           System.out.println("number is low");
       }
       else if(num>i){
           System.out.println("number is high");
       }
       return false;
   }
}

public class prac2 {
    public static void main(String[] args) {
        Game1 g=new Game1();
        boolean c=false;
        while(!c){
            g.input();
            c= g.correct();
        }
    }
}
