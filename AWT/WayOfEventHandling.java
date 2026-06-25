package AWT;
import java.awt.*;
import java.awt.event.*;

class EFrame extends Frame implements ActionListener
{
    TextField tf;
    Button b;
    int count = 0;
   public EFrame()
   {
     super("EventHandling Demo");

     tf = new TextField("0");
     b = new Button("Click");

     setLayout(new FlowLayout());
     add(tf);
     add(b);
     b.addActionListener(this);
   }
   public void actionPerformed(ActionEvent e)
   {
    count++;
    tf.setText(String.valueOf(count));
   }
}
public class WayOfEventHandling {
      public static void main(String[] args) {
        EFrame f = new EFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
}