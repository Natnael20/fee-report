package fee;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.*;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;

public class addAccountant extends JFrame{
	
	static addAccountant frame;
	JLabel AddAccountantLabel ,Name, Password, Email, ContactNo;
	JTextField JNameField, JEmailField, JContactNo;
	JPasswordField JPassword;
	JButton AddAccountant, back;
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new addAccountant();
					frame.setVisible(true);
				}
				
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public addAccountant() {
		
		AddAccountantLabel = new JLabel();
		AddAccountantLabel.setText("Add Accountant");
		AddAccountantLabel.setBounds(120,0,120,30);
		AddAccountantLabel.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 15));
		
		Name = new JLabel();
		Name.setText("Name");
		Name.setBounds(40,70,100,30);
		
		JNameField = new JTextField();
		JNameField.setBounds(120,77,120,20);
		
		Password = new JLabel();
		Password.setText("Password");
		Password.setBounds(40,100,100,30);
		
		JPassword = new JPasswordField();
		JPassword.setBounds(120,106,120,20);
		
		Email = new JLabel();
		Email.setText("Email");
		Email.setBounds(40,130,50,30);
		
		JEmailField = new JTextField();
		JEmailField.setBounds(120,135,120,20);
		
		ContactNo = new JLabel();
		ContactNo.setText("ContantNo");
		ContactNo.setBounds(40,160,100,30);
		
		JContactNo = new JTextField();
		JContactNo.setBounds(120,165,120,20);
		
		AddAccountant = new JButton("Add Acountant");
		AddAccountant.setBounds(120,200,120,30);
		
		back = new JButton("Back");
		back.setBounds(270,200,100,20);
		
		
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		setLayout(null);
		setVisible(false);
		add(AddAccountantLabel);
		add(Name);
		add(Password);
		add(Email);
		add(ContactNo);
		add(JNameField);
		add(JPassword);
		add(JEmailField);
		add(JContactNo);
		add(AddAccountant);
		add(back);
	
		JEmailField.addActionListener(e -> {
			 String email = JEmailField.getText();
			 if(isValidEmail(email)) {
				 System.out.println("Valid email: " + email);
			 }
			 
			 else {
				 System.out.println("Email is valid");
			 }
		 });
	}	
	
	 private static final Pattern EMAIL_PATTERN = Pattern.compile(
		        "^\\s*([A-Za-z0-9._%+-]+)@([A-Za-z0-9.-]+)\\.([A-Za-z]{2,})\\s*$");
		    
		    // function to validate email address using regular expression
		    private static boolean isValidEmail(String email) {
		        Matcher matcher = EMAIL_PATTERN.matcher(email);
		        return matcher.matches();
		    }
}
