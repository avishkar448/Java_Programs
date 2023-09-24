package Collection_Framework;
import java.util.*;
public class Hashset1 {
    public static void main(String[] args) {
        HashSet h=new HashSet();
        h.add("item 1");
        h.add("item 2");
        h.add("item 3");
        h.add("item 4");
        h.add("item 5");
        h.add("item 5");
        h.add("item 7");
        h.add("item 7");
        h.add("item 7");
        System.out.println(h);

        TreeSet t=new TreeSet();
        t.add(90);
        t.add(3);
        t.add(3);
        t.add(4);
        t.add(5);
        t.add(5);
        t.add(7);
        t.add(7);
        System.out.println(t);

        LinkedHashSet ls=new LinkedHashSet();
        ls.add(43);
        ls.add(3);
        ls.add(423);
        ls.add(4783);
        ls.add(409);
        ls.add(4432);
        System.out.println(ls);

    }
}
