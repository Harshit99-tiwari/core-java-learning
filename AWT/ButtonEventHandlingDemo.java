package AWT;
import java.awt.*;
import java.awt.event.*;

class MyFrame1 extends Frame implements ActionListener
{
    int count=0;
    Label l ;
    Button b;

    public MyFrame1()
    {
        super("Button Demo");

        l=new Label("   "+count);
        b=new Button("click");
        b.addActionListener(this);
        
        setLayout(new FlowLayout());
        add(l);
        add(b);  
       
    }
    public void actionPerformed(ActionEvent e)
    {
       count++;
       l.setText("  "+count);
    }
}
public class ButtonEventHandlingDemo
{
    public static void main(String[] args) {
        MyFrame1 f=new MyFrame1();
        f.setSize(300,300);
        f.setVisible(true);
    }
}
