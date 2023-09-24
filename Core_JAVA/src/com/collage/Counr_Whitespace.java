package com.collage;
import java.util.*;
public class Counr_Whitespace {
    public static void main(String[] args) {
        String str;
        int space=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        str=sc.nextLine();

        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '){
                space++;
            }
        }
        System.out.println("Total space: "+space);
    }
}
