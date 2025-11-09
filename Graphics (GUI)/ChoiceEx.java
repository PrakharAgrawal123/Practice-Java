import java.awt.*;
import java.awt.event.*;

public class ChoiceEx {
  public static void main(String[] args) {
    Frame f = new Frame("AWT Choice Example");
    f.setSize(400, 300);
    f.setLayout(new FlowLayout());

    Choice c = new Choice();
    c.add("Apple");
    c.add("Banana");
    c.add("Orange");
    c.add("Mango");

    c.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        System.out.println("Selected: " + c.getSelectedItem());
      }
    });

    f.add(c);

    f.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        f.dispose();
      }
    });

    f.setVisible(true);
  }
}
