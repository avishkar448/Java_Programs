package JavaAWT;
import java.awt.*;
class AWTExample2 {
    AWTExample2(){
        Frame f=new Frame();

        Label l=new Label("Employee id");

        Button b=new Button("Submit");

        TextField t=new TextField();

        l.setBounds(20,80,80,30);
        t.setBounds(20,100,80,30);
        b.setBounds(100,100,80,30);

        f.add(l);
        f.add(t);
        f.add(b);

        f.setSize(400,300);
        f.setTitle("Employee info");
        f.setLayout(null);
        f.setVisible(true);
    }
}

public class Frame2 {
    public static void main(String[] args) {
        AWTExample2 a1=new AWTExample2();
    }
}
