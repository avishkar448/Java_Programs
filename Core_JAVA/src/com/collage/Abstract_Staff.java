package com.collage;

import org.w3c.dom.ls.LSOutput;

abstract class Staff{
    protected int  id;
    protected String Name;
    Staff(int id,String Name){
        this.id=id;
        this.Name=Name;
    }

}
class OfficeStaff extends Staff{
    String Department;
    OfficeStaff(int id,String Name,String Dept){
        super(id, Name);
        this.Department=Dept;
    }
    void disp(){
        System.out.println("id: "+id);
        System.out.println("Name: "+Name);
        System.out.println("Department: "+Department);
    }
}
public class Abstract_Staff {
    public static void main(String[] args) {
        OfficeStaff obj=new OfficeStaff(1,"Avishkar","Computer Science");
        OfficeStaff obj2=new OfficeStaff(2,"Abhay","Electronic");
        obj.disp();
        obj2.disp();
    }
}
