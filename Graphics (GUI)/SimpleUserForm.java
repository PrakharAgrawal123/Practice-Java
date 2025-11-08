import java.awt.*;
import java.awt.event.*;

public class SimpleUserForm extends Frame implements ActionListener {
  Label nameLabel, emailLabel, ageLabel, resultLabel;
  TextField nameField, emailField, ageField;
  Button submitButton;

  SimpleUserForm() {
    // Labels
    nameLabel = new Label("Name:");
    emailLabel = new Label("Email:");
    ageLabel = new Label("Age:");
    resultLabel = new Label(""); // empty label for displaying output

    // Text fields
    nameField = new TextField(20);
    emailField = new TextField(20);
    ageField = new TextField(5);

    // Button
    submitButton = new Button("Submit");
    submitButton.addActionListener(this);

    // Set layout (grid)
    setLayout(new GridLayout(5, 2, 10, 10));

    // Add components
    add(nameLabel);
    add(nameField);
    add(emailLabel);
    add(emailField);
    add(ageLabel);
    add(ageField);
    add(submitButton);
    add(resultLabel); // output message label

    // Frame settings
    setTitle("User Form");
    setSize(350, 250);
    setVisible(true);

    // Handle window closing
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        dispose();
      }
    });
  }

  // Handle button click
  public void actionPerformed(ActionEvent e) {
    String name = nameField.getText();
    String email = emailField.getText();
    String age = ageField.getText();

    // Display result on window (not console)
    resultLabel.setText("Name: " + name + " | Email: " + email + " | Age: " + age);
  }

  // Main method
  public static void main(String[] args) {
    new SimpleUserForm();
  }
}
