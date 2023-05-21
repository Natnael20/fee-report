package fee;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;


public class adminLogin extends JFrame {

	 static adminLogin frame;
	 private JLabel intro, name, password;
	 private JTextField NameField;
	 private JPasswordField passwordField;
	 private JButton login;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new adminLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	adminLogin() {
		 
		 intro = new JLabel("Admin login");
		 intro.setBounds(135, 0, 100, 50);
		 
		 name = new JLabel("Username");
		 name.setBounds(30, 50, 100, 50);
		 //name.setFont(new Font("Tmes New Roman", Font.PLAIN,15));
		 
		 password = new JLabel("Password");
		 password.setBounds(30, 100, 100, 40);
		 //password.setFont(new Font("Times New Roman", Font.PLAIN,15));
		 
		 NameField = new JTextField();
		 NameField.setBounds(130,65,150,25);
		 NameField.setBackground(Color.WHITE);
		 
		 passwordField = new JPasswordField();
		 passwordField.setBounds(130,110,150,25);
		 passwordField.setBackground(Color.WHITE);
		 
		 login = new JButton("Login");
		 login.setBounds(125,200,120,30);
		 login.setFocusable(false);
		
		 setSize(400, 400);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setResizable(true);
		 setLayout(null);
		 setVisible(false);
		 add(intro);
		 add(name);
		 add(password);
		 add(NameField);
		 add(passwordField);
		 add(login);
		
		 login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = NameField.getText();
				Object password;
				password = passwordField.getPassword();
				if(name.equals("") && password.equals("")) {
					NameField.getText();
					passwordField.getPassword();
				}

			}
		});

	}

}