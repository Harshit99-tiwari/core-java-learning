package AWT;

import java.awt.*;
import java.awt.event.*;

class MyFrame3 extends Frame 
{
    Label l1,l2;
    TextField tf;
    
    public MyFrame3()
    {
        super("Textfield demo");
        l1 = new Label("No text is entered yet");
        l2 = new Label("Enter key is not yet hit");
        tf = new TextField(30);
        tf.setEchoChar('*');

        Handler H = new Handler();

        tf.addTextListener(H);
        tf.addActionListener(H);

        setLayout(new FlowLayout());
        add(l1);
        add(tf);
        add(l2);
    }
   
    class Handler implements TextListener,ActionListener
    {
        public void textValueChanged(TextEvent te)
    {
       l1.setText(tf.getText());
    }
    public void actionPerformed(ActionEvent ae)
    {
       l2.setText(tf.getText());
    }
    }
}


public class Textfielddemo {
    public static void main(String[] args) {
         MyFrame3 f=new MyFrame3();
        f.setSize(300,300);
        f.setVisible(true);
    }
}