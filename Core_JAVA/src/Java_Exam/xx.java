package Java_Exam;
import java.util.*;

public class xx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList a1=new ArrayList();
        a1.add("a");
        a1.add("b");
        a1.add("c");
        a1.add("d");
        a1.add("e");
        a1.add("f");

        Iterator j=a1.iterator();
        while(j.hasNext()){
            String obj=(String)j.next();
            System.out.println(obj);
        }

        ListIterator li=a1.listIterator();
        while (li.hasNext()){
            System.out.println(li.next());
        }





        Hashtable h=new Hashtable();
        System.out.println("How many record you want to insert?? ");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("id: ");
            int a=sc.nextInt();
            System.out.println("name: ");
            String nm=sc.next();

            h.put(a,nm);
        }

        System.out.println("All record: ");
        Enumeration e=h.elements();
        Enumeration k=h.keys();
        while (k.hasMoreElements()){
            System.out.println(k.nextElement()+" : "+e.nextElement());

        }
    }
}
