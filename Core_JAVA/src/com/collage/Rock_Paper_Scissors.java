package com.collage;
import java.util.Scanner;
import java.util.Random;
public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        System.out.println("1.ROCK, 2.PAPER, 3.Scissors");
        int player=cs.nextInt();
        System.out.printf("player choice: %d",player);
        System.out.println();

        Random random= new Random();
        int computer=random.nextInt(3);

        switch(player){
            case 1:
                System.out.println("player choice ROCK");
                break;
            case 2:
                System.out.println("player choice PAPER");
                break;
            case 3:
                System.out.println("player choice SCISSOR");
                break;
            default:
                System.out.println("Please choose valid input!!!!!!");
        }

        if(computer==1){
            System.out.println("Computer choice ROCK");
        }
        else if(computer==2){
            System.out.println("Computer choice PAPER");
        }
        else if(computer==3){
            System.out.println("Computer choice SCISSOR");
        }
        else{
            System.out.println("error");
        }

        System.out.println("**************************");
        System.out.println("Result of match is: ");
        if(player==computer){
            System.out.println("DRAW");
        }
        else if(player==1 && computer==3 || player==2 && computer==3 && player==3 && computer==2){
            System.out.println("Player is WINNER");
        }
        else{
            System.out.println("Computer is WINNER");
        }


    }



}
