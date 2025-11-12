import java.awt.*;
import java.awt.event.*;

public class UserForm extends Frame implements ActionListener {

  Label nameLabel, emailLabel, ageLabel;
  TextField nameField, emailField, ageField;
  Button submitButton;

  UserForm() {
    nameLabel = new Label("Name:");
    emailLabel = new Label("Email:");
    ageLabel = new Label("Age:");

    nameField = new TextField();
    emailField = new TextField();
    ageField = new TextField();

    submitButton = new Button("Submit");

    setLayout(new GridLayout(4, 2));

    add(nameLabel);
    add(nameField);

    add(emailLabel);
    add(emailField);

    add(ageLabel);
    add(ageField);

    add(submitButton);

    submitButton.addActionListener(this);

    setTitle("User Form");
    setSize(300, 300);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    String name = nameField.getText();
    String email = emailField.getText();
    String age = ageField.getText();

    Dialog dialog = new Dialog(this, "User Information", true);
    dialog.setLayout(new FlowLayout());
    dialog.setSize(300, 150);

    Label infoLabel = new Label("Name: " + name + " | Email: " + email + " | Age: " + age);
    dialog.add(infoLabel);

    Button closeButton = new Button("Close");
    closeButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        dialog.setVisible(false);
      }
    });
    dialog.add(closeButton);
    dialog.setVisible(true);
  }

  public static void main(String[] args) {
    new UserForm();
  }
}