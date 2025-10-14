package CoffeeShop;

import java.io.*;
import java.awt.*;
import javax.swing.*;

public class OrderWindow extends JFrame {
	
	//attributes
	private JTextField nameField;
    private JComboBox<String> customerTypeBox, coffeeTypeBox, brewTypeBox, milkTypeBox;
    private JButton submitBtn;

    //window
    public OrderWindow() {
        setTitle("Place Your Coffee Order");
        setSize(500, 400);
        setLayout(new GridLayout(10, 2));

        //customer
        nameField = new JTextField();
        customerTypeBox = new JComboBox<>(new String[] { "Regular", "Premium" });

        //coffee
        coffeeTypeBox = new JComboBox<>(new String[] { "Filtered", "Espresso" });
        brewTypeBox = new JComboBox<>(new String[] { "Light", "Medium", "Dark" });
        milkTypeBox = new JComboBox<>(new String[] { "Whole", "Skim", "Almond" });

        //save
        submitBtn = new JButton("Place Order");
        submitBtn.addActionListener(e -> saveOrder());

        //layout
        add(new JLabel("Name")); add(nameField);
        add(new JLabel("Customer Type")); add(customerTypeBox);
        add(new JLabel("Coffee Type")); add(coffeeTypeBox);
        add(new JLabel("Brew Type (Filtered only)")); add(brewTypeBox);
        add(new JLabel("Milk Type")); add(milkTypeBox);
        add(new JLabel("")); add(submitBtn);
        setVisible(true);
    }

    private void saveOrder() {
        try {
            //customer
            String name = nameField.getText();
            Customer customer;
            if (customerTypeBox.getSelectedItem().equals("Premium")) {
                customer = new PremiumCustomer(name);
            } else {
                customer = new RegularCustomer(name);
            }

            Coffee coffee;
            if (coffeeTypeBox.getSelectedItem().equals("Filtered")) {
                coffee = new FilteredCoffee("Filtered Coffee", brewTypeBox.getSelectedItem().toString());
            } else {
                coffee = new Espresso("Espresso Drink", milkTypeBox.getSelectedItem().toString());
            }
            //write file
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("orders.csv", true))) {
                bw.write(customer.getName() + " ," + coffee.toString());
                bw.newLine();
            }
            JOptionPane.showMessageDialog(this, "Order Saved!");
            generateReceipt(customer, coffee);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Something went wrong.");
        }
    }
    private void generateReceipt(Customer customer, Coffee coffee) {
        try {
            File receipt = new File("receipt" + System.currentTimeMillis() + ".txt");
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(receipt))) {
                bw.write(customer.getName() + " ," + coffee.toString());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
	
	
	
	
	

}
