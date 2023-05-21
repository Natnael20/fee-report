package fee;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.EventQueue;

import javax.swing.*;

public class AccountantSection extends JFrame {

	static AccountantSection frame;
	JLabel intro;
	JButton addStudent, viewStudent, editStudent, DueFee, Logout;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AccountantSection();
					frame.setVisible(true);
				}
				
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
	
	AccountantSection() {
		
		intro = new JLabel("Accountant Section");
		intro.setBounds(110, 20, 200, 40);
		intro.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		addStudent = new JButton("Add Student");
		addStudent.setBounds(30,70,120,40);
		addStudent.setFocusable(false);
		
		viewStudent = new JButton("View Student");
		viewStudent.setBounds(200, 70, 120, 40);
		viewStudent.setFocusable(false);
		
		editStudent = new JButton("Edit Student");
		editStudent.setBounds(30, 130, 120, 40);
		editStudent.setFocusable(false);
		
		DueFee = new JButton("Due Fee");
		DueFee.setBounds(200, 130, 120, 40);
		DueFee.setFocusable(false);
		
		Logout = new JButton("Log out");
		Logout.setBounds(110, 200, 120, 40);
		
		
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
		add(intro);
		add(addStudent);
		add(viewStudent);
		add(editStudent);
		add(DueFee);
		add(Logout);
		
	}


}
