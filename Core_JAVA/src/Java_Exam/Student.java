package Java_Exam;
import java.sql.SQLOutput;
import java.util.*;

public class Student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many number number you want ??: ");
        int n=sc.nextInt();
        ArrayList a=new ArrayList();
        System.out.println("Enter record: ");
        for(int i=0;i<n;i++){
            System.out.println("Enter name: ");
            String name=sc.next();
            a.add(name);
        }
        System.out.println("Student Info: ");
        ListIterator i=a.listIterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
