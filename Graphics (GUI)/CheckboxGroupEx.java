import java.awt.*;
import java.awt.event.*;

public class CheckboxGroupEx {
  public static void main(String[] args) {
    Frame frame = new Frame("CheckboxGroup Example");

    CheckboxGroup group = new CheckboxGroup();
    Checkbox cb1 = new Checkbox("Male", group, false);
    cb1.setBounds(100, 100, 50, 50);
    Checkbox cb2 = new Checkbox("Female", group, false);
    cb2.setBounds(100, 150, 50, 50);

    Label label = new Label();
    label.setBounds(100, 250, 250, 50);

    // Adding ItemListener to the CheckboxGroup items
    cb1.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        label.setText("Selected: Male");
      }
    });

    cb2.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        label.setText("Selected: Female");
      }
    });

    frame.add(cb1);
    frame.add(cb2);
    frame.add(label);

    frame.setSize(400, 400);
    frame.setLayout(null);
    frame.setVisible(true);
  }
}