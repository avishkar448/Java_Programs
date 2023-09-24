package com.collage;
@FunctionalInterface
interface DemoAno{
    void meth1(int a);
 //   void meth2();
}
/*class avi implements DemoAno{
    @Override
    public void meth1() {
        System.out.println("I am meth1");
    }
}*/
/*class Anonymous implements DemoAno {
    public void display(){
        System.out.println("Hello");
    }

    @Override
    public void meth2() {
        System.out.println("I am meth2");
    }

    @Override
    public void meth1() {
        System.out.println("I am meth1");
    }
}*/
public class java_Anonymous {
    public static void main(String[] args) {
   //     Anonymous obj=new Anonymous();
     //   obj.meth1();
    /*    DemoAno obj=new DemoAno() {
            @Override
            public void meth1() {
                System.out.println("I am meth1");
            }

            @Override
            public void meth2() {
                System.out.println("I am meth 2");
            }
        };
        obj.meth1();*/
        //lambda expration
   //     DemoAno obj=new avi();
     //   obj.meth1();
        DemoAno obj=(a)->{System.out.println("I am meth1 from lambada: "+a);};
        obj.meth1(4);
    }
}
