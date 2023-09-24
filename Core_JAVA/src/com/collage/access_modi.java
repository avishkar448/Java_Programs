package com.collage;
class access{
    public int x=10;
    protected int y=46;
    int z=12;
    private final int s=89;
    public void meth(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(s);
    }
}
public class access_modi {
    public static void main(String[] args) {
        access a=new access();
        a.meth();
        System.out.println(a.x);
        System.out.println(a.y);
        System.out.println(a.z);
      //  System.out.println(a.s);-- >we cannot access because it is private
    }
}
