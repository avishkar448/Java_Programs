package com.collage;
class employ23{
    private int id;
    private String name;

    public employ23(String name1, int a){
        id=a;
        name=name1;
    }
    public int getId(){
        return id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setName(String n) {
        this.name = n;
    }
    public String getName(){
        return name;
    }
}
public class constructor {
    public static void main(String[] args){
        employ23 emp2=new employ23("avi",100);
       // emp2.setId(2);
       // emp2.setName("abhay");
        System.out.println(emp2.getId());
        System.out.println(emp2.getName());



    }
}
