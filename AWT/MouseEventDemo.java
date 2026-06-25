package AWT;
import java.awt.*;
import java.awt.event.*;

class MMFrame extends Frame implements MouseListener,MouseMotionListener
{
    Label l,l2;
   public MMFrame()
    {
    super("Mouseevent demo");
    l = new Label("");
    l2 = new Label("");
    setLayout(null);

    l.setBounds(10,50,100,20);
    l2.setBounds(10,80,100,20);
    add(l);
    add(l2);

    addMouseListener(this);
    addMouseMotionListener(this);
    }
    public void mousePressed(MouseEvent m)
    {
      l.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent m)
    {
         l.setText("Mouse Released");
    }
    public void mouseDragged(MouseEvent m)
    {
         l.setText("Mouse Dragged");
    }
    public void mouseEntered(MouseEvent m)
    {
         l.setText("Mouse Entered");
    }
    public void mouseClicked(MouseEvent m)
    {
         l.setText("Mouse Clicked");
    }
    public void mouseMoved(MouseEvent m)
    {
         l.setText("Mouse Moved");
         l2.setText("( "+m.getX()+","+m.getY()+" )");
    }
    public void mouseExited(MouseEvent m)
    {
         l.setText("Mouse Exited");
    }
}

public class MouseEventDemo {
    public static void main(String[] args) {
        MMFrame f = new MMFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
}