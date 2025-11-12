
import java.awt.*;
import java.awt.event.*;

public class DailogExample extends Frame implements ActionListener {
  Dialog d;
  Button b1, b2;

  DailogExample() {
    // Frame setup
    setTitle("Dialog Example");
    setSize(400, 300);
    setLayout(null);

    b1 = new Button("Open Dialog");
    b1.setBounds(120, 100, 150, 40);
    add(b1);
    b1.addActionListener(this);

    // Create a Dialog (parent = this, title, modal = true)
    d = new Dialog(this, "My Dialog", true);
    d.setLayout(null);
    d.setSize(300, 200);

    Label l = new Label("This is a Dialog Window!");
    l.setBounds(50, 50, 200, 30);
    d.add(l);

    b2 = new Button("Close");
    b2.setBounds(100, 100, 80, 30);
    d.add(b2);

    b2.addActionListener(this);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b1) {
      d.setVisible(true);
    } else if (e.getSource() == b2) {
      d.setVisible(false);
    } // Show dialog
  }

  public static void main(String args[]) {
    new DailogExample();
  }
}