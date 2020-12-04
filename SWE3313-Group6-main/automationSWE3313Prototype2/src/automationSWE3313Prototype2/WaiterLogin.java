package automationSWE3313Prototype2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WaiterLogin {

	protected String currentWaitStaff;
	
	private JFrame frame;
	private JTextField username;
	private JPasswordField password;
	public static String[] username1 = {"Ramraja","Alex","Kyle", "Andrew", "Duong"};//Usernames
	public static String[] password1 = {"Rayamajhi","Kiwus","Ambrose", "Lukman", "Ha"};//Passwords

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WaiterLogin window = new WaiterLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WaiterLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Waiter Login Page");
		lblNewLabel.setBounds(186, 36, 146, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(42, 80, 75, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(42, 150, 75, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		username = new JTextField();
		username.setBounds(121, 71, 211, 40);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(121, 137, 213, 40);
		frame.getContentPane().add(password);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				   String username2=username.getText();
				   String password2=password.getText();
					  if( ( username2.equals(username1[0]) && password2.equals(password1[0])  ) 
							  || ( username2.equals(username1[1]) && password2.equals(password1[1]) ) 
							  || ( username2.equals(username1[2]) && password2.equals(password1[2])	)
							  || ( username2.equals(username1[3]) && password2.equals(password1[3]) )
							  || ( username2.equals(username1[4]) && password2.equals(password1[4]) ) ) {
					   currentWaitStaff = username2;
					   String[] passingArray = {currentWaitStaff};
					   frame.setVisible(false);
					   WaiterView.main(passingArray);
				   }
				   else{
				   System.out.println("enter the valid username and password");
				   JOptionPane.showMessageDialog(null,"Incorrect login or password",
				   "Error",JOptionPane.ERROR_MESSAGE);
				   }
			}
		});
		btnNewButton.setBounds(42, 210, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame = new JFrame("Exit");

			    if (JOptionPane.showConfirmDialog( frame,"Do you want to Exit?","Name of the Application or Title",
			            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
			            System.exit(0);
			}
		});
		btnNewButton_1.setBounds(260, 210, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}

	protected static void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
