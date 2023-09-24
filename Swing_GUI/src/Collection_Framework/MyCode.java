package Collection_Framework;
import java.util.*;

public class MyCode {
    public static void main(String[] args) {
        /*
        Creating collection
        1) Type Safe - same type of elements are added to collection

        2) Un Type safe - different types of elements can be added to collection

         */
        //Type safe collection
        ArrayList <String> name = new ArrayList<String>();
        name.add("Avishkar");
        name.add("Avishkar");
        name.add("Abhay");
        name.add("Tushar");
        name.add("Pranil");

        System.out.println(name);
//        System.out.println(name.get(3)); get element

        name.remove("Avishkar");//remove
        System.out.println(name);

        System.out.println(name.size());//check

        System.out.println(name.contains("Abhay"));

        //check for empty
        System.out.println(name.isEmpty());

        //setting value
       // name.set(1,"John cena");

        name.add(1,"John cena");
        System.out.println(name);

       // name.clear();
      //  System.out.println(name);

        //untype safe
//        LinkedList list=new LinkedList();
//        list.add("Virat");
//        list.add("75");
//        list.add("50.23");
//        list.add(true);
//
//        System.out.println(list);


        Vector<String> v=new Vector<>();
        v.addAll(name);
        System.out.println("Vector: "+v);

        System.out.println("______________________________________");

        HashSet<Double>n=new HashSet<>();
        n.add(21.4343);
        n.add(43.543);
        n.add(42.6776);
        n.add(432.3454);
        n.add(432.3454);

        System.out.println(n);

        TreeSet<Double> t=new TreeSet<>();
        t.addAll(n);

        System.out.println(t);


    }
}

