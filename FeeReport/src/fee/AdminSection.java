/**
 * 
 */
package fee;

import java.awt.EventQueue;

import javax.swing.*;

/**
 * @author ag71812
 *
 */
public class AdminSection extends JFrame {

	/**
	 * @param args
	 */
	static AdminSection frame;
	private JLabel intro;
	private JButton addAccountant,viewAccountant,logout;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run( ) {
				try {
					frame = new AdminSection();
					frame.setVisible(true);
				} 	
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
	
	public AdminSection() {
		
		intro = new JLabel("Admin Section");
		intro.setBounds(135,0,100,30);
		
		addAccountant = new JButton();
		addAccountant.setText("Add Accountant");
		addAccountant.setBounds(120,50,120,30);
		addAccountant.setFocusable(false);
		
		viewAccountant = new JButton();
		viewAccountant.setText("View Accountant");
		viewAccountant.setBounds(120,100,120,30);
		viewAccountant.setFocusable(false);
		
		
		logout = new JButton();
		logout.setText("logout");
		logout.setBounds(120,150,120,30);
		logout.setFocusable(false);
		
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		setLayout(null);
		setVisible(false);
		add(intro);
		add(addAccountant);
		add(viewAccountant);
		add(logout);
		
	
		
	}

}
