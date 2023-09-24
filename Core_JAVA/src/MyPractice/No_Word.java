package MyPractice;
import java.io.*;
public class No_Word {
    public static void main(String[] args) throws Exception {
        String line ;
        int count=0;
        int count1=0;
        File f=new File("myfile1.txt");
        FileReader f1=new FileReader(f);
        BufferedReader br=new BufferedReader(f1);
        if(f.exists()){
            while ((line= br.readLine())!=null){
                String[] words =line.split(" ");
                String[] lines =line.split("\n");
                count+=words.length;
                count1+=lines.length;
            }
            System.out.println("Number of words: "+count);
            System.out.println("Number of Lines: "+count1);
            br.close();
        }
        else {
            System.out.println("File not exsist: ");
        }

    }
}
