package Collection_Framework;
import java.io.IOException;
import java.util.*;
public class Map1 {
    public static void main(String[] args) throws IOException {
        HashMap a= new HashMap();
        a.put(1,"Avishkar");
        a.put(2,"Abhay");
        a.put(3,"Abhinav");
        a.put(4,"Amol");
        a.put(5,"Arjun");
       // System.out.println(a);
        Set s=a.entrySet();
        Iterator i=s.iterator();
        while(i.hasNext()){
            Map.Entry m=(Map.Entry)i.next();
            System.out.print(m.getKey()+" : ");
            System.out.println(m.getValue());
        }

        LinkedHashMap l=new LinkedHashMap();
        l.put(1,"Rahul");
        l.put(2,"Hardik");
        l.put(3,"Krunal");
        l.put(4,"Rohit");
        l.put(5,"Jasprit");

        Set s1=l.entrySet();
        Iterator i1=s1.iterator();
        while(i1.hasNext()){
            Map.Entry e=(Map.Entry)i1.next();
            System.out.print(e.getKey()+" = ");
            System.out.println(e.getValue());
        }

    }
}
