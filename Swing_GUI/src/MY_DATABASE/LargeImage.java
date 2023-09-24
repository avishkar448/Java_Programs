package MY_DATABASE;
import Swing_Practice.JFilechooser1;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.sql.*;

public class LargeImage {
    public static void main(String[] args) {
        try{
           Connection c=ConnectionProvider.getConnection();

           String q="insert into image(pic) values(?)";

           PreparedStatement p=c.prepareStatement(q);

            JFileChooser j=new JFileChooser();
            j.showOpenDialog(null);

            File f=j.getSelectedFile();

            FileInputStream file=new FileInputStream(f);

           p.setBinaryStream(1,file,file.available());

           p.executeUpdate();

            System.out.println("Done!!!");
        //    Connection conn=DriverManager.getConnection();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
