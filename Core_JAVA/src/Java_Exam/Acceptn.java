package Java_Exam;
import java.util.*;

public class Acceptn {
    public static void main(String[] args) {

        ArrayList a=new ArrayList();
        a.add("Avishkar");
        a.add("Avi");
        a.add("wwe");
        a.add("Virat");
        a.add("Vikrant");

        System.out.println(a);

        Iterator i=a.iterator();
        while (i.hasNext()){
            String obj=(String)i.next();
            System.out.println(obj);
        }

        LinkedList l=new LinkedList();
        l.add("Rolex");
        l.add("Dilli");
        l.add("Leo");
        l.add("Arjun");
        l.add("Pushpa");
        l.addFirst("vikrat Rona");

        System.out.println(l);

        ListIterator li=l.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }

        Vector v=new Vector();
        v.addElement("A");
        v.addElement("B");
        v.addElement("C");
        v.addElement("D");
        v.addElement("E");

        System.out.println(v);
        System.out.println(v.size());
        Enumeration e=v.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        HashSet h=new HashSet();
        h.add("A");
        h.add("A");
        h.add("b");
        h.add("c");
        h.add("u");
        System.out.println(h);

        TreeSet t=new TreeSet();
        t.add("WW");
        t.add("Wd");
        t.add("rW");
        t.add("bW");
        System.out.println(t);

        HashMap m=new HashMap();
        m.put("a","avi");
        m.put("b","rock");
        m.put("c","paper");
        m.put("d","eeeeuuu");
        System.out.println(m);



    }
}
