package AWT;
import java.awt.*;
import java.awt.event.*;

class FFFrame extends Frame implements WindowListener
{
    Label l;

    public FFFrame()
    {
      super("Windowevent Demo");
      l=new Label("");

      setLayout(new FlowLayout());
      add(l);
      
      addWindowListener(this);
    }
    public void windowActivated(WindowEvent w)
    {
       l.setText("Window Activated");
    }
    public void windowClosing(WindowEvent w)
    {
         l.setText("Window Closing");
         System.exit(0);
    }
    public void windowIconified(WindowEvent w)
    {
         l.setText("Window Iconified");
    }
    public void windowOpened(WindowEvent w)
    {
         l.setText("Window Opened");
    }
    public void windowClosed(WindowEvent w)
    {
         l.setText("Window Closed");
    }
    public void windowDeiconified(WindowEvent w)
    {
         l.setText("Window Deiconified");
    }
    public void windowDeactivated(WindowEvent w)
    {
         l.setText("Window Deactivated");
    }
}

public class WindowEventDemo {
    public static void main(String[] args) {
        FFFrame f = new FFFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
}