package JavaAWT;

import java.sql.*;

public class Myconn {
    public static void main(String[] args) {

        try {
            String url = "jdbc:mysql://localhost:3306/myjava";
            String username = "root";
            String password = "avishkar";

            Connection conn = DriverManager.getConnection(url, username, password);

//            if(conn.isClosed()){
//                System.out.println("Database not connected");
//            }
//            else{
//                System.out.println("Database has connected!!!!");
//            }

            String q="Create table product(id int primary key auto_increment,Pname varchar(20))";

            Statement smtp=conn.createStatement();
            smtp.executeUpdate(q);

            System.out.println("Table has been created!!");

            conn.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
