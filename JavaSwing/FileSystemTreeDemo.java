package JavaSwing;

//import java.util.StringTokenizer;
import javax.swing.*;
import javax.swing.tree.*;

import java.awt.BorderLayout;
import java.io.*;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

class myFrame extends JFrame implements TreeSelectionListener
 {
    JTree tree;
    JLabel label;

    myFrame() {
        super("Tree demo");

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("C:\\Users\\Admin\\Desktop\\HAJAVA");
        File f = new File("C:\\Users\\Admin\\Desktop\\HAJAVA");

        for (File x : f.listFiles()) {
            if (x.isDirectory()) {
                DefaultMutableTreeNode temp = new DefaultMutableTreeNode("C:\\Users\\Admin\\Desktop\\HAJAVA");
                for (File y : x.listFiles()) {
                    temp.add(new DefaultMutableTreeNode(y.getName()));
                }
                root.add(temp);
            } else
                root.add(new DefaultMutableTreeNode(x.getName()));
        }
        tree = new JTree(root);
        label = new JLabel("No Files Selected");
        tree.addTreeSelectionListener(this);
        JScrollPane jp = new JScrollPane(tree);

        add(jp, BorderLayout.CENTER);
        add(label, BorderLayout.SOUTH);

    }
    @Override
    public void valueChanged(TreeSelectionEvent e)
    {
      label.setText(e.getPath().toString());
    }
}

public class FileSystemTreeDemo {
     public static void main(String[] args) {
        myFrame f = new myFrame();
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
