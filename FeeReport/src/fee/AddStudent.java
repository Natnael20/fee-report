/**
 * 
 */
package fee;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.*;
/**
 * @author ag71812
 *
 */
public class AddStudent extends JFrame{

	static AddStudent frame;
	JPanel contents;
	JLabel title;
	JLabel name, email, course, fee, paid, due, address, city, country, contactNo;
	JTextField nameField, emailField, courseField, feeField, paidField, addressField;
	JTextField dueField, cityField, CountryField, contactNoField;
	JButton addStudent, back;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AddStudent();
					frame.setVisible(true);
				}
				
				catch(Exception e) {
					e.getCause();
				}
			}
		});
	}

	AddStudent() {
		title = new JLabel("Add Student");
		title.setBounds(120, 10, 200, 20);
		title.setFont(new Font("Cambria", Font.BOLD, 20));
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

		addStudent = new JButton("Add Student");
		addStudent.setBounds(120, 490, 120, 30);
		addStudent.setFocusable(false);
		
		back = new JButton("Back");
		back.setBounds(250, 490, 100, 20);
		back.setFocusable(false);
		
		
		
		
		setSize(400,600);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(true);
		setLayout(null);
		setVisible(true);	
		
		add(title);
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
		add(addStudent);
		add(back);

	}
	
    public void actionPerformed(ActionEvent e) {
    	String name = nameField.getText();
    	String course = courseField.getText();
    	String Fee = feeField.getText();
    	int fee = Integer.parseInt(Fee);
    	String Paid = paidField.getText();
    	int paid = Integer.parseInt(Paid);
    	String Due = dueField.getText();
    	int due = Integer.parseInt(Due);
    	
    	try {
    		if(name.contains(null) && course.contains(null)) {
    			nameField.setText("Write your name");
    			courseField.setText("Write the course");	
    		}
    		
    		else if(fee == 0 && paid == 0 && due == 0) {
    			feeField.setText("Write down the fee");
    			paidField.setText("Write down the amount");
    			dueField.setText("Write down its due");
    		}
    	}
	
    	catch(Exception e1) {
    		e1.printStackTrace();
    	}
    	
    	
    	String address = addressField.getText();
		if(isValidAddress(address)) {
		}
		
		else {
            // Display an error message for invalid address
            JOptionPane.showMessageDialog(frame, "Invalid home address entered.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    	
    	String email = emailField.getText();
    	if(isValidEmail(email)) {
		}
		
		else {
            // Display an error message for invalid address
            JOptionPane.showMessageDialog(frame, "Invalid email address entered.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    	
    	String city = cityField.getText();
		if(isValidCity(city)) {
		}
		
		else {
            // Display an error message for invalid address
            JOptionPane.showMessageDialog(frame, "Invalid city address entered.", "Error", JOptionPane.ERROR_MESSAGE);
        }
		
		String country = CountryField.getText();
		if(isValidCountry(country)) {
			
		}
		
		else {
            // Display an error message for invalid country name
            JOptionPane.showMessageDialog(frame, "Invalid country name entered.", "Error", JOptionPane.ERROR_MESSAGE);
        }
		
		String contactNo = contactNoField.getText();
		if(isValidContactNo(contactNo)) {
			
		}
		
		else {
			JOptionPane.showMessageDialog(frame, "Invalid contact number is entered.", "Error", JOptionPane.ERROR_MESSAGE);
		}

  }
	
	private static final Pattern EMAIL_PATTERN = Pattern.compile(
	        "^\\s*([A-Za-z0-9._%+-]+)@([A-Za-z0-9.-]+)\\.([A-Za-z]{2,})\\s*$");
	    
	    // function to validate email address using regular expression
	    private static boolean isValidEmail(String email) {
	        Matcher matcher = EMAIL_PATTERN.matcher(email);
	        return matcher.matches();
	    }
	
	    private static boolean isValidAddress(String address) {
	        // Use a regular expression to validate the address format
	        String regex = "^[\\w\\s\\.\\-,#]+$";
	        return address.matches(regex);
	    }
	    
	    private static boolean isValidCity(String city) {
	        // Use a regular expression to validate the address format
	        String regex = "^[a-zA-Z\\s\\-\\']+$";
	        return city.matches(regex);
	    }
	    
	    private static boolean isValidCountry(String country) {
	    	String regex = "^[a-zA-Z\\s]+$";
	    	return country.matches(regex);
	    }
	    
	    private static boolean isValidContactNo(String contactno) {
	        // Use a regular expression to validate the contact number format
	        String regex = "^\\d{10}$";
	        return contactno.matches(regex);
	    }
}
 