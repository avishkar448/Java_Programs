package com.collage;
import java.nio.charset.CharacterCodingException;
import java.util.*;
public class Try_catch1 {
    public static void main(String[] args) {
        int[] a =new int[4];
        a[0]=80;
        a[1]=70;
        a[2]=90;
        a[3]=100;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array index: ");
        int ind=sc.nextInt();

        System.out.println("Enter the number you want to divide: ");
        int n=sc.nextInt();

        try{
            System.out.println("The value of array index enter is: "+a[ind]);
            System.out.println("Division :"+a[ind]/n);
        }
        catch (ArithmeticException e){
            System.out.println("Its a Arithmatic exception");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of index");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Some other error ");
            System.out.println(e);
        }


    }
}
