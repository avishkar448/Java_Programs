package MY_DATABASE;
import java.sql.*;
import java.util.*;

public class MyUpdate {
    public static void main(String[] args) {
        try{
            Connection con=ConnectionProvider.getConnection();

            String q="Update emp set fname=? where id=?";

            Scanner sc=new Scanner(System.in);

            System.out.println("Enter new name: ");
            String nm=sc.next();

            System.out.println("Enter id: ");
            int id=sc.nextInt();

            PreparedStatement p=con.prepareStatement(q);

            p.setString(1,nm);
            p.setInt(2,id);

            p.executeUpdate();

            con.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
