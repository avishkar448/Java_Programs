package MY_DATABASE;
import java.sql.*;

public class ConnectionProvider {
    public static Connection conn;

    public static Connection getConnection() {
        try {
            if (conn == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");

                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myjava", "root", "avishkar");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
