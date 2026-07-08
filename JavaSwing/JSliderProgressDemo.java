package JavaSwing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.event.*;
import java.awt.BorderLayout;
//import java.awt.event.*;
import java.awt.Graphics;

class fram extends JFrame implements ChangeListener {
    JSlider sl;
    JPanel p1, p2;
    JProgressBar pb;
    int w = 50;

    fram() {
        sl = new JSlider(0, 100, 50);
        sl.addChangeListener(this);
        sl.setMajorTickSpacing(10);
        sl.setMinorTickSpacing(1);
        sl.setPaintTicks(true);
        sl.setPaintLabels(true);

        pb = new JProgressBar();
        pb.setString("%50");
        pb.setStringPainted(true);
        // pb.setIndeterminate(false);

        p1 = new JPanel() {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawOval(200, 200, w, w);
            }
        };
        p2 = new JPanel();
        p2.add(pb);

        add(sl, BorderLayout.NORTH);
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);

    }

    public void stateChanged(ChangeEvent e) {
        w = sl.getValue();
       // pb.setStringPainted(true);
        pb.setValue(w);
        pb.setString(w + "%");
        p1.repaint();
    }
}

public class JSliderProgressDemo {
     public static void main(String[] args) {
        fram f = new fram();
        f.setSize(800, 800);
        f.setVisible(true);

    }
}
