package MY_DATABASE;
import java.util.*;
import java.sql.*;

public class Menu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/avi","root","avishkar");
            Statement s=conn.createStatement();
            ResultSet rs;
            do{
            //    System.out.println("1:Update");
                System.out.println("1:Delete");
                System.out.println("100:Exit");
                System.out.println("Enter the choice: ");
                int choice=sc.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("enter emp id: ");
                        int id=sc.nextInt();
                        String q="Delete from emp where id='"+id+"'";
                        s.executeUpdate(q);
                        System.out.println("Delete successfully!!");
                    break;
                    case  100:
                        System.exit(0);

                }

            }
            while (true);

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
