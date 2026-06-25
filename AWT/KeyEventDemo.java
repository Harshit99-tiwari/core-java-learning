package AWT;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

class MFRAME extends Frame implements KeyListener
{
    Label l1, l2, l3, l4;

  public MFRAME() {
        super("Key event demo");

        l1 = new Label("");
        l2 = new Label("");
        l3 = new Label("");
        l4 = new Label("");

        setLayout(null);

        l1.setBounds(30,20,100,20);
        l2.setBounds(30,50,100,20);
        l3.setBounds(30,80,100,20);
        l4.setBounds(30,110,100,20);

        add(l1);
        add(l2);
        add(l3);
        add(l4);

        addKeyListener(this);
    }
    public void keyPressed(KeyEvent e)
    {
        l1.setText("keypressed");
        l2.setText("");
        }

    @Override
    public void keyReleased(KeyEvent e) {
        l2.setText("keyreleased");
        l1.setText("");
        l3.setText("");
        l4.setText("");
    }
    
    @Override
    public void keyTyped(KeyEvent e)
    {
        l3.setText("key Typed");
        l4.setText(new Date(e.getWhen())+"");
        
    }
}

public class KeyEventDemo {
    public static void main(String[] args) {
        MFRAME f = new MFRAME();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
