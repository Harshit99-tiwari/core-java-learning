package JavaSwing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

class MYframe extends JFrame implements ActionListener {
  JToolBar tb;
  JButton b1, b2, b3, b4, b5, b6, b7;
  JTextArea ta;

  MYframe() {
    super("Toolbar Demo");
    tb = new JToolBar();

    ImageIcon icon1 = new ImageIcon("JavaSwing/resource/Save.png");
    ImageIcon icon2 = new ImageIcon("JavaSwing/resource/add.png");
    ImageIcon icon3 = new ImageIcon("JavaSwing/resource/split.png");
    ImageIcon icon4 = new ImageIcon("JavaSwing/resource/folder.png");
    ImageIcon icon5 = new ImageIcon("JavaSwing/resource/cut.png");
    ImageIcon icon6 = new ImageIcon("JavaSwing/resource/copy.png");
    ImageIcon icon7 = new ImageIcon("JavaSwing/resource/cancel.png");

    b1 = new JButton(new ImageIcon(icon1.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
    b2 = new JButton(new ImageIcon(icon2.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
    b3 = new JButton(new ImageIcon(icon3.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
    b4 = new JButton(new ImageIcon(icon4.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
    b5 = new JButton(new ImageIcon(icon5.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
    b6 = new JButton(new ImageIcon(icon6.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
    b7 = new JButton(new ImageIcon(icon7.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));

    tb.add(b1);
    tb.add(b2);
    tb.add(b3);
    tb.addSeparator();
    tb.add(b4);
    tb.add(b5);
    tb.add(b6);
    tb.add(b7);

    ta = new JTextArea();
    JScrollPane sp = new JScrollPane(ta);

    add(tb, BorderLayout.NORTH);
    add(sp, BorderLayout.CENTER);

    JMenuBar mb = new JMenuBar();
    JMenu file = new JMenu("File");
    JMenuItem m1 = new JMenuItem("Save");
    JMenuItem m2 = new JMenuItem("Open");
    m2.setMnemonic(KeyEvent.VK_O);
    file.add(m1);
    file.addSeparator();
    file.add(m2);
    mb.add(file);
    setJMenuBar(mb);

    b1.addActionListener(this);
    m1.addActionListener(this);
    b2.setActionCommand("open");
    b2.addActionListener(this);
    m2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);

  }

  public void actionPerformed(ActionEvent ae) {
    if (ae.getActionCommand().equals("open"))
    {
    JFileChooser fc = new JFileChooser();
    fc.showOpenDialog(this);
    File f = fc.getSelectedFile();
    try {
      FileInputStream fi = new FileInputStream(f);
      byte b[] = new byte[fi.available()];
      fi.read(b);
      String str = new String(b);
      ta.setText(str);
      fi.close();
    } catch (Exception e) {
    }
  }
  else
     {
    Color col =  JColorChooser.showDialog(this, "Font", Color.yellow);
    ta.setForeground(col);
  }
  
  }

}

public class Tool {
  public static void main(String[] args) {
    MYframe f = new MYframe();
    f.setSize(600, 600);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }
}

