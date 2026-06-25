package AWT;
import java.awt.*;
import java.awt.event.*;
//Event Handling using Inner Class
class EFrame1 extends Frame 
{
    TextField tf;
    Button b;
    int count = 0;
   public EFrame1()
   {
     super("EventHandling Demo");

     tf = new TextField("0");
     b = new Button("Click");

     setLayout(new FlowLayout());
     add(tf);
     add(b);
     b.addActionListener(new Myactionlistener());
   }

   class Myactionlistener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
        count++;
        tf.setText(String.valueOf(count));
      }
   }
}
public class InnerClassEventHandlingDemo {
    public static void main(String[] args) {
         EFrame1 f = new EFrame1();
        f.setSize(400,400);
        f.setVisible(true);
    }
}

