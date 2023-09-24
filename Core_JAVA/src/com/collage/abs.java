package com.collage;
import java.util.*;
class myEx extends Exception{
    public String toString(){
        return"you cannot enter because i am the boss";
    }
    public String getMessage(){
        return "boss";
    }
}
public class abs {
    public static void main(String[] args) throws myEx {
        Scanner sc = new Scanner(System.in);
        int a=8;
        if(a<99){
            try {
                throw new myEx();
            }
            catch(Exception e){
                System.out.println(e);
                System.out.println(e.getMessage());
            }

        }
    }
}
