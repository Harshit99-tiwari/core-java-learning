package JavaSwing;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class MyinternalFrame extends JInternalFrame
{
    static int count = 0;
      JTextArea ta;
      JScrollPane sp;
      MyinternalFrame()
      {
        super("Document"+(++count),true,true,true,true);
        ta = new JTextArea();
        sp = new JScrollPane(ta);
        add(sp);

        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("file");
        JMenuItem mi = new JMenuItem("Save");

        file.add(mi);
        mb.add(file);
        setJMenuBar(mb);

        setSize(300, 300);
        setLocation(50,50);
        setVisible(true);
      }
}
class mfframe extends JFrame implements ActionListener
{
    JDesktopPane dp;
    mfframe()
    {
        super("Internal Frame Demo ");
        dp = new JDesktopPane();
        setContentPane(dp);

        
        JMenuBar mb = new JMenuBar();
        JMenu d = new JMenu("Doccument");
        JMenuItem mi = new JMenuItem("New");

        d.add(mi);
        mb.add(d);
        setJMenuBar(mb);
        mi.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        MyinternalFrame mi =new MyinternalFrame();
        dp.add(mi);
    }
}
public class InternalFrameDemo {
     public static void main(String[] args) {
        mfframe f = new mfframe();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
