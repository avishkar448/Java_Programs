package MY_DATABASE;
import java.sql.*;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

       try{
           Class.forName("com.mysql.cj.jdbc.Driver");

           Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/avi","root","avishkar");
           String q="select * from emp";
           String q1="update emp set fname=? where id=?";
           Statement s=conn.createStatement();

           Scanner sc=new Scanner(System.in);

           System.out.println("Enter the name: ");
           String name1=sc.next();
           System.out.println("Enter the id: ");
           int id1=sc.nextInt();



           PreparedStatement p=conn.prepareStatement(q1);
           p.setInt(2,id1);
           p.setString(1,name1);

           p.executeUpdate();

           ResultSet rs=s.executeQuery(q);



           while(rs.next()){
               int id=rs.getInt(1);
               String name=rs.getString(2);

               System.out.println(id +"||"+name);
           }

       }
       catch (Exception ex){
            ex.printStackTrace();
       }
    }
}
