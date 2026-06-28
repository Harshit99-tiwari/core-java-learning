package AWT;
import java.awt.*;
import java.awt.event.*;

class MyyFrame extends Frame
{
    int x=0,y=0;
  MyyFrame()
  {
    super("Painting");
     addMouseMotionListener(new MouseAdapter() {
        public void mouseMoved(MouseEvent m)
        {
            x = m.getX();
            y = m.getY();
            repaint();

        }
    });

   /*  addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent m)
        {
            x = m.getX();
            y = m.getY();
            repaint();

        }
    });*/
  }
  public void paint(Graphics g)
  {
      g.setColor(Color.ORANGE);
    //  g.drawOval(x,y,50,50);  only circle
   //   g.fillOval(x,y,150,150);  //filled  circle
        g.setFont(new Font("Times New Roman",Font.BOLD,30));
        g.drawString("Hello", x, y);
  }
}

public class AWTPaintingDemo {
    public static void main(String[] args) {
        MyyFrame f = new MyyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
