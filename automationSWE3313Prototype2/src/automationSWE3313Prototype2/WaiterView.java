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

public class WaiterView {

	private JFrame frmTableStatusScreen;
	private JLabel jLabelTime;
	private JLabel jLabelDate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
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
		
		JPanel panelMainFloor = new JPanel();
		panelMainFloor.setBounds(0, 0, 677, 350);
		frmTableStatusScreen.getContentPane().add(panelMainFloor);
		panelMainFloor.setLayout(null);
		
		JButton btnTable1 = new JButton("Table 1");
		btnTable1.setBackground(Color.GREEN);
		btnTable1.setBounds(200, 12, 85, 45);
		panelMainFloor.add(btnTable1);
		
		JButton btnTable2 = new JButton("Table 2");
		btnTable2.setBackground(Color.GREEN);
		btnTable2.setBounds(200, 68, 85, 45);
		panelMainFloor.add(btnTable2);

		JButton btnTable3 = new JButton("Table 3");
		btnTable3.setBackground(Color.GREEN);
		btnTable3.setBounds(200, 124, 85, 45);
		panelMainFloor.add(btnTable3);
		
		JButton btnTable4 = new JButton("Table 4");
		btnTable4.setBackground(Color.GREEN);
		btnTable4.setBounds(200, 180, 85, 45);
		panelMainFloor.add(btnTable4);
		
		JButton btnTable5 = new JButton("Table 5");
		btnTable5.setBackground(Color.GREEN);
		btnTable5.setBounds(200, 236, 85, 45);
		panelMainFloor.add(btnTable5);
		
		JButton btnTable6 = new JButton("Table 6");
		btnTable6.setBackground(Color.GREEN);
		btnTable6.setBounds(200, 292, 85, 45);
		panelMainFloor.add(btnTable6);

		JButton btnTable7 = new JButton("Table 7");
		btnTable7.setBackground(Color.GREEN);
		btnTable7.setBounds(295, 12, 85, 45);
		panelMainFloor.add(btnTable7);
		
		JButton btnTable8 = new JButton("Table 8");
		btnTable8.setBackground(Color.GREEN);
		btnTable8.setBounds(295, 68, 85, 45);
		panelMainFloor.add(btnTable8);
		
		JButton btnTable9 = new JButton("Table 9");
		btnTable9.setBackground(Color.GREEN);
		btnTable9.setBounds(295, 124, 85, 45);
		panelMainFloor.add(btnTable9);
		
		JButton btnTable10 = new JButton("Table 10");
		btnTable10.setBackground(Color.GREEN);
		btnTable10.setBounds(295, 180, 85, 45);
		panelMainFloor.add(btnTable10);

		JButton btnTable11 = new JButton("Table 11");
		btnTable11.setBackground(Color.GREEN);
		btnTable11.setBounds(295, 236, 85, 45);
		panelMainFloor.add(btnTable11);
		
		JButton btnTable12 = new JButton("Table 12");
		btnTable12.setBackground(Color.GREEN);
		btnTable12.setBounds(295, 292, 85, 45);
		panelMainFloor.add(btnTable12);
		
		JButton btnTable13 = new JButton("Table 13");
		btnTable13.setBackground(Color.GREEN);
		btnTable13.setBounds(390, 12, 85, 45);
		panelMainFloor.add(btnTable13);
		
		JButton btnTable14 = new JButton("Table 14");
		btnTable14.setBackground(Color.GREEN);
		btnTable14.setBounds(390, 68, 85, 45);
		panelMainFloor.add(btnTable14);

		JButton btnTable15 = new JButton("Table 15");
		btnTable15.setBackground(Color.GREEN);
		btnTable15.setBounds(390, 124, 85, 45);
		panelMainFloor.add(btnTable15);
		
		JButton btnTable16 = new JButton("Table 16");
		btnTable16.setBackground(Color.GREEN);
		btnTable16.setBounds(390, 180, 85, 45);
		panelMainFloor.add(btnTable16);
		
		JButton btnTable17 = new JButton("Table 17");
		btnTable17.setBackground(Color.GREEN);
		btnTable17.setBounds(390, 236, 85, 45);
		panelMainFloor.add(btnTable17);
		
