package Java_Exam;
import java.util.*;
import java.sql.*;

public class Datab {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/avi";
            String user="root";
            String pass="avishkar";

            Connection conn=DriverManager.getConnection(url,user,pass);
            String q="Select * from emp";
            Statement stmt= conn.createStatement();
            ResultSet set=stmt.executeQuery(q);
            while (set.next()){

                int a=set.getInt(1);
                String b=set.getString(2);
                String c=set.getString(3);

                System.out.println(a +" || "+b+" || "+c);
            }


//            //Preparesatement
            String q1="update emp set f_name=? where id=?";
            PreparedStatement p=conn.prepareStatement(q1);

            System.out.println("Enter name : ");
            String nm=sc.next();
            System.out.println("Enter id : ");
            int x=sc.nextInt();

            p.setInt(2,x);
            p.setString(1,nm);
            p.executeUpdate();

            //insert value
            String q2="insert into emp values (?,?,?,?)";
            PreparedStatement p1=conn.prepareStatement(q2);

            System.out.println("How many emp you insert??  ");
            int n=sc.nextInt();

            for(int i=0;i<n;i++){
                System.out.println("id: ");
                int t1=sc.nextInt();
                System.out.println("fname: ");
                String t2=sc.next();
                System.out.println("lname: ");
                String t3=sc.next();
                System.out.println("salary: ");
                int t4=sc.nextInt();

                p1.setInt(1,t1);
                p1.setString(2,t2);
                p1.setString(3,t3);
                p1.setInt(4,t4);

                p1.executeUpdate();
            }

            //delete
            String q3="delete from emp where id=?";
            PreparedStatement p2=conn.prepareStatement(q3);

            System.out.println("Id : ");
            int xx=sc.nextInt();
            p2.setInt(1,xx);
            p2.executeUpdate();


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
