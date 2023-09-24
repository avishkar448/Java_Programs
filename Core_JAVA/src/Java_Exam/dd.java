package Java_Exam;
import java.sql.*;
public class dd {
        public static void main(String args[]) {
            Connection conn;
            Statement stmt;
            try{
                // Class.forName("com.mysql.cj.jdbc.Driver");

                String url="jdbc:mysql://localhost:3306/avi";
                String username="root";
                String password="9730328530";

                conn=DriverManager.getConnection(url,username,password);

                String q="insert into user1 (uname,email,phone_no,upassword) values(?,?,?,?)";
                PreparedStatement pstmt=conn.prepareStatement(q);

                pstmt.setString(1,"Avishkar");
                pstmt.setString(2,"rock");
                pstmt.setString(3,"970325554");
                pstmt.setString(4,"aaaaa");

                pstmt.executeUpdate();

            }
            catch (Exception e){
                e.printStackTrace();
                System.out.println("Error");

            }

            System.out.println("Done!!!");

        }
}
