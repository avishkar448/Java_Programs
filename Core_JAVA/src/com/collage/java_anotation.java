package com.collage;
@FunctionalInterface
interface myclass{
    void ina();

}
class Newphone extends Phone{
      @Override
    public void music(){
          System.out.println("jai ho");
      }
      @Deprecated
      public int sum(int a,int b){
          return a+b;
      }
}
public class java_anotation {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Newphone p=new Newphone();
        p.music();

        p.sum(2,4);
    }
}
