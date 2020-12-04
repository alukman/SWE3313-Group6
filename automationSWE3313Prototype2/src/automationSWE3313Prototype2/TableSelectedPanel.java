package automationSWE3313Prototype2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		
		JTextArea textArea = new JTextArea();
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Plain Pizza", "Pepperoni Pizza", "Meat Lovers Pizza", "Veggie Pizza"}));
		comboBox.setBounds(389, 9, 264, 22);
		add(comboBox);
		
		JButton buttonCat1 = new JButton("Category 1");
		buttonCat1.setBounds(419, 148, 112, 40);
		add(buttonCat1);
		
		JButton buttonCat2 = new JButton("Category 2");
		buttonCat2.setBounds(543, 148, 112, 40);
		add(buttonCat2);
		
		JButton buttonCat3 = new JButton("Category 3");
		buttonCat3.setBounds(419, 199, 112, 40);
		add(buttonCat3);
		
		JButton buttonCat4 = new JButton("Category 4");
		buttonCat4.setBounds(543, 199, 112, 40);
		add(buttonCat4);
		
		JButton buttonCat5 = new JButton("Category 5");
		buttonCat5.setBounds(419, 250, 112, 40);
		add(buttonCat5);
		
		JButton buttonCat6 = new JButton("Category 6");
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
}
