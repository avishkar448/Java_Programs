package Collection_Framework;
import java.util.*;
public class list1 {
    public static void main(String[] args) {

        ArrayList a=new ArrayList();
        a.add("Avishkar");
        a.add("Rahul");
        a.add("Omkar");
        a.add("Shivraj");
        a.add("Om");
        a.add("Rajveer");


       ListIterator il=a.listIterator();
        while(il.hasNext()){
            System.out.println(il.next());
        }
        System.out.println("****************");
        while(il.hasPrevious()){
            System.out.println(il.previous());
        }

    }
}
