import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class PurchaseScreen extends JFrame {

	private StartingMenu bookStore1;
	private JTextArea shoppingHistory;

	public PurchaseScreen() {
		// TODO Auto-generated constructor stub
		setSize(600, 800); // defining size
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // When i click close, program will stop
		setTitle("Puchase Screen"); // setting my title
		// setLayout(new FlowLayout()); // I need custom layout in this frame
		setResizable(false); // To stop the changing frame's size

		String firstStr = labelText().substring(0, 44);
		shoppingHistory = new JTextArea(); // defining my text area
		shoppingHistory.setText(labelText()); // defining my text
		shoppingHistory.setFont(new Font("Consolas", Font.BOLD, 30)); // changing
		shoppingHistory.setBackground(Color.orange); // I want background to look cool
		shoppingHistory.setOpaque(true); // I am confirming that i will use color
		shoppingHistory.setEditable(false); // Not editable anymore
		add(shoppingHistory); // adding to the layout
		setVisible(true); // To make it visible

	}

	public String labelText() { // This method will call getBasket() method
		bookStore1 = new StartingMenu(); // defining the StartingMenu class object
		bookStore1.setVisible(false); // I don't want starting menu frame looks visible at that point
		return bookStore1.getBasket(); // this will return getBasket method from StartingMenu class
	}

}
