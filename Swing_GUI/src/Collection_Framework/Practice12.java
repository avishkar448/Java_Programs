package Collection_Framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Practice12 {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add("Avishkar");
        a.add("Budi");
        a.add("Abhay");
        a.add("Dhoni");
        a.add("Kohli");

        System.out.println(a);

        Iterator itr=a.iterator();
        while (itr.hasNext()){
            String o=(String)itr.next();
            System.out.println(o);
        }

        HashMap b=new HashMap();
        b.put(1,"Avishkar");
        b.put(2,"Avi");
        b.put(3,"Sachin");
        b.put(4,"Rohit");
        b.put(5,"qqqq");

        System.out.println(b);


        Iterator i=a.listIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
