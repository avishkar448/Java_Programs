package Java_Exam;
import java.util.*;

public class data {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Hashtable h=new Hashtable();
        System.out.println("How many no you want?? ");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("Name: ");
            String a=sc.next();
            System.out.println("Percentage: ");
            String b=sc.next();

            h.put(a,b);
        }
        Enumeration e=h.elements();
        Enumeration k=h.keys();
        while(k.hasMoreElements()){
            System.out.println(k.nextElement()+"::"+e.nextElement());
        }

    }
}
