package JavaSwing;
import java.awt.*;
import javax.swing.*;
import javax.swing.UIManager.*;

class MyFrame1 extends JFrame
{
    MyFrame1()
    {
        JTextField tf = new JTextField(20);
        JButton b = new JButton("Click");
        setLayout(new FlowLayout());
        add(tf);
        add(b);

        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem o = new JMenuItem("Open");
        JMenuItem c = new JMenuItem("Close");
        file.add(o);
        file.add(c);
        mb.add(file);
        setJMenuBar(mb);

    }
}
public class SwingBasicsDemo {
      public static void main(String[] args) {
        MyFrame1 f = new MyFrame1();
        LookAndFeelInfo[] platf = UIManager.getInstalledLookAndFeels();
        for(LookAndFeelInfo info : platf)
        {
            System.out.println(info.getName());
        }
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    System.out.println(UIManager.getLookAndFeel());
    }
}