		JButton btnTable18 = new JButton("Table 18");
		btnTable18.setBackground(Color.GREEN);
		btnTable18.setBounds(390, 292, 85, 45);
		panelMainFloor.add(btnTable18);

		JButton btnTable19 = new JButton("Table 19");
		btnTable19.setBackground(Color.GREEN);
		btnTable19.setBounds(485, 12, 85, 45);
		panelMainFloor.add(btnTable19);
		
		JButton btnTable20 = new JButton("Table 20");
		btnTable20.setBackground(Color.GREEN);
		btnTable20.setBounds(485, 68, 85, 45);
		panelMainFloor.add(btnTable20);
		
		JButton btnTable21 = new JButton("Table 21");
		btnTable21.setBackground(Color.GREEN);
		btnTable21.setBounds(485, 124, 85, 45);
		panelMainFloor.add(btnTable21);
		
		JButton btnTable22 = new JButton("Table 22");
		btnTable22.setBackground(Color.GREEN);
		btnTable22.setBounds(485, 180, 85, 45);
		panelMainFloor.add(btnTable22);

		JButton btnTable23 = new JButton("Table 23");
		btnTable23.setBackground(Color.GREEN);
		btnTable23.setBounds(485, 236, 85, 45);
		panelMainFloor.add(btnTable23);
		
		JButton btnTable24 = new JButton("Table 24");
		btnTable24.setBackground(Color.GREEN);
		btnTable24.setBounds(485, 292, 85, 45);
		panelMainFloor.add(btnTable24);
		
		JButton btnTable25 = new JButton("Table 25");
		btnTable25.setBackground(Color.GREEN);
		btnTable25.setBounds(580, 12, 85, 45);
		panelMainFloor.add(btnTable25);
		
		JButton btnTable26 = new JButton("Table 26");
		btnTable26.setBackground(Color.GREEN);
		btnTable26.setBounds(580, 68, 85, 45);
		panelMainFloor.add(btnTable26);

		JButton btnTable27 = new JButton("Table 27");
		btnTable27.setBackground(Color.GREEN);
		btnTable27.setBounds(580, 124, 85, 45);
		panelMainFloor.add(btnTable27);
		
		JButton btnTable28 = new JButton("Table 28");
		btnTable28.setBackground(Color.GREEN);
		btnTable28.setBounds(580, 180, 85, 45);
		panelMainFloor.add(btnTable28);
		
		JButton btnTable29 = new JButton("Table 29");
		btnTable29.setBackground(Color.GREEN);
		btnTable29.setBounds(580, 236, 85, 45);
		panelMainFloor.add(btnTable29);
		
		JButton btnTable30 = new JButton("Table 30");
		btnTable30.setBackground(Color.GREEN);
		btnTable30.setBounds(580, 292, 85, 45);
		panelMainFloor.add(btnTable30);
		
		JLabel jLabelWaiterName = new JLabel("Waiter: Andrew");
		jLabelWaiterName.setVerticalAlignment(SwingConstants.BOTTOM);
		jLabelWaiterName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jLabelWaiterName.setBounds(10, 89, 167, 24);
		panelMainFloor.add(jLabelWaiterName);
		
		JLabel jLabelWaiterID = new JLabel("ID: 12");
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
		
		JPanel panelTable30 = new JPanel();
		panelTable30.setBounds(0, 0, 677, 350);
		frmTableStatusScreen.getContentPane().add(panelTable30);
		
		JPanel panelTable1 = new JPanel();
		panelTable1.setBounds(0, 0, 677, 350);
		frmTableStatusScreen.getContentPane().add(panelTable1);
		
		JPanel panelTable2 = new JPanel();
		panelTable2.setBounds(0, 0, 677, 350);
		frmTableStatusScreen.getContentPane().add(panelTable2);
		
		JPanel panelTable3 = new JPanel();
		panelTable3.setBounds(0, 0, 677, 350);
		frmTableStatusScreen.getContentPane().add(panelTable3);
		
		JPanel panelTable4 = new JPanel();
		panelTable4.setBounds(0, 0, 677, 350);
		frmTableStatusScreen.getContentPane().add(panelTable4);
		
		JPanel panelTable5 = new JPanel();
		panelTable5.setBounds(0, 0, 677, 350);
		frmTableStatusScreen.getContentPane().add(panelTable5);
		
