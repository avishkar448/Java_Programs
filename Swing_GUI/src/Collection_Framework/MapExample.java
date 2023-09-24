package Collection_Framework;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String,Integer> c=new HashMap<>();

        //add element
        c.put("Avishkar",98);
        c.put("Abhay",90);
        c.put("Rocky",89);
        c.put("salman",80);
        c.put("salman",54);

        System.out.println(c);

        c.forEach((e1,e2)->{
            System.out.println(e1+"=>"+ e2);
        });


    }
}
