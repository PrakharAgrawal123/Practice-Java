import java.awt.*;
import java.awt.event.*;

public class CheckBoxExample {
  public static void main(String[] args) {
    Frame frame = new Frame("Checkbox Example");

    Checkbox checkbox1 = new Checkbox("Java", true);
    checkbox1.setBounds(50, 100, 100, 50);

    Checkbox checkbox2 = new Checkbox("Python");
    checkbox2.setBounds(50, 150, 100, 50);

    Label label = new Label();
    label.setBounds(50, 250, 300, 50);

    // Adding ItemListener to Checkbox
    checkbox1.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        label.setText("Java Checkbox: " + checkbox1.getState());
      }
    });

    checkbox2.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        label.setText("Python Checkbox: " + checkbox2.getState());
      }
    });

    frame.add(checkbox1);
    frame.add(checkbox2);
    frame.add(label);

    frame.setSize(400, 400);
    frame.setLayout(null);
    frame.setVisible(true);
  }
}