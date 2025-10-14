package CoffeeShop;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class ViewOrdersWindow extends JFrame {

	public ViewOrdersWindow() {
		//title
        setTitle("View Coffee Orders");
        setSize(600, 400);
        setLayout(new BorderLayout());
        //text
        JTextArea displayArea = new JTextArea();
        displayArea.setEditable(false);
        //scroll
        JScrollPane scrollPane = new JScrollPane(displayArea);
        add(scrollPane, BorderLayout.CENTER);
        //read
        try (BufferedReader br = new BufferedReader(new FileReader("orders.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                displayArea.append(line + "\n");
            }
        } catch (IOException e) {
            displayArea.setText("No orders found.");
        }
        
        setVisible(true);
    }
	
	
	
	
}
