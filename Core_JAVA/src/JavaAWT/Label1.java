package JavaAWT;
import java.awt.*;
public class Label1 {
    public static void main(String[] args) {
        Frame f=new Frame("Example");
        Label l1,l2;

        l1=new Label("First Label");
        l2=new Label("Second Label");

        Button b=new Button("click here");
      //  l1.setBounds(50,100,100,30);
        b.setBounds(50,100,80,30);
        f.add(l1);
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
