import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class StartingMenu extends JFrame implements ActionListener {

	// I am initalizing attributes that i will use in this class

	private JButton add, buy;
	private JTextField amountInput;
	private JLabel genre, amount;
	private JRadioButton goldenMember, silverMember, nonMember;
	private ButtonGroup myGroup;
	private JComboBox bookGenres;
	private JPanel radioButtons, buttons;
	private PurchaseScreen purchase;
	private BookStore bookStore;

	/*
	 * I will use these attributes in a constructor because i will create an object
	 * from this class in the Main (other) class and constructor will automatically
	 * work!
	 */

	public StartingMenu() {
		// TODO Auto-generated constructor stub
		setSize(500, 300); // Defining size
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This frame will stop work, when i press close button.
		// frame.dispose();
		setLayout(new GridLayout(0, 2)); // I choosed this layout because it makes sense. I want 2 rows.
		setResizable(false); // I don't want user to change the size of the frame
		setTitle("Welcome to the Yigit Can Ayaz's book shop!"); // giving credit to me by setting title

		genre = new JLabel("Genre:"); // I make the text of this label Genre:
		genre.setFont(new Font("MV Boli", Font.BOLD, 30)); // Font name, font style, font size
		add(genre); // I am adding to the layout

		// I will use this string array on my JComboBox
		String[] books = { "science [10p]", "history[15p]", "drama[5p]", "romance[7p]", "action[5p]" };

		// The options will be whatever is that in string array
		bookGenres = new JComboBox(books);
		bookGenres.setSelectedIndex(0); // It will show the first item in array by default
		bookGenres.setFont(new Font("Consolas", Font.PLAIN, 25)); // Font name, font style, font size
		add(bookGenres); // I am adding to the layout

		amount = new JLabel("Amount:"); // I make the text of this label Amount:
		amount.setFont(new Font("MV Boli", Font.BOLD, 30)); // Font name, font style, font size
		add(amount); // I am adding to the layout

		// I will define my text field
		amountInput = new JTextField();
		amountInput.setBackground(Color.PINK); // making color green
		amountInput.setFont(new Font("Consolas", Font.PLAIN, 35)); // Font name, font style, font size
		add(amountInput); // Added to layout

		// My radio buttons are these:
		goldenMember = new JRadioButton("Golden Member");
		silverMember = new JRadioButton("Silver Member");
		nonMember = new JRadioButton("Non Member");

		/*
		 * I am using ButtonGroup class because with that class, only one radio member
		 * will be selectable. If I don't use it, then user can be select multiple radio
		 * buttons!
		 */

		myGroup = new ButtonGroup();
		// adding radio buttons to myGroup
		myGroup.add(goldenMember);
		myGroup.add(silverMember);
		myGroup.add(nonMember);

		// Now, i will enter my radio buttons to the panel
		// because i want these buttons to use only 1 grid
		radioButtons = new JPanel();
		radioButtons.add(goldenMember);
		radioButtons.add(silverMember);
		radioButtons.add(nonMember);

		nonMember.setSelected(true); // this will make nonMember button selected by default

		add(radioButtons);

		// My buttons are these:
		add = new JButton("Add");
		buy = new JButton("Buy");

		// I will define my other panel for my normal buttons
		buttons = new JPanel();
		buttons.add(add);
		buttons.add(buy);

		add(buttons); // I am adding my panel to layout

		// Now I will add action listener to my normal buttons:
		add.addActionListener(this);
		buy.addActionListener(this);

		bookStore = new BookStore(); // defining my BookStore class object

		getContentPane().setBackground(Color.YELLOW); // I want to change to background to look good

		basket(); // calling my basket method

		setVisible(true); // For to see frame
	}

	// I impelemented ActionListener so this is automatically added
	// I am going to make actions when i click buttons
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource().equals(add)) { // If i click add button, this will work
			try {
				int amountNumber = Integer.parseInt(amountInput.getText());
				boolean golden = goldenMember.isSelected(); // To check is it selected or not
				boolean silver = silverMember.isSelected(); // To check is it selected or not
				boolean non = nonMember.isSelected(); // To check is it selected or not
				boolean[] memberships = { golden, silver, non }; // making an array from these items

				int Price = 0; // initalizing at the outside of the loop so i can access from other side

				for (int i = 0; i < memberships.length; i++) { // to see which one is true
					if (memberships[i] == true) {
						Price = i;
						break;
					}
				}

				// Prices:
				// science [10p], "history[15p]", "drama[5p]", "romance[7p]", "action[5p]

				if (Price == 0) { // if its equal to golden this will work

					switch (bookGenres.getSelectedIndex()) { // I will get the index
					// 0. index = science
					// 1. index = history
					// 2. index = drama
					// 3. index = romance
					// 4. index = action

					case 0:
						bookStore.setScienceBookPrice((amountNumber * 10) * (85.0 / 100));
						bookStore.setScienceBookCount(amountNumber);
						break;
					case 1:
						bookStore.setHistoryBookPrice((amountNumber * 15) * (85.0 / 100));
						bookStore.setHistoryBookCount(amountNumber);
						break;
					case 2:
						bookStore.setDramaBookPrice((amountNumber * 5) * (85.0 / 100));
						bookStore.setDramaBookCount(amountNumber);
						break;
					case 3:
						bookStore.setRomanceBookPrice((amountNumber * 7) * (85.0 / 100));
						bookStore.setRomanceBookCount(amountNumber);
						break;
					case 4:
						bookStore.setActionBookPrice((amountNumber * 5) * (85.0 / 100));
						bookStore.setActionBookCount(amountNumber);
						break;

					}
				}

				else if (Price == 1) {
					switch (bookGenres.getSelectedIndex()) { // I will get the index
					// 0. index = science
					// 1. index = history
					// 2. index = drama
					// 3. index = romance
					// 4. index = action

					case 0:
						bookStore.setScienceBookPrice((amountNumber * 10) * (90.0 / 100));
						bookStore.setScienceBookCount(amountNumber);
						break;
					case 1:
						bookStore.setHistoryBookPrice((amountNumber * 15) * (90.0 / 100));
						bookStore.setHistoryBookCount(amountNumber);
						break;
					case 2:
						bookStore.setDramaBookPrice((amountNumber * 5) * (90.0 / 100));
						bookStore.setDramaBookCount(amountNumber);
						break;
					case 3:
						bookStore.setRomanceBookPrice((amountNumber * 7) * (90.0 / 100));
						bookStore.setRomanceBookCount(amountNumber);
						break;
					case 4:
						bookStore.setActionBookPrice((amountNumber * 5) * (90.0 / 100));
						bookStore.setActionBookCount(amountNumber);
						break;
					}
				}

				else { // this will work if non member selected
					switch (bookGenres.getSelectedIndex()) { // I will get the index
					// 0. index = science
					// 1. index = history
					// 2. index = drama
					// 3. index = romance
					// 4. index = action

					case 0:
						bookStore.setScienceBookPrice(amountNumber * 10);
						bookStore.setScienceBookCount(amountNumber);
						break;
					case 1:
						bookStore.setHistoryBookPrice(amountNumber * 15);
						bookStore.setHistoryBookCount(amountNumber);
						break;
					case 2:
						bookStore.setDramaBookPrice(amountNumber * 5);
						bookStore.setDramaBookCount(amountNumber);
						break;
					case 3:
						bookStore.setRomanceBookPrice(amountNumber * 7);
						bookStore.setRomanceBookCount(amountNumber);
						break;
					case 4:
						bookStore.setActionBookPrice(amountNumber * 5);
						bookStore.setActionBookCount(amountNumber);
						break;
					}
				}
				amountInput.setText(""); // making amount input reset
			}

			catch (Exception e2) { // error message
				// I will make a warning message when they don't enter a number
				JOptionPane.showMessageDialog(null, "ENTER AN AMOUNT!!!", "WARNING MESSAGE",
						JOptionPane.WARNING_MESSAGE);
			}
		}

		else if (e.getSource().equals(buy)) { // If i click buy button, this will work
			try {
				// Creating an object from PuchaseScreen class
				purchase = new PurchaseScreen(); // PurchaseScreen constructor will work
				dispose(); // closing this class's frame
			} catch (Exception e3) { // error message
				JOptionPane.showMessageDialog(null, "ENTER AN AMOUNT!!!", "WARNING MESSAGE",
						JOptionPane.WARNING_MESSAGE);
			}
		}
	}

	String str = ""; // I want to access this variable outside of the for loop

	public void basket() { // making my basket text
		String[] bookTypes = { "Science Books: ", "History Books: ", "Drama Books: ", "Romance Books: ",
				"Action Books: " }; // book types
		int[] bookCount = { bookStore.getScienceBookCount(), // book counts
				bookStore.getHistoryBookCount(), bookStore.getDramaBookCount(), bookStore.getRomanceBookCount(),
				bookStore.getActionBookCount() };
		double[] bookPrice = { bookStore.getScienceBookPrice(), // book counts
				bookStore.getHistoryBookPrice(), bookStore.getDramaBookPrice(), bookStore.getRomanceBookPrice(),
				bookStore.getActionBookPrice() };

		for (int i = 0; i < 5; i++) { // I made it 5 because array length is 5
			if (bookCount[i] != 0) { // making my text for basket
				str += bookTypes[i] + "\n" + "Added Book: " + bookCount[i] + "\n" + "Price: " + bookPrice[i] + "\n\n";
			}
		}

		// Now, i need to get total price

		double total = 0;

		for (int i = 0; i < 5; i++) { // I made it 5 because array length is 5
			total += bookPrice[i]; // adding all prices to the total variable
		}
		String totalPrice = "Total Price Is: " + Double.toString(total); // Converting double to string

		str += totalPrice; // adding total price my str variable
	}

	// I want to use the same object with PurchaseScreen class
	// So I created a getter method to use there

	public String getBasket() {
		return str;
	}

}
