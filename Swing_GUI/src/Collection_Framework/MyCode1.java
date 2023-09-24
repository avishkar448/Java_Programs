package Collection_Framework;
import java.util.*;

public class MyCode1 {
    public static void main(String[] args) {
        ArrayList<String> n=new ArrayList<>();
        n.add("Virat");
        n.add("Rohit");
        n.add("Surya");
        n.add("Dhoni");
        n.add("Rahul");

        //for each loop
        for (String str:n) {
            System.out.println(str +"\t"+ str.length()+"\t");
            StringBuffer br=new StringBuffer(str);
            System.out.println(br.reverse());
        }
        System.out.println("_______________________________");

        //traversing through iterarator
        Iterator<String> itr = n.iterator();

        while(itr.hasNext()){
            String next=itr.next();
            System.out.println(next);
        }

        System.out.println("_______________________________");

        //backword traverse
        ListIterator<String> litr=n.listIterator(n.size());
        while(litr.hasPrevious()){
            String p=litr.previous();
            System.out.println(p);
        }

        System.out.println("__________________________");

        //for each method
        n.forEach(e->{
            System.out.println(e);
        });

        TreeSet<String> set=new TreeSet<>();
        set.addAll(n);

        set.forEach(e->{
            System.out.println(e);
        });

        //Comparator
        //Comparable

    }
}
