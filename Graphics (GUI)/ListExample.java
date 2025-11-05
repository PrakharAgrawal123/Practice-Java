import java.awt.*;
import java.awt.event.*;

public class ListExample {
  public static void main(String[] args) {
    Frame frame = new Frame("List Example");

    List list = new List(4, false); // 4 visible items, single selection
    list.setBounds(100, 100, 100, 100);
    list.add("Item 1");
    list.add("Item 2");
    list.add("Item 3");
    list.add("Item 4");

    Label label = new Label();
    label.setBounds(100, 250, 200, 50);

    // Adding ActionListener to list
    list.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        label.setText("Selected: " + list.getSelectedItem());
      }
    });

    frame.add(list);
    frame.add(label);
    frame.setSize(400, 400);
    frame.setLayout(null);
    frame.setVisible(true);
  }
}