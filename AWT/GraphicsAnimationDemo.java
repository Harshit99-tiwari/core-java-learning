package AWT;
import java.awt.*;


class mmYframe extends Frame implements Runnable
{
  int x,y,tx,ty;
  
  mmYframe()
  {
    x=100;
    y=100;
    tx=ty=1;

    Thread t = new Thread(this);
    t.start();
  }
  public void paint(Graphics g)
  {
    g.setColor(Color.RED);
    g.fillOval(x,y,50,50);
  }
  public void run()
  {
    while(true)
   {
    x+=tx;
    y+=ty;

    if(x<0 || x>450)
        tx*=-1;
    if(y<0 || y>350)
        ty*=-1;
    repaint();
    try  { Thread.sleep(5);  } catch(Exception e){}
   }
  }
}

public class GraphicsAnimationDemo {
        public static void main(String[] args) {
        mmYframe f = new mmYframe();
        f.setSize(500,400);
        f.setVisible(true);
    }
}
