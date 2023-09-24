package MyPractice;
import java.util.*;
class InvalidProductException extends Exception{
    public String toString(){
        return"Product weight is more than 100 so it is not allowed!!!!!";
    }
}
class Product{
    int pcode;
    int weight;
    String name;
    Product(int p,String nm,int w){
        this.pcode=p;
        this.name=nm;
        this.weight=w;
    }
    void display(){
        System.out.println("code: "+pcode);
        System.out.println("Name: "+name);
        System.out.println("weight: "+weight);
    }
}
public class User_defineException {
    public static void main(String[] args) throws InvalidProductException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the product details");
        int a=sc.nextInt();
        String c=sc.next();
        int b=sc.nextInt();
        try {
            Product p=new Product(a,c,b);
            Product p1=new Product(a,c,b);

            if(b>100){
                throw new InvalidProductException();
            }
            else{
                p.display();

            }
        }
        catch (InvalidProductException e){
            System.out.println(e);
        }
    }
}
