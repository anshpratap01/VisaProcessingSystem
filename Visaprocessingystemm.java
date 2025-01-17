import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Visaprocessingystemm {
public static void main(String[] args) {
// Create the frame (window)
JFrame frame = new JFrame("Visa Processing System");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(400, 400); // Adjust size to fit all components
// Create the panel to hold UI components
JPanel panel = new JPanel();
panel.setLayout(new GridLayout(6, 2)); // Create 6 rows, 2 columns
// Add components (labels, buttons, text fields)
JLabel nameLabel = new JLabel("Name:");
JTextField nameField = new JTextField();
JLabel visaTypeLabel = new JLabel("Visa Type:");
JTextField visaTypeField = new JTextField();
JLabel emailLabel = new JLabel("Email Address:");
JTextField emailField = new JTextField();
JLabel dobLabel = new JLabel("Date of Birth (DD/MM/YYYY):");
JTextField dobField = new JTextField();
JButton submitButton = new JButton("Apply for Visa");
// Add the components to the panel
panel.add(nameLabel);
panel.add(nameField);
panel.add(visaTypeLabel);
panel.add(visaTypeField);
panel.add(emailLabel);
 panel.add(emailField);
panel.add(dobLabel);
panel.add(dobField);
panel.add(submitButton);
// Action listener for the button
submitButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
// Get the user inputs from the text fields
String name = nameField.getText();
String visaType = visaTypeField.getText();
String email = emailField.getText();
String dob = dobField.getText();
// Show a confirmation message
JOptionPane.showMessageDialog(frame, 
"Visa Application Submitted Successfully!\n\n" +
"Name: " + name + "\n" +
"Visa Type: " + visaType + "\n" +
"Email: " + email + "\n" +
"Date of Birth: " + dob, 
"Application Submitted", 
JOptionPane.INFORMATION_MESSAGE);
}
});
// Add the panel to the frame and make the frame visible
frame.add(panel);
frame.setVisible(true);
}
}
