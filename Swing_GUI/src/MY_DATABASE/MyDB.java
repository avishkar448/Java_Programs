package MY_DATABASE;
import java.util.*;
import java.sql.*;
public class MyDB {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/avi";
            String user="root";
            String pass="avishkar";

            Connection conn=DriverManager.getConnection(url,user,pass);
            String q="select * from emp";
            Statement s=conn.createStatement();
            ResultSet rs=s.executeQuery(q);

            while(rs.next()){
                int id=rs.getInt(1);
                String name=rs.getString(2);
                int salary=rs.getInt(4);

                System.out.println(id+" : "+name+" : "+salary);

            }
            conn.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
