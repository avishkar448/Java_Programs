package com.collage;
import java.util.Random;
import java.util.Scanner;
class Game{
    public int n;
    public int guesses=0;
    public int my_number;
    public int getGuesses(){
        return guesses;
    }
    public void setGuesses(int guesses){
        this.guesses=guesses;
    }
    Game(){
        Random r=new Random();
        this.n=r.nextInt(10);
    }
    void take_user_input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Guess the number : ");
        my_number=sc.nextInt();

    }
     boolean correct_no(){
        guesses++;
        if (my_number==n){
            System.out.println("winner winner chiken dinner!!");
            System.out.printf("your score :%d\n",guesses);
            return true;
        } else if (my_number<n) {
            System.out.println("number is low ");
        }
        else if(my_number>n){
            System.out.println("number is so heigh");
        }

        return false;
    }
}
public class Guess_the_number {
    public static void main(String[] args) {
        Game g=new Game();
        boolean b=false;
        while(!b){
            g.take_user_input();
            b = g.correct_no();
        }
    }

}
