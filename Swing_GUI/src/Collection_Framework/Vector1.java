package Collection_Framework;
import java.util.*;
public class Vector1 {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add(56);
        v.add(90);
        v.add(34);
        v.add(76);
        v.add(40);
        v.add(87);
        v.add(59);

        Enumeration e=v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
