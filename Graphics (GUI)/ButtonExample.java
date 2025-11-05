import java.awt.*;
import java.awt.event.*;

public class ButtonExample {
  public static void main(String[] args) {
    Frame frame = new Frame("Button Example");
    Button button = new Button("Click Me");
    button.setBounds(50, 100, 80, 30);
    // Add ActionListener to the button
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked");
      }
    });
    frame.add(button);
    frame.setSize(300, 300);
    frame.setLayout(null); 
    frame.setVisible(true);
  }
}
