package JavaSwing;
import java.awt.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.*;

class My extends JFrame implements ListSelectionListener {
    JSplitPane sp;
    JList List;
    JLabel lbl;

    My() {
        super("Split Demo");
        String col[] = { "RED", "BLACK", "YELLOW", "PINK", "GREEN" };
        List = new JList(col);
        List.setSelectedIndex(0);
        List.addListSelectionListener(this);
        JScrollPane p1 = new JScrollPane(List);

        lbl = new JLabel(" ");
        lbl.setOpaque(true);
        lbl.setBackground(Color.RED);
        JScrollPane p2 = new JScrollPane(lbl);

        JTabbedPane tp = new JTabbedPane();
        tp.addTab("Colors", p1);
        tp.addTab("Label", p2);
        add(tp);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        String str = (String) List.getSelectedValue();
        switch (str) {
            case "RED":
                lbl.setBackground(Color.RED);
                break;
            case "BLACK":
                lbl.setBackground(Color.BLACK);
                break;
            case "YELLOW":
                lbl.setBackground(Color.YELLOW);
                break;
            case "GREEN":
                lbl.setBackground(Color.GREEN);
                break;
            case "PINK":
                lbl.setBackground(Color.PINK);
                break;

        }
    }
}
public class JTabbedPaneDemo {
      public static void main(String[] args) {
        My m = new My();
        m.setSize(800, 800);
        m.setVisible(true);
    }
}
