package JavaSwing;
import java.awt.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.*;

class Myy extends JFrame implements ListSelectionListener {
    JSplitPane sp;
    JList List;
    JLabel lbl;

    Myy() {
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

        sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, p1, p2);
        sp.setDividerLocation(200);
        add(sp);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
     String str = (String)List.getSelectedValue();
     switch (str) {
        case "RED": lbl.setBackground(Color.RED);
            break;
        case "BLACK": lbl.setBackground(Color.BLACK);
            break;
        case "YELLOW": lbl.setBackground(Color.YELLOW);
            break;
        case "GREEN": lbl.setBackground(Color.GREEN);
            break;
        case "PINK": lbl.setBackground(Color.PINK);
            break;
        
     
       
     }
    }
}

public class JSplitPaneDemo {
      public static void main(String[] args) {
        Myy m = new Myy();
        m.setSize(800, 800);
        m.setVisible(true);

    }
}
