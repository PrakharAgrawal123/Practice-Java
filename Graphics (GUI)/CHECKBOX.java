import java.awt.*;
import java.awt.event.*;

public class CHECKBOX {
  public static void main(String[] args) {
    Frame f = new Frame();
    Checkbox c1 = new Checkbox("Java", true);
    c1.setBounds(50, 100, 100, 50);
    Checkbox c2 = new Checkbox("Python");
    c2.setBounds(50, 150, 100, 50);
    Label l = new Label();
    l.setBounds(50, 250, 300, 50);

    c1.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        l.setText("Java CheckBox: " + c1.getState());
      }
    });

    c2.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        l.setText("Python CheckBox: " + c2.getState());
      }
    });

    f.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        f.dispose();
        System.exit(0);
      }
    });

    f.add(c1);
    f.add(c2);
    f.add(l);

    f.setSize(500, 500);
    f.setLayout(null);
    f.setVisible(true);

  }
}
