
import java.awt.*;
import java.awt.event.*;

public class TextFieldExample {
  public static void main(String[] args) {
    Frame frame = new Frame("TextField Example");
    TextField textField = new TextField();

    textField.setBounds(50, 100, 150, 30);

    Button button = new Button("Submit");
    button.setBounds(50, 150, 80, 30);

    Label label = new Label();
    label.setBounds(50, 200, 150, 30);

    // Adding ActionListener to display text on button click
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String data = textField.getText();
        label.setText("You entered: " + data);
      }
    });

    frame.add(textField);
    frame.add(button);
    frame.add(label);

    frame.setSize(400, 400);
    frame.setLayout(null); // Using no layout managers
    frame.setVisible(true);
  }
}