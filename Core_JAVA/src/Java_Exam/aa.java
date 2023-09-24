package Java_Exam;
import java.sql.*;
import java.util.*;

public class aa {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/avi";
            String nm="root";
            String p="avishkar";

            Connection conn=DriverManager.getConnection(url,nm,p);
            String q="select * from emp";
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(q);
            while(rs.next()){
                int a=rs.getInt(1);
                String b=rs.getString(3);
                System.out.println(a+"||"+b);

            }
        }

        catch (Exception e){
            e.printStackTrace();

        }
    }
}
