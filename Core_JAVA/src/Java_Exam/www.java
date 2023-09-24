package Java_Exam;
import java.util.*;
import java.sql.*;
public class www {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/avi";
            String nm="root";
            String pass="avishkar";

            Connection conn=DriverManager.getConnection(url,nm,pass);
            String q="insert into emp values (?,?,?,?)";

            System.out.println("How: ");
            int n=sc.nextInt();
            PreparedStatement p=conn.prepareStatement(q);
            for(int i=0;i<n;i++) {
                System.out.println("id: ");
                int t1 = sc.nextInt();
                System.out.println("fname: ");
                String t2 = sc.next();
                System.out.println("lname: ");
                String t3 = sc.next();
                System.out.println("salary: ");
                int t4 = sc.nextInt();

                p.setInt(1,t1);
                p.setString(2,t2);
                p.setString(3,t3);
                p.setInt(4,t4);
                p.executeUpdate();
            }


            String q1="select * from emp";
            Statement s=conn.createStatement();
            ResultSet rs=s.executeQuery(q1);

            while (rs.next()){
                int i=rs.getInt(1);
                String j=rs.getString(2);

                System.out.println(i+"||"+j);
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
