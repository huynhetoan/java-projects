package CoffeeShop;

import java.awt.*;
import javax.swing.*;

public class CoffeeShopApp extends JFrame {
	
	public CoffeeShopApp() {
		
		setTitle("Coffee Hangout ☕");
		setSize(600,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//menu panel
		JPanel panel = new JPanel(new GridLayout(3, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));
		//buttons
		JButton orderBtn = new JButton("Order Coffee");
        JButton viewOrdersBtn = new JButton("View Orders");
        JButton exitBtn = new JButton("Exit");

		panel.add(orderBtn);
        panel.add(viewOrdersBtn);
        panel.add(exitBtn);
		
        //button listeners
        orderBtn.addActionListener(e -> openOrderWindow());
        viewOrdersBtn.addActionListener(e -> openViewOrdersWindow());
        exitBtn.addActionListener(e -> exitApp());
        add(panel);
        setVisible(true);
	}
	//open window
	private void openOrderWindow() {
		new OrderWindow();
	  	}
	private void openViewOrdersWindow() {
		new ViewOrdersWindow();
	    }
	private void exitApp() {
		JOptionPane.showMessageDialog(this, "Exiting...");
		System.exit(0);
	}
	//main method
	public static void main(String[] args) {	
		new CoffeeShopApp();
	}
	
}
