package MyPractice;
import java.awt.*;
class AWTExample extends Frame{
    AWTExample(){
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
         AWTExample a=new AWTExample();
    }
}
