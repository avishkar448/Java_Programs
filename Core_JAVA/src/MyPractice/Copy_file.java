package MyPractice;
import java.io.*;
import java.util.Scanner;

public class Copy_file {
    public static void Copy_content(File a,File b) throws Exception{
        FileInputStream in=new FileInputStream(a);
        FileOutputStream out=new FileOutputStream(b);

        try{
            int n;
            while((n=in.read())!=-1){
                out.write(n);
            }
        }
        finally {
            if(in!=null){
                in.close();
            }
        }
        System.out.println("File copied Succesfully");
    }
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Source file: ");
        String a=sc.nextLine();
        File x=new File(a);

        System.out.println("Enter the Destination file: ");
        String b=sc.nextLine();
        File y=new File(b);

        Copy_content(x,y);
    }
}
