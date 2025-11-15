import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends Frame implements ActionListener {
  TextField t1, t2, result;
  Button add, sub, mul, div, pow;

  SimpleCalculator() {
    t1 = new TextField();
    t2 = new TextField();
    result = new TextField();

    add = new Button("+");
    sub = new Button("-");
    mul = new Button("*");
    div = new Button("/");
    pow = new Button("^");

    t1.setBounds(50, 50, 150, 20);
    t2.setBounds(50, 100, 150, 20);
    result.setBounds(50, 150, 150, 20);
    add.setBounds(50, 200, 50, 50);
    sub.setBounds(110, 200, 50, 50);
    mul.setBounds(50, 270, 50, 50);
    div.setBounds(110, 270, 50, 50);
    pow.setBounds(170, 200, 50, 50);

    add(t1);
    add(t2);
    add(result);
    add(add);
    add(sub);
    add(mul);
    add(div);
    add(pow);

    add.addActionListener(this);
    sub.addActionListener(this);
    mul.addActionListener(this);
    div.addActionListener(this);
    pow.addActionListener(this);

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        dispose();
      }
    });
    setSize(500, 500);
    setLayout(null);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    try {
      double n1 = Double.parseDouble(t1.getText());
      double n2 = Double.parseDouble(t2.getText());
      double ans = 0;

      if (e.getSource() == add)
        ans = n1 + n2;
      else if (e.getSource() == sub)
        ans = n1 - n2;
      else if (e.getSource() == mul)
        ans = n1 * n2;
      else if (e.getSource() == div)
        ans = n1 / n2;
      else if (e.getSource() == pow)
        ans = Math.pow(n1, n2);

      result.setText(String.valueOf(ans));

    } catch (Exception ex) {
      result.setText("Invalid Input");
    }
  }

  public static void main(String[] args) {
    new SimpleCalculator();
  }
}
