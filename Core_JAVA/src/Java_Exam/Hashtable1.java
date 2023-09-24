package Java_Exam;
import java.util.*;

public class Hashtable1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many no you want:  ");
        int n=sc.nextInt();
        Hashtable h=new Hashtable();
        System.out.println("Enter the record: ");

        for(int i=0;i<n;i++){
            System.out.println("Name of student: ");
            String str=sc.next();
            System.out.println("Percentage: ");
            String p= sc.next();

            h.put(str,p);
        }
        System.out.println("Student info: ");
        Enumeration e=h.elements();
        Enumeration k=h.keys();
        while (k.hasMoreElements()){
            System.out.println(k.nextElement() +" : "+ e.nextElement());
        }



    }
}
