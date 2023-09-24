package MyPractice;
import java.awt.*;
public class Checkbox1 {
    public static void main(String[] args) {
        Frame f=new Frame("my frame");
        CheckboxGroup ch=new CheckboxGroup();
        Checkbox check1=new Checkbox("java",ch,false);
        check1.setBounds(100,100,50,50);
        Checkbox check2=new Checkbox("python",ch,true);
        check2.setBounds(100,150,50,50);

        f.add(check1);
        f.add(check2);

        f.setVisible(true);
        f.setLayout(null);
    }
}
