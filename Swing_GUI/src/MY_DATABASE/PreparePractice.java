package MY_DATABASE;
import java.sql.*;
import java.util.*;

public class PreparePractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/avi","root","avishkar");

            System.out.println("How many emp detail enter: ");
            int e=sc.nextInt();
            for(int i=0;i<e;i++){
                System.out.println("id: ");
                int id=sc.nextInt();
                System.out.println("Fname: ");
                String fn=sc.next();
                System.out.println("Lname: ");
                String ln=sc.next();
                System.out.println("Salary: ");
                int s=sc.nextInt();

                String q="insert into emp values (?,?,?,?)";
                PreparedStatement p=conn.prepareStatement(q);
                p.setInt(1,id);
                p.setString(2,fn);
                p.setString(3,ln);
                p.setInt(4,s);

                p.executeUpdate();


            }
        }
        catch(Exception e){
            e.printStackTrace();

        }
    }
}
