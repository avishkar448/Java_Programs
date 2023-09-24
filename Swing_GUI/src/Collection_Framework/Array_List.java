package Collection_Framework;
import java.util.*;
public class Array_List {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many number you want: ");
        int n=sc.nextInt();

        String str[]=new String[n];
        System.out.println("Enter values: ");

        ArrayList a=new ArrayList();
        for(int i=0;i<n;i++){
            a.add(str[i]);
        }
        for (String ele:str) {
            System.out.println("ArrayList: "+ele);
        }
    }
}
