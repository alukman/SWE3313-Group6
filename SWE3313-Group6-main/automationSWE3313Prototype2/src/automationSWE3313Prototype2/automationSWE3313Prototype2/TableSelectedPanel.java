package automationSWE3313Prototype2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TableSelectedPanel extends JPanel{
	
	private int tableNumber;
	private double subtotal;
	private double tax;
	private double total;
	private boolean isVisible;
	
	private JTextField subtotalValue;
	private JTextField taxValue;
	private JTextField totalValue;
	
	DecimalFormat twoDecimal = new DecimalFormat("##.##");
	JTextArea textArea = new JTextArea();
	
	DefaultComboBoxModel comboBoxLarge = new DefaultComboBoxModel(new String[] {"Large Plain Pizza", "Large Pepperoni Pizza", "Large Meat Lovers Pizza", "Large Veggie Pizza"});
	DefaultComboBoxModel comboBoxMedium = new DefaultComboBoxModel(new String[] {"Medium Plain Pizza", "Medium Pepperoni Pizza", "Medium Meat Lovers Pizza", " Medium Veggie Pizza"});
	DefaultComboBoxModel comboBoxPersonal = new DefaultComboBoxModel(new String[] {"Personal Plain Pizza", "Personal Pepperoni Pizza", "Personal Meat Lovers Pizza", "Personal Veggie Pizza"});
	DefaultComboBoxModel comboBoxSides = new DefaultComboBoxModel(new String[] {"Mozzarella Sticks", "Breadsticks", "Cheese Sticks", "Soft Pretzels"});
	DefaultComboBoxModel comboBoxDrinks = new DefaultComboBoxModel(new String[] {"Water", "Apple Juice", "Coca-Cola", "Sprite"});
	DefaultComboBoxModel comboBoxDesserts = new DefaultComboBoxModel(new String[] {"Cinabon Cinnamon Rolls", "Cinabon Dough Bites", "Chocolate Chip Cookie", "Chocolate Brownie"});
	
	
	/**
	 * Constructor for when the Waiter selects a table button
	 * @param tableNum
	 */
	public TableSelectedPanel(int tableNum)
	{
		this.tableNumber = tableNum;
		this.subtotal = 0;
		this.tax = 0;
		this.total = 0;
		this.isVisible = false;
		
		setBounds(0, 0, 677, 350);
		setVisible(false);
		
		
		JLabel jLabelTableNumber = new JLabel("Table: " + this.tableNumber);
		jLabelTableNumber.setBounds(24, 11, 129, 19);
		add(jLabelTableNumber);
		
		JLabel jLabelNumberOfGuests = new JLabel("Number of Guests: 0");
		jLabelNumberOfGuests.setBounds(24, 29, 129, 19);
		add(jLabelNumberOfGuests);
		
//		JTextArea textArea = new JTextArea();
		textArea.setBounds(24, 51, 333, 202);
		add(textArea);
		
		JLabel jLabelSubtotal = new JLabel("Subtotal:");
		jLabelSubtotal.setHorizontalAlignment(SwingConstants.RIGHT);
		jLabelSubtotal.setBounds(230, 260, 51, 14);
		add(jLabelSubtotal);
		
		JLabel jLabelTax = new JLabel("Tax:");
		jLabelTax.setHorizontalAlignment(SwingConstants.RIGHT);
		jLabelTax.setBounds(230, 290, 51, 14);
		add(jLabelTax);
		
		JLabel jLabelTotal = new JLabel("Total:");
		jLabelTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		jLabelTotal.setBounds(230, 320, 51, 14);
		add(jLabelTotal);
		
		subtotalValue = new JTextField();
		subtotalValue.setBounds(284, 257, 73, 20);
		add(subtotalValue);
		subtotalValue.setColumns(10);
		
		taxValue = new JTextField();
		taxValue.setColumns(10);
		taxValue.setBounds(284, 288, 73, 20);
		add(taxValue);
		
		totalValue = new JTextField();
		totalValue.setColumns(10);
		totalValue.setBounds(284, 319, 73, 20);
		add(totalValue);
		
		
		JComboBox categoryItems = new JComboBox();
		JButton addButton = new JButton("Add");
		addButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				addItem(categoryItems.getSelectedItem().toString());
				
				
				
			}
		});
		addButton.setBounds(275, 9, 112, 20);
		add(addButton);
		
		
//		DefaultComboBoxModel comboBoxLarge = new DefaultComboBoxModel(new String[] {"Large Plain Pizza", "Large Pepperoni Pizza", "Large Meat Lovers Pizza", "Large Veggie Pizza"});
//		DefaultComboBoxModel comboBoxMedium = new DefaultComboBoxModel(new String[] {"Medium Plain Pizza", "Medium Pepperoni Pizza", "Medium Meat Lovers Pizza", " Medium Veggie Pizza"});
//		DefaultComboBoxModel comboBoxPersonal = new DefaultComboBoxModel(new String[] {"Personal Plain Pizza", "Personal Pepperoni Pizza", "Personal Meat Lovers Pizza", "Personal Veggie Pizza"});
//		DefaultComboBoxModel comboBoxSides = new DefaultComboBoxModel(new String[] {"Mozzarella Sticks", "Breadsticks", "Cheese Sticks", "Soft Pretzels"});
//		DefaultComboBoxModel comboBoxDrinks = new DefaultComboBoxModel(new String[] {"Water", "Apple Juice", "Coca-Cola", "Sprite"});
//		DefaultComboBoxModel comboBoxDesserts = new DefaultComboBoxModel(new String[] {"Cinabon Cinnamon Rolls", "Cinabon Dough Bites", "Chocolate Chip Cookie", "Chocolate Brownie"});
//		

		

		
//		JComboBox categoryItems = new JComboBox();		This instantiation was moved up so we can reference it earlier in the code
		categoryItems.setModel(comboBoxLarge);
		categoryItems.setBounds(389, 9, 264, 22);
		add(categoryItems);
		
		
		String y = categoryItems.getName();
		
		JButton buttonCat1 = new JButton("Large Pizza");
		buttonCat1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				categoryItems.setModel(comboBoxLarge);
				
				
				
			}
		});
		buttonCat1.setBounds(419, 148, 112, 40);
		add(buttonCat1);
		
		JButton buttonCat2 = new JButton("Sides");
		buttonCat2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
