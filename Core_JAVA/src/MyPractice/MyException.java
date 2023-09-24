package MyPractice;
import java.util.*;
class Invalid extends Exception{
   public String toString(){
        return "Invalid Username and password ,please enter valid data" ;
    }
}
public class MyException {
    public static void main(String[] args) throws Invalid{
        Scanner sc=new Scanner(System.in);
        String Username="om";
        String Password="avi448";

        System.out.println("Username: ");
        String u=sc.next();
        System.out.println("Password: ");
        String p=sc.next();

        try{
            if(Username!=u || Password!=p){
                throw new Invalid();
            }
            else{
                System.out.println("Username: "+u);
                System.out.println("Password: "+p);

            }
        }
        catch (Invalid e){
            System.out.println(e);
        }

    }
}
