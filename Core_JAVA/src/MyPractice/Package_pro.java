package MyPractice;
import java.util.*;
class StudentInfo{
    void display(int rno,String name,String c,double per){
        System.out.println("Roll No: "+rno);
        System.out.println("Name: "+name);
        System.out.println("Class: "+c);
        System.out.println("Percentage: "+per);
    }
}
class StudentPer{
    double Percentage(int a,int b, int c){
        int sum=a+b+c;
        double per=(sum/300)*100;
        return per;
    }
}
public class Package_pro {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Student roll,name,class,m1,m2,m3");
        int a=sc.nextInt();
        String nm=sc.next();
        String c=sc.next();
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();

        StudentPer p=new StudentPer();
        StudentInfo i=new StudentInfo();
        double x=p.Percentage(m1,m2,m3);
        i.display(a,nm,c,x);
    }
}