//				isVisible = false;									
//				setVisible(false);									
//				WaiterView.setPanelMainFloorVisibility(true);		
				categoryItems.setModel(comboBoxSides);
				
				
				
			}
		});
		buttonCat2.setBounds(543, 148, 112, 40);
		add(buttonCat2);
		
		JButton buttonCat3 = new JButton("Medium Pizza");
		buttonCat3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				categoryItems.setModel(comboBoxMedium);	
				
				
				
			}
		});
		buttonCat3.setBounds(419, 199, 112, 40);
		add(buttonCat3);
		
		JButton buttonCat4 = new JButton("Drinks");
		buttonCat4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				categoryItems.setModel(comboBoxDrinks);	
				
				
				
			}
		});
		buttonCat4.setBounds(543, 199, 112, 40);
		add(buttonCat4);
		
		JButton buttonCat5 = new JButton("Personal Pan");
		buttonCat5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				categoryItems.setModel(comboBoxPersonal);	
				
				
				
			}
		});
		buttonCat5.setBounds(419, 250, 112, 40);
		add(buttonCat5);
		
		JButton buttonCat6 = new JButton("Desserts");
		buttonCat6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				categoryItems.setModel(comboBoxDesserts);	
				
				
				
			}
		});
		buttonCat6.setBounds(543, 250, 112, 40);
		add(buttonCat6);
		
		JButton buttonHome = new JButton("Home");
		buttonHome.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				isVisible = false;
				setVisible(false);
				WaiterView.setPanelMainFloorVisibility(true);
			}
		});
		buttonHome.setBounds(483, 301, 112, 40);
		add(buttonHome);
	}
	
	/**
	 * Used to return the visibility status of the panel
	 * @return boolean Visibility
	 */
	public boolean getVisibility() {
		return this.isVisible;
	}
	
	/**
	 * Adds the currently selected item to the orderlist
	 */
	public void addItem(String chosenItem) {
		
		twoDecimal.setMinimumFractionDigits(2);
		
		double itemPrice = 0;
		
		
		/********** Huge Switch Statement ****************/
		switch ( chosenItem ) {
		// Large Category
		case "Large Plain Pizza":
			itemPrice = 12.00;
			break;
		case "Large Pepperoni Pizza":
			itemPrice = 14.00;
			break;
		case "Large Meat Lovers Pizza":
			itemPrice = 16.00;
			break;
		case "Large Veggie Pizza":
			itemPrice = 14.00;
			break;
		
		// Medium Category
		case "Medium Plain Pizza":
			itemPrice = 11.00;
			break;
		case "Medium Pepperoni Pizza":
			itemPrice = 12.00;
			break;
		case "Medium Meat Lovers Pizza":
			itemPrice = 14.00;
			break;
		case "Medium Veggie Pizza":
			itemPrice = 12.00;
			break;
			
		// Medium Category
		case "Personal Plain Pizza":
			itemPrice = 9.00;
			break;
		case "Personal Pepperoni Pizza":
			itemPrice = 11.00;
			break;
		case "Personal Meat Lovers Pizza":
			itemPrice = 12.00;
			break;
		case "Personal Veggie Pizza":
			itemPrice = 11.00;
			break;
			
		// Sides Category
		case "Mozzarella Sticks":
			itemPrice = 5.00;
			break;
		case "Breadsticks":
			itemPrice = 6.00;
			break;
		case "Cheese Sticks":
			itemPrice = 6.00;
			break;
		case "Soft Pretzels":
			itemPrice = 7.00;
			break;
		
		// Drinks
		case "Water":
			itemPrice = 0.00;
			break;
		case "Apple Juice":
			itemPrice = 4.00;
			break;
		case "Coca-Cola":
			itemPrice = 5.00;
			break;
		case "Sprite":
			itemPrice = 5.00;
			break;
			
		// Desserts
		case "Cinabon Cinnamon Rolls":
			itemPrice = 8.00;
			break;
		case "Cinabon Dough Bites":
			itemPrice = 7.00;
			break;
		case "Chocolate Chip Cookie":
			itemPrice = 5.00;
			break;
		case "Chocolate Brownie":
			itemPrice = 5.00;
			break;
		
		}

		/********* Huge Switch Statement *****************/

		// Appending the chosen item to the textArea
		if (chosenItem.length() >= 17)
			textArea.append(chosenItem + "\t" + twoDecimal.format(itemPrice) + "\n");
		else
			textArea.append(chosenItem + "\t\t" + twoDecimal.format(itemPrice) + "\n");
		
		System.out.println(chosenItem);
		System.out.println(itemPrice);
		
		updateTotal(itemPrice);
		
	}
	
	public void updateTotal(double itemPrice) {
		
		this.subtotal = this.subtotal + itemPrice;
		this.tax = this.tax + (itemPrice * .06);
		this.total = this.subtotal + this.tax;
		
		subtotalValue.setText(String.valueOf(twoDecimal.format(subtotal)));
		taxValue.setText(String.valueOf(twoDecimal.format(tax)));
		totalValue.setText(String.valueOf(twoDecimal.format(total)));
		
		
		
		
		
	}
	
}
