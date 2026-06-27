package AWT;
import java.awt.*;
import java.awt.event.*;

class JFrame extends Frame
{
    Menu file,sub;
    MenuItem open,save,close,closeall;
    CheckboxMenuItem auto;

    TextField tf;
    public JFrame()
    {
     open = new MenuItem("Open");
     save = new MenuItem("Save");
     close = new MenuItem("Close");
     closeall = new MenuItem("Close All");
     auto = new CheckboxMenuItem("Auto Save");

     file = new Menu("File");
     sub = new Menu("Close");

     file.add(open);
     file.add(save);
     file.add(sub);
     file.add(auto);

     sub.add(close);
     sub.add(closeall);

     MenuBar mb = new MenuBar();
     mb.add(file);
     setMenuBar(mb);

     tf = new TextField(20);
     setLayout(new FlowLayout());
     add(tf);

    open.addActionListener((ActionEvent a)->tf.setText("Open"));
    save.addActionListener((ActionEvent a)->tf.setText("Save"));
    close.addActionListener((ActionEvent a)->tf.setText("Close"));
    closeall.addActionListener((ActionEvent a)->tf.setText("Close All"));

    auto.addItemListener((ItemEvent i)->
{
    if(auto.getState())
        tf.setText("Auto On");
    else
        tf.setText("Auto Off");
     
});
    }
}
public class MenuComponentDemo {
     public static void main(String[] args) {
        JFrame j = new JFrame();
        j.setSize(400,400);
        j.setVisible(true);
    }
}
