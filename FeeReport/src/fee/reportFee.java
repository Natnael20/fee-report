package fee;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.*;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class reportFee {
	
	
	JLabel intro;
	JButton button1;
	JButton button2;
	
	reportFee() {
		
		intro = new JLabel("Fee Report");
		intro.setFont(new Font("Arial", Font.PLAIN, 20));
		intro.setBounds(150, 0, 100, 50);
		
		button1 = new JButton("Admin login");
		button1.setBounds(120, 50, 150, 50);
		button1.setBackground(Color.RED);
		button1.setFocusable(false);
		
		
		button2 = new JButton("Accountant Login");
		button2.setBounds(120, 150, 150, 50);
		button2.setBackground(Color.RED);
		button2.setFocusable(false);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(intro);
		frame.add(button1);
		frame.add(button2);	
	}
}
