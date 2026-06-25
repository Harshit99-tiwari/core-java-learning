package AWT;

import java.awt.*;

class myframms extends Frame {
    Button b1, b2, b3, b4, b5, b6;

    public myframms() {
        super("BorderLayout Demo");
       // setLayout(new BorderLayout());
        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");
        b5 = new Button("Five");
        b6 = new Button("Six");

        add(b1, BorderLayout.NORTH);
        // add(b2,BorderLayout.EAST);
        add(b3, BorderLayout.SOUTH);
        add(b4, BorderLayout.WEST);
        add(b5, BorderLayout.CENTER);
        // add(b6);
    
        Panel p = new Panel();
        p.setLayout(new GridLayout(3,1));
        p.add(new Button("Mon"));
        p.add(new Button("Tue"));
        p.add(new Button("Wed"));
        add(p, BorderLayout.EAST);

    }
}

public class BorderLayoutDemo {
    public static void main(String[] args) {
        myframms f = new myframms();
        f.setSize(400, 400);
        f.setVisible(true);
    }
}