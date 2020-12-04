package automationSWE3313Prototype2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class WaiterView {
	
	boolean keep_panel_open = true;

	public static String waitStaffName;
	
	private JFrame frmTableStatusScreen;
	private JLabel jLabelTime;
	private JLabel jLabelDate;
	private static JPanel panelMainFloor = new JPanel();
	
	private TableSelectedPanel panelTable1, panelTable2, panelTable3, panelTable4, panelTable5, panelTable6, panelTable7, panelTable8, 
									panelTable9, panelTable10, panelTable11, panelTable12, panelTable13, panelTable14, panelTable15, panelTable16, 
										panelTable17, panelTable18, panelTable19, panelTable20, panelTable21, panelTable22, panelTable23, panelTable24, 
											panelTable25, panelTable26, panelTable27, panelTable28, panelTable29, panelTable30;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					waitStaffName = args[0];
					WaiterView window = new WaiterView();
					window.frmTableStatusScreen.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WaiterView() {
		initialize();
		clock();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTableStatusScreen = new JFrame();
		frmTableStatusScreen.setTitle("Table Status Screen");
		frmTableStatusScreen.setBounds(100, 100, 693, 389);
		frmTableStatusScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTableStatusScreen.getContentPane().setLayout(null);
		

		//final JPanel panelMainFloor = new JPanel();
		panelMainFloor.setBounds(0, 0, 677, 350);
		panelMainFloor.setVisible(true);
		frmTableStatusScreen.getContentPane().add(panelMainFloor);
		panelMainFloor.setLayout(null);

		
		JLabel jLabelWaiterName = new JLabel("Waiter: " + waitStaffName);			//This is hardcoded -- NEED TO CHANGE
		jLabelWaiterName.setVerticalAlignment(SwingConstants.BOTTOM);
		jLabelWaiterName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jLabelWaiterName.setBounds(10, 89, 167, 24);
		panelMainFloor.add(jLabelWaiterName);
		
		JLabel jLabelWaiterID = new JLabel("ID: 12");					//This is hardcoded -- NEED TO CHANGE
		jLabelWaiterID.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jLabelWaiterID.setBounds(10, 116, 107, 14);
		panelMainFloor.add(jLabelWaiterID);
		
		jLabelTime = new JLabel("[time]");
		jLabelTime.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jLabelTime.setBounds(10, 68, 167, 14);
		panelMainFloor.add(jLabelTime);
		
		jLabelDate = new JLabel("[date]");
		jLabelDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jLabelDate.setBounds(10, 44, 167, 14);
		panelMainFloor.add(jLabelDate);
		
		
		//Initializing the different table order windows
		final TableSelectedPanel panelTable1 = new TableSelectedPanel(1);
		frmTableStatusScreen.getContentPane().add(panelTable1);
		panelTable1.setLayout(null);

		final TableSelectedPanel panelTable2 = new TableSelectedPanel(2);
		frmTableStatusScreen.getContentPane().add(panelTable2);
		panelTable2.setLayout(null);

		final TableSelectedPanel panelTable3 = new TableSelectedPanel(3);
		frmTableStatusScreen.getContentPane().add(panelTable3);
		panelTable3.setLayout(null);

		final TableSelectedPanel panelTable4 = new TableSelectedPanel(4);
		frmTableStatusScreen.getContentPane().add(panelTable4);
		panelTable4.setLayout(null);

		final TableSelectedPanel panelTable5 = new TableSelectedPanel(5);
		frmTableStatusScreen.getContentPane().add(panelTable5);
		panelTable5.setLayout(null);

		final TableSelectedPanel panelTable6 = new TableSelectedPanel(6);
		frmTableStatusScreen.getContentPane().add(panelTable6);
		panelTable6.setLayout(null);

		final TableSelectedPanel panelTable7 = new TableSelectedPanel(7);
		frmTableStatusScreen.getContentPane().add(panelTable7);
		panelTable7.setLayout(null);

		final TableSelectedPanel panelTable8 = new TableSelectedPanel(8);
		frmTableStatusScreen.getContentPane().add(panelTable8);
		panelTable8.setLayout(null);

		final TableSelectedPanel panelTable9 = new TableSelectedPanel(9);
		frmTableStatusScreen.getContentPane().add(panelTable9);
		panelTable9.setLayout(null);

		final TableSelectedPanel panelTable10 = new TableSelectedPanel(10);
		frmTableStatusScreen.getContentPane().add(panelTable10);
		panelTable10.setLayout(null);
		
		final TableSelectedPanel panelTable11 = new TableSelectedPanel(11);
		frmTableStatusScreen.getContentPane().add(panelTable11);
		panelTable11.setLayout(null);


		final TableSelectedPanel panelTable12 = new TableSelectedPanel(12);
		frmTableStatusScreen.getContentPane().add(panelTable12);
		panelTable12.setLayout(null);

		final TableSelectedPanel panelTable13 = new TableSelectedPanel(13);
		frmTableStatusScreen.getContentPane().add(panelTable13);
		panelTable13.setLayout(null);

		final TableSelectedPanel panelTable14 = new TableSelectedPanel(14);
		frmTableStatusScreen.getContentPane().add(panelTable14);
		panelTable14.setLayout(null);

		final TableSelectedPanel panelTable15 = new TableSelectedPanel(15);
		frmTableStatusScreen.getContentPane().add(panelTable15);
		panelTable15.setLayout(null);

		final TableSelectedPanel panelTable16 = new TableSelectedPanel(16);
		frmTableStatusScreen.getContentPane().add(panelTable16);
		panelTable16.setLayout(null);

		final TableSelectedPanel panelTable17 = new TableSelectedPanel(17);
		frmTableStatusScreen.getContentPane().add(panelTable17);
		panelTable17.setLayout(null);

		final TableSelectedPanel panelTable18 = new TableSelectedPanel(18);
		frmTableStatusScreen.getContentPane().add(panelTable18);
		panelTable18.setLayout(null);

		final TableSelectedPanel panelTable19 = new TableSelectedPanel(19);
		frmTableStatusScreen.getContentPane().add(panelTable19);
		panelTable19.setLayout(null);

		final TableSelectedPanel panelTable20 = new TableSelectedPanel(20);
		frmTableStatusScreen.getContentPane().add(panelTable20);
		panelTable20.setLayout(null);

		final TableSelectedPanel panelTable21 = new TableSelectedPanel(21);
		frmTableStatusScreen.getContentPane().add(panelTable21);
		panelTable21.setLayout(null);

		final TableSelectedPanel panelTable22 = new TableSelectedPanel(22);
		frmTableStatusScreen.getContentPane().add(panelTable22);
		panelTable22.setLayout(null);

		final TableSelectedPanel panelTable23 = new TableSelectedPanel(23);
		frmTableStatusScreen.getContentPane().add(panelTable23);
		panelTable23.setLayout(null);

		final TableSelectedPanel panelTable24 = new TableSelectedPanel(24);
		frmTableStatusScreen.getContentPane().add(panelTable24);
		panelTable24.setLayout(null);

		final TableSelectedPanel panelTable25 = new TableSelectedPanel(25);
		frmTableStatusScreen.getContentPane().add(panelTable25);
		panelTable25.setLayout(null);

		final TableSelectedPanel panelTable26 = new TableSelectedPanel(26);
		frmTableStatusScreen.getContentPane().add(panelTable26);
		panelTable26.setLayout(null);

		final TableSelectedPanel panelTable27 = new TableSelectedPanel(27);
		frmTableStatusScreen.getContentPane().add(panelTable27);
		panelTable27.setLayout(null);

		final TableSelectedPanel panelTable28 = new TableSelectedPanel(28);
		frmTableStatusScreen.getContentPane().add(panelTable28);
		panelTable28.setLayout(null);

		final TableSelectedPanel panelTable29 = new TableSelectedPanel(29);
		frmTableStatusScreen.getContentPane().add(panelTable29);
		panelTable29.setLayout(null);

		final TableSelectedPanel panelTable30 = new TableSelectedPanel(30);
		frmTableStatusScreen.getContentPane().add(panelTable30);
		panelTable30.setLayout(null);
		
		
		
		//Initializing all tables
		JButton btnTable1 = new JButton("Table 1");
		btnTable1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMainFloor.setVisible(false);
				panelTable1.setVisible(true);
			}
		});
		btnTable1.setBackground(Color.GREEN);
		btnTable1.setBounds(200, 12, 85, 45);
		panelMainFloor.add(btnTable1);
		
		
		JButton btnTable2 = new JButton("Table 2");
		btnTable2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMainFloor.setVisible(false);
				panelTable2.setVisible(true);
			}
		});
		btnTable2.setBackground(Color.GREEN);
		btnTable2.setBounds(200, 68, 85, 45);
		panelMainFloor.add(btnTable2);

		
		JButton btnTable3 = new JButton("Table 3");
		btnTable3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMainFloor.setVisible(false);
				panelTable3.setVisible(true);
			}
		});
		btnTable3.setBackground(Color.GREEN);
		btnTable3.setBounds(200, 124, 85, 45);
		panelMainFloor.add(btnTable3);
		
		
		JButton btnTable4 = new JButton("Table 4");
		btnTable4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMainFloor.setVisible(false);
				panelTable4.setVisible(true);
			}
		});
		btnTable4.setBackground(Color.GREEN);
		btnTable4.setBounds(200, 180, 85, 45);
		panelMainFloor.add(btnTable4);
		
		
		JButton btnTable5 = new JButton("Table 5");
		btnTable5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMainFloor.setVisible(false);
				panelTable5.setVisible(true);
			}
		});
		btnTable5.setBackground(Color.GREEN);
		btnTable5.setBounds(200, 236, 85, 45);
		panelMainFloor.add(btnTable5);
		
		
		JButton btnTable6 = new JButton("Table 6");
		btnTable6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMainFloor.setVisible(false);
				panelTable6.setVisible(true);
			}
		});
		btnTable6.setBackground(Color.GREEN);
		btnTable6.setBounds(200, 292, 85, 45);
		panelMainFloor.add(btnTable6);

		
		JButton btnTable7 = new JButton("Table 7");
		btnTable7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMainFloor.setVisible(false);
				panelTable7.setVisible(true);
			}
		});
		btnTable7.setBackground(Color.GREEN);
		btnTable7.setBounds(295, 12, 85, 45);
		panelMainFloor.add(btnTable7);
		
		
		JButton btnTable8 = new JButton("Table 8");
		btnTable8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMainFloor.setVisible(false);
				panelTable8.setVisible(true);
			}
		});
		btnTable8.setBackground(Color.GREEN);
		btnTable8.setBounds(295, 68, 85, 45);
		panelMainFloor.add(btnTable8);
		
		
		JButton btnTable9 = new JButton("Table 9");
		btnTable9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMainFloor.setVisible(false);
				panelTable9.setVisible(true);
			}
		});
		btnTable9.setBackground(Color.GREEN);
		btnTable9.setBounds(295, 124, 85, 45);
		panelMainFloor.add(btnTable9);
		
		
		JButton btnTable10 = new JButton("Table 10");
		btnTable10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMainFloor.setVisible(false);
				panelTable10.setVisible(true);
			}
		});
		btnTable10.setBackground(Color.GREEN);
		btnTable10.setBounds(295, 180, 85, 45);
		panelMainFloor.add(btnTable10);

		
		JButton btnTable11 = new JButton("Table 11");
		btnTable11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMainFloor.setVisible(false);
				panelTable11.setVisible(true);
			}
		});
		btnTable11.setBackground(Color.GREEN);
		btnTable11.setBounds(295, 236, 85, 45);
		panelMainFloor.add(btnTable11);
		
		
		JButton btnTable12 = new JButton("Table 12");
		btnTable12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMainFloor.setVisible(false);
				panelTable12.setVisible(true);
			}
		});
		btnTable12.setBackground(Color.GREEN);
		btnTable12.setBounds(295, 292, 85, 45);
		panelMainFloor.add(btnTable12);
		
		
		JButton btnTable13 = new JButton("Table 13");
		btnTable13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMainFloor.setVisible(false);
				panelTable13.setVisible(true);
			}
		});
		btnTable13.setBackground(Color.GREEN);
		btnTable13.setBounds(390, 12, 85, 45);
		panelMainFloor.add(btnTable13);
		
		
		JButton btnTable14 = new JButton("Table 14");
		btnTable14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMainFloor.setVisible(false);
				panelTable14.setVisible(true);
			}
		});
		btnTable14.setBackground(Color.GREEN);
		btnTable14.setBounds(390, 68, 85, 45);
		panelMainFloor.add(btnTable14);

		
		JButton btnTable15 = new JButton("Table 15");
		btnTable15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMainFloor.setVisible(false);
				panelTable15.setVisible(true);
			}
		});
		btnTable15.setBackground(Color.GREEN);
		btnTable15.setBounds(390, 124, 85, 45);
		panelMainFloor.add(btnTable15);
		
		
		JButton btnTable16 = new JButton("Table 16");
		btnTable16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMainFloor.setVisible(false);
				panelTable16.setVisible(true);
			}
		});
		btnTable16.setBackground(Color.GREEN);
		btnTable16.setBounds(390, 180, 85, 45);
		panelMainFloor.add(btnTable16);
		
		
		JButton btnTable17 = new JButton("Table 17");
		btnTable17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMainFloor.setVisible(false);
				panelTable17.setVisible(true);
			}
		});
		btnTable17.setBackground(Color.GREEN);
		btnTable17.setBounds(390, 236, 85, 45);
		panelMainFloor.add(btnTable17);
		
		
		JButton btnTable18 = new JButton("Table 18");
		btnTable18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMainFloor.setVisible(false);
				panelTable18.setVisible(true);
			}
		});
		btnTable18.setBackground(Color.GREEN);
		btnTable18.setBounds(390, 292, 85, 45);
		panelMainFloor.add(btnTable18);

		
		JButton btnTable19 = new JButton("Table 19");
		btnTable19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMainFloor.setVisible(false);
				panelTable19.setVisible(true);
			}
		});
		btnTable19.setBackground(Color.GREEN);
		btnTable19.setBounds(485, 12, 85, 45);
		panelMainFloor.add(btnTable19);
		
		
		JButton btnTable20 = new JButton("Table 20");
		btnTable20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMainFloor.setVisible(false);
				panelTable20.setVisible(true);
			}
		});
		btnTable20.setBackground(Color.GREEN);
		btnTable20.setBounds(485, 68, 85, 45);
		panelMainFloor.add(btnTable20);
		
		
		JButton btnTable21 = new JButton("Table 21");
		btnTable21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMainFloor.setVisible(false);
				panelTable21.setVisible(true);
			}
		});
		btnTable21.setBackground(Color.GREEN);
		btnTable21.setBounds(485, 124, 85, 45);
		panelMainFloor.add(btnTable21);
		
		
		JButton btnTable22 = new JButton("Table 22");
		btnTable22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMainFloor.setVisible(false);
				panelTable22.setVisible(true);
			}
		});
		btnTable22.setBackground(Color.GREEN);
		btnTable22.setBounds(485, 180, 85, 45);
		panelMainFloor.add(btnTable22);

		
		JButton btnTable23 = new JButton("Table 23");
		btnTable23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMainFloor.setVisible(false);
				panelTable23.setVisible(true);
			}
		});
		btnTable23.setBackground(Color.GREEN);
		btnTable23.setBounds(485, 236, 85, 45);
		panelMainFloor.add(btnTable23);
		
		
		JButton btnTable24 = new JButton("Table 24");
		btnTable24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMainFloor.setVisible(false);
				panelTable24.setVisible(true);
			}
		});
		btnTable24.setBackground(Color.GREEN);
		btnTable24.setBounds(485, 292, 85, 45);
		panelMainFloor.add(btnTable24);
		
		
		JButton btnTable25 = new JButton("Table 25");
		btnTable25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMainFloor.setVisible(false);
				panelTable25.setVisible(true);
			}
		});
		btnTable25.setBackground(Color.GREEN);
		btnTable25.setBounds(580, 12, 85, 45);
		panelMainFloor.add(btnTable25);
		
		
		JButton btnTable26 = new JButton("Table 26");
		btnTable26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMainFloor.setVisible(false);
				panelTable26.setVisible(true);
			}
		});
		btnTable26.setBackground(Color.GREEN);
		btnTable26.setBounds(580, 68, 85, 45);
		panelMainFloor.add(btnTable26);

		
		JButton btnTable27 = new JButton("Table 27");
		btnTable27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMainFloor.setVisible(false);
				panelTable27.setVisible(true);
			}
		});
		btnTable27.setBackground(Color.GREEN);
		btnTable27.setBounds(580, 124, 85, 45);
		panelMainFloor.add(btnTable27);
		
		
		JButton btnTable28 = new JButton("Table 28");
		btnTable28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMainFloor.setVisible(false);
				panelTable28.setVisible(true);
			}
		});
		btnTable28.setBackground(Color.GREEN);
		btnTable28.setBounds(580, 180, 85, 45);
		panelMainFloor.add(btnTable28);
		
		
		JButton btnTable29 = new JButton("Table 29");
		btnTable29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMainFloor.setVisible(false);
				panelTable29.setVisible(true);
			}
		});
		btnTable29.setBackground(Color.GREEN);
		btnTable29.setBounds(580, 236, 85, 45);
		panelMainFloor.add(btnTable29);
		
		
		JButton btnTable30 = new JButton("Table 30");
		btnTable30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMainFloor.setVisible(false);
				panelTable30.setVisible(true);
			}
		});
		btnTable30.setBackground(Color.GREEN);
		btnTable30.setBounds(580, 292, 85, 45);
		panelMainFloor.add(btnTable30);
		
		
	}
	
	/**
	 * This method handles the Date and Time modules.
	 */
	private void clock()
	{
		try {
			Timer timer = new Timer(1000, new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					Calendar cal1 = new GregorianCalendar();
					Calendar cal2 = cal1.getInstance();
					
					String date = new SimpleDateFormat("MMMM '-' dd '-' YYYY").format(Calendar.getInstance().getTime()).toUpperCase();
					String time = new SimpleDateFormat("hh ':' mm ':' ss").format(Calendar.getInstance().getTime());
					
					String am_pm;
					if (cal1.get(Calendar.AM_PM) == 0) {
						am_pm = "AM";
					}
					else {
						am_pm = "PM";
					}
					
					jLabelDate.setText(date);
					jLabelTime.setText(time + " " + am_pm);
				}
				
			});
			timer.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void setPanelMainFloorVisibility(boolean bool) {
		if (bool)
			panelMainFloor.setVisible(true);
		else
			panelMainFloor.setVisible(false);
	}
}
