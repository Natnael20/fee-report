/**
 * 
 */
package fee;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 * @author ag71812
 *
 */
public class updateStudent extends JFrame {

	static updateStudent frame;
	JLabel rollNo, name, email, course, fee, paid, due, address, city, country, contactNo;
	JTextField rollNoField, nameField, emailField, courseField, feeField, paidField, addressField;
	JTextField dueField, cityField, CountryField, contactNoField;
	JButton loadRecord, updateStudent, back;
	JPanel lineCut;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run( ) {
				try {
					frame = new updateStudent();
					frame.setVisible(true);
				}
				catch(Exception e) {
					e.getCause();
				}
			}
		});
	}
	
	updateStudent() {
		rollNo = new JLabel();
		rollNo.setText("RollNo: ");
		rollNo.setBounds(20, 10, 50, 20);
		lineCut = new JPanel();
		lineCut.setBounds(0, 40, 400,5);
		name = new JLabel();
		name.setText("Name");
		name.setBounds(20, 60, 100, 20);
		email = new JLabel();
		email.setText("Email");
		email.setBounds(20, 100, 100, 20);
		course = new JLabel();
		course.setText("Course");
		course.setBounds(20, 140, 100, 20);
		fee = new JLabel();
		fee.setText("Fee");
		fee.setBounds(20, 180, 100, 20);
		paid = new JLabel();
		paid.setText("Paid");
		paid.setBounds(20, 220, 100, 20);
		due = new JLabel();
		due.setText("Due");
		due.setBounds(20, 260, 100, 20);
		address = new JLabel();
		address.setText("Address");
		address.setBounds(20, 300, 100, 20);
		city = new JLabel();
		city.setText("City");
		city.setBounds(20, 340, 100, 20);
		country = new JLabel();
		country.setText("Country");
		country.setBounds(20, 380, 100, 20);
		contactNo = new JLabel();
		contactNo.setText("ContactNo");
		contactNo.setBounds(20, 420, 100, 20);
		
		rollNoField = new JTextField();
		rollNoField.setBounds(100, 10, 140, 20);
		nameField = new JTextField("ex josh");
		nameField.setBounds(100, 60, 150, 20);;
		emailField = new JTextField("johs12@gmail.com");
		emailField.setBounds(100, 100, 150, 20);
		courseField = new JTextField("ex English");
		courseField.setBounds(100, 140, 150, 20);
		feeField = new JTextField();
		feeField.setBounds(100, 180, 150, 20);
		paidField = new JTextField();
		paidField.setBounds(100, 220, 150, 20);
		dueField = new JTextField();
		dueField.setBounds(100, 260, 150, 20);
		addressField = new JTextField();
		addressField.setBounds(100, 300, 120, 20);
		cityField = new JTextField("ex Stockholm");
		cityField.setBounds(100, 340, 150, 20);
		CountryField = new JTextField("ex Sweden");
		CountryField.setBounds(100, 380, 150, 20);;
		contactNoField = new JTextField("ex +460813431464"); 
		contactNoField.setBounds(100, 420, 150, 20);
		
		loadRecord = new JButton("Load Record");
		loadRecord.setBounds(255, 0, 120, 30);
		loadRecord.setFocusable(false);


		updateStudent = new JButton("Add Student");
		updateStudent.setBounds(120, 490, 120, 30);
		updateStudent.setFocusable(false);
		
		back = new JButton("Back");
		back.setBounds(250, 490, 100, 20);
		back.setFocusable(false);
		
		
		
		
		setSize(400,600);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(true);
		setLayout(null);
		setVisible(true);	
		
		add(rollNo);
		add(lineCut);
		add(name);
		add(email);
		add(course);
		add(fee);
		add(paid);
		add(due);
		add(address);
		add(city);
		add(country);
		add(contactNo);
		add(rollNoField);
		add(nameField);
		add(emailField);
		add(courseField);
		add(feeField);
		add(paidField);
		add(dueField);
		add(addressField);
		add(cityField);
		add(CountryField);
		add(contactNoField);
		add(loadRecord);
		add(updateStudent);
		add(back);
	}
		

}
