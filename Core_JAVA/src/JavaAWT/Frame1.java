package JavaAWT;
import java.awt.*;
class AWTExample1 extends Frame{
    AWTExample1(){
        Button b=new Button("click me");
        b.setBounds(30,100,80,30);
        add(b);

        setSize(300,300);

        setTitle("This is our basic AWT example ");

        setLayout(null);

        setVisible(true);
    }

}
public class Frame1 {

    public static void main(String[] args) {
        AWTExample1 a=new AWTExample1();
    }
}

