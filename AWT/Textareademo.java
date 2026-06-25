package AWT;

import java.awt.*;
import java.awt.event.*;

class MyFrame4 extends Frame implements ActionListener
{
    TextArea ta;
    TextField tf;
    Label l;
    Button b;

    public MyFrame4()
    {
        super("Textarea demo");
        l  = new Label("No text entered");
        ta = new TextArea(10,30);
        tf = new TextField(20);
        b  = new Button("Click");

        setLayout(new FlowLayout());

        add(ta);
        add(l);
        add(tf);
        add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
       // ta.append(tf.getText());
       // l.setText(ta.getSelectedText());
        ta.insert(tf.getText(), ta.getCaretPosition());
    }
}

public class Textareademo {
    public static void main(String[] args) {
         MyFrame4 f=new MyFrame4();
        f.setSize(300,300);
        f.setVisible(true);
    }
}