		JPanel panelTable6 = new JPanel();
		panelTable6.setBounds(0, 0, 677, 350);
		frmTableStatusScreen.getContentPane().add(panelTable6);
		
		JPanel panelTable7 = new JPanel();
		panelTable7.setBounds(0, 0, 677, 350);
		frmTableStatusScreen.getContentPane().add(panelTable7);
		
		JPanel panelTable8 = new JPanel();
		panelTable8.setBounds(0, 0, 677, 350);
		frmTableStatusScreen.getContentPane().add(panelTable8);
		
		JPanel panelTable9 = new JPanel();
		panelTable9.setBounds(0, 0, 677, 350);
		frmTableStatusScreen.getContentPane().add(panelTable9);
		
		JPanel panelTable10 = new JPanel();
		panelTable10.setBounds(0, 0, 677, 350);
		frmTableStatusScreen.getContentPane().add(panelTable10);
		
		JPanel panelTable11 = new JPanel();
		panelTable11.setBounds(0, 0, 677, 350);
		frmTableStatusScreen.getContentPane().add(panelTable11);
		
		JPanel panelTable12 = new JPanel();
		panelTable12.setBounds(0, 0, 677, 350);
		frmTableStatusScreen.getContentPane().add(panelTable12);
		
		JPanel panelTable13 = new JPanel();
		panelTable13.setBounds(0, 0, 677, 350);
		frmTableStatusScreen.getContentPane().add(panelTable13);
		
		JPanel panelTable14 = new JPanel();
		panelTable14.setBounds(0, 0, 677, 350);
		frmTableStatusScreen.getContentPane().add(panelTable14);
		
		JPanel panelTable15 = new JPanel();
		panelTable15.setBounds(0, 0, 677, 350);
		frmTableStatusScreen.getContentPane().add(panelTable15);
		
		JPanel panelTable16 = new JPanel();
		panelTable16.setBounds(0, 0, 677, 350);
		frmTableStatusScreen.getContentPane().add(panelTable16);
		
		JPanel panelTable17 = new JPanel();
		panelTable17.setBounds(0, 0, 677, 350);
		frmTableStatusScreen.getContentPane().add(panelTable17);
		
		JPanel panelTable18 = new JPanel();
		panelTable18.setBounds(0, 0, 677, 350);
		frmTableStatusScreen.getContentPane().add(panelTable18);
		
		JPanel panelTable19 = new JPanel();
		panelTable19.setBounds(0, 0, 677, 350);
		frmTableStatusScreen.getContentPane().add(panelTable19);
		
		JPanel panelTable20 = new JPanel();
		panelTable20.setBounds(0, 0, 677, 350);
		frmTableStatusScreen.getContentPane().add(panelTable20);
		
		JPanel panelTable21 = new JPanel();
		panelTable21.setBounds(0, 0, 677, 350);
		frmTableStatusScreen.getContentPane().add(panelTable21);
		
		JPanel panelTable22 = new JPanel();
		panelTable22.setBounds(0, 0, 677, 350);
		frmTableStatusScreen.getContentPane().add(panelTable22);
		
		JPanel panelTable23 = new JPanel();
		panelTable23.setBounds(0, 0, 677, 350);
		frmTableStatusScreen.getContentPane().add(panelTable23);
		
		JPanel panelTable24 = new JPanel();
		panelTable24.setBounds(0, 0, 677, 350);
		frmTableStatusScreen.getContentPane().add(panelTable24);
		
		JPanel panelTable25 = new JPanel();
		panelTable25.setBounds(0, 0, 677, 350);
		frmTableStatusScreen.getContentPane().add(panelTable25);
		
		JPanel panelTable26 = new JPanel();
		panelTable26.setBounds(0, 0, 677, 350);
		frmTableStatusScreen.getContentPane().add(panelTable26);
		
		JPanel panelTable27 = new JPanel();
		panelTable27.setBounds(0, 0, 677, 350);
		frmTableStatusScreen.getContentPane().add(panelTable27);
		
		JPanel panelTable28 = new JPanel();
		panelTable28.setBounds(0, 0, 677, 350);
		frmTableStatusScreen.getContentPane().add(panelTable28);
		
		JPanel panelTable29 = new JPanel();
		panelTable29.setBounds(0, 0, 677, 350);
		frmTableStatusScreen.getContentPane().add(panelTable29);
	}
	
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
	
}
