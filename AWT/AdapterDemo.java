package AWT;
import java.awt.*;
import java.awt.event.*;

/*  class MyWindowAdapter extends WindowAdapter
    {
        public void windowClosing(WindowEvent w)
        {
            System.exit(0);
        }
    }*/

class fFrame extends Frame
{
   public fFrame()
    {
    super("Adapterclass Demo");
   // addWindowListener(new MyWindowAdapter());
      addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent w){
            System.exit(0);
        }
      });
    }
   /* class MyWindowAdapter extends WindowAdapter
    {
        public void windowClosing(WindowEvent w)
        {
            System.exit(0);
        }
    } */
}

public class AdapterDemo {
    public static void main(String[] args) {
        fFrame f = new fFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
}