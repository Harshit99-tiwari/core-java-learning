package AWT;
import java.awt.*;


public class BasicAwtFormDemo {
    public static void main(String[] args) {
        Frame f=new Frame("My First App");
        f.setLayout(new FlowLayout());

        Button b=new Button("OK");
        Label l =new Label("name");
        TextField tf=new TextField(30);

        f.add(l);
        f.add(tf);
        f.add(b);

        f.setSize(500,500);
        f.setVisible(true);
    }
}
