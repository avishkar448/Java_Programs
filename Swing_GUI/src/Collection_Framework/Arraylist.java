package Collection_Framework;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add("Avishkar");
        a.add("Prathmesh");
        a.add("Virat");
        a.add("Rahul");
        a.add("Varun");
        System.out.println(a);
        a.remove("Virat");
        System.out.println(a);

        Iterator i=a.iterator();
        while (i.hasNext()){
            String obj=(String)i.next();
            System.out.println(obj);

        }
        //Linked
        LinkedList l=new LinkedList();
      //  l.add("Avishkar");
      //  l.add("Om");
        l.add(2);
        l.add(78);
        l.add(100);
        System.out.println(l);
       // l.addFirst("India");
        System.out.println(l);
       // l.addLast("Royal");
        System.out.println(l);
        System.out.println("**************************************");
        Iterator i1=l.iterator();
        while (i1.hasNext()){
            Integer m=(Integer)i1.next();
            System.out.println(m);

        }
        //Vector
        Vector v=new Vector(100);
        v.add("Avi");
        v.add("90");
        v.add("45");
        v.add("i");
        v.add("4859");
        System.out.println(v);
        System.out.println("Size: "+v.size());
        System.out.println("Capacity: "+v.capacity());
    }
}
