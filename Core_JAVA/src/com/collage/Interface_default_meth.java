package com.collage;
interface Camera{
    private void Groot(){
        System.out.println("I am groot");
    }
    void takesnap();
    void recordvideo();
    default void record4kvideo(){
        Groot();
        System.out.println("record your own video");
    }
}
interface wifi{
    String[] name();
    void connect(String number);
}
class Cellphone{
    void callnumber(int n){
        System.out.println("calling "+n);
    }
    void pickcall(){
        System.out.println("connecting  ");
    }

}
class Smartphone1 extends Cellphone implements Camera,wifi{
    public void takesnap(){
        System.out.println("Nice click ");
    }
    public void recordvideo() {
        System.out.println("Video recording ");
    }
    public String[] name(){
        System.out.println("customer name");
        String[] a={"Avishkar","Ravi","jonny"};
        return a;
    }
    public void connect(String name) {
        System.out.println("customer name: "+name);
    }
  // public  void record4kvideo(){
    //    System.out.println("record your peoples video");
    //}

}
public class Interface_default_meth {
    public static void main(String[] args) {
        Smartphone1 s=new Smartphone1();
        s.record4kvideo();
        String[] ar=s.name();
        for (String items:ar) {
            System.out.println(items);
        }
    }
}
