package com.collage;
class Myexception extends Exception{
    @Override
    public String toString() {
        return "Arithmatic Exception occur";
    }
}
public class Excp {
    public static void main(String[] args) {
        int a=12;
        int b=0;
        int c=a/b;
        try{
            throw new  Myexception();
        }
        catch (Exception e){
           // System.out.println(e);
            e.toString();
        }
    }
}
