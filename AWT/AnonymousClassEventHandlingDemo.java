package AWT;
import java.awt.*;
import java.awt.event.*;
// Event Handling using Anonymous Class
class EFrame2 extends Frame 
{
    TextField tf;
    Button b;
    int count = 0;
   public EFrame2()
   {
     super("EventHandling Demo");

     tf = new TextField("0");
     b = new Button("Click");

     setLayout(new FlowLayout());
     add(tf);
     add(b);
     b.addActionListener(new ActionListener()
     {
      public void actionPerformed(ActionEvent e)
      {
        count++;
        tf.setText(String.valueOf(count));
      }
   });
   }

}
public class AnonymousClassEventHandlingDemo {
    public static void main(String[] args) {
           EFrame2 f = new EFrame2();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
