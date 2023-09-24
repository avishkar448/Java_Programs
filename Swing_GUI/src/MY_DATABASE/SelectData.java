package MY_DATABASE;
import java.sql.*;
import java.util.*;

public class SelectData {
    public static void main(String[] args) {
        try{
            Connection conn=ConnectionProvider.getConnection();

            String q="Select * from emp";

            Statement s=conn.createStatement();
            ResultSet set=s.executeQuery(q);

            while(set.next()){
                int id=set.getInt(1);
                String nm=set.getString(2);

                System.out.println(id +" | "+nm );

            }
            conn.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
