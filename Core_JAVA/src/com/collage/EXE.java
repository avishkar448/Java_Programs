package com.collage;
class rock extends Exception{
    public String toString(){
        return "zero division error";
    }
}
public class EXE {
    public static void main(String[] args){
        int a=12;
        int b=0;
        int c=a/b;
        try {
            throw new rock();
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
