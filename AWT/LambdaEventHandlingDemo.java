package AWT;
import java.awt.*;
import java.awt.event.*;
// Event Handling using LAMBDA EXPRESSION
class EFrame3 extends Frame 
{
    TextField tf;
    Button b;
    int count = 0;
   public EFrame3()
   {
     super("EventHandling Demo");

     tf = new TextField("0");
     b = new Button("Click");

     setLayout(new FlowLayout());
     add(tf);
     add(b);
     b.addActionListener((ActionEvent e)-> {  count++;  tf.setText(String.valueOf(count));  } ); }
}

public class LambdaEventHandlingDemo {
      public static void main(String[] args) {
         EFrame3 f = new EFrame3();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
