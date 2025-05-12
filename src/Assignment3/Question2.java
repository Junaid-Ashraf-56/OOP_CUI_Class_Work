package OOP_CUI_Class_Work.src.Assignment3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Question2 extends JFrame implements ActionListener {
    private final JComboBox<String> vehicleTypeComboBox;
    private final JTextField nameField;

    public Question2() {
        setTitle("Vehicle Rental Booking System");
        setSize(400, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 11, 11));
        setLocationRelativeTo(null);


        JLabel nameLabel = new JLabel("Enter your name:");
        nameField = new JTextField();

        JLabel vehicleLabel = new JLabel("Select vehicle type:");
        String[] vehicles = {"Car", "Bike", "Truck"};
        vehicleTypeComboBox = new JComboBox<>(vehicles);

        JButton bookButton = new JButton("Book Now");
        bookButton.addActionListener(this);


        add(nameLabel);
        add(nameField);
        add(vehicleLabel);
        add(vehicleTypeComboBox);
        add(new JLabel());
        add(bookButton);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText().trim();
        String vehicleType = (String) vehicleTypeComboBox.getSelectedItem();

        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your name.", "Input Error", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,
                    "Booking confirmed for " + name + "!\nVehicle Type: " + vehicleType,
                    "Booking Successful",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }


    public static void main(String[] args) {
            new Question2().setVisible(true);

    }
}
