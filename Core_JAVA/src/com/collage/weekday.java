package com.collage;
import java.util.Scanner;
public class weekday {
    public static void main(String[] args) {
       Scanner wc=new Scanner(System.in);
        System.out.println("choose the number from 1 to 7: ");
       int n=wc.nextInt();

       switch(n){
           case 1:
               System.out.println("SUNDAY");
               break;
           case 2:
               System.out.println("MONDAY");
               break;
           case 3:
               System.out.println("TUESDAY");
               break;
           case 4:
               System.out.println("WEDNESDAY");
               break;
           case 5:
               System.out.println("THURSDAY");
               break;
           case 6:
               System.out.println("FRIDAY");
               break;
           case 7:
               System.out.println("SATURDAY");
               break;
           default:
               System.out.println("There are only 7 days in week please choose valid key");
       }
        System.out.println("Thank you for visit");

    }
}
