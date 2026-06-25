package AWT;

import java.awt.*;
class myframs extends Frame
{
   Button b1,b2,b3,b4,b5,b6;
   myframs()
   {
    super("Flowlayout Demo");
    b1 = new Button("One");
    b2 = new Button("Two");
    b3 =  new Button("Three");
    b4 =  new Button("Four");
    b5 =  new Button("Five");
    b6 =  new Button("Six");

    FlowLayout fl = new FlowLayout();
    fl.setAlignment(FlowLayout.RIGHT);
    fl.setHgap(100);
    setLayout(fl);

    add(b1);
    add(b2);
    add(b3);
    add(b4);
    add(b5);
    add(b6);

   }
}

public class FlowLayoutdemo {
    public static void main(String[] args) {
        myframs f = new myframs();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
