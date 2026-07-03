package JavaSwing;
import java.awt.*;
import javax.swing.border.*;
import javax.swing.*;

class MyFramex extends JFrame
{
    JLabel l;
    JTextField tf;
    JButton b;
    JPanel p;
    MyFramex()
    {
        l = new JLabel("Name");
        tf = new JTextField(20);
        b = new JButton("Ok");
        p = new JPanel();

        p.add(l);
        p.add(tf);
        p.add(b);

        Border br = BorderFactory.createTitledBorder("login");
        p.setBorder(br);

        setLayout(new FlowLayout());
         add(p); 
    }

}
public class SwingBorderDemo {
     public static void main(String[] args) {
        MyFramex f = new MyFramex();
        f.setSize(800,800);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
