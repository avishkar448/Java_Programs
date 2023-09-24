package com.collage;

public class Exception_finally {
    public static int avi(){
        try{
            int a=40;
            int b=10;
            int c=a/b;
            return c;
        }
        catch(Exception e){

            System.out.println(e);
        }
        finally {
           System.out.println("This is end of program");
        }
        return -1;
    }

    public static void main(String[] args) {
       // avi();
        int k=avi();
        System.out.println(k);
        int a=100;
        int b=3;
        while(true){
            try {
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am finally value of b: "+b);
            }
            b--;
        }
    }
}
