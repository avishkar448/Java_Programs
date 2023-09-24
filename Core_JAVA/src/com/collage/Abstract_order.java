package com.collage;

import javax.xml.namespace.QName;

abstract class Order{
    int id;
    String discription;
    Order(int id,String des){
        this.id=id;
        this.discription=des;
    }
}
class PurchesOrder extends Order{
    String Customer_Name;
    PurchesOrder(int id,String des,String C_name){
        super(id,des);
        this.Customer_Name=C_name;
    }
}
class SalesOrder extends Order{
    String Vendor_Name;
    SalesOrder(int id,String des,String V_Name){
    super(id, des);
    this.Vendor_Name=V_Name;
    }
    public void accept(){
        System.out.println("Id: "+id);
        System.out.println("Description: "+discription);
        System.out.println("Customer Name: ");
        System.out.println("Id: "+id);
    }
}

public class Abstract_order {
    public static void main(String[] args) {

    }
}
