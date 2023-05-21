/**
 * 
 */
package fee;

import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 * @author ag71812
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 JFrame frame = new JFrame("Test");
		    JPanel panel = new JPanel();
		    JLabel label = new JLabel("CenteredJLabel");
		    JLabel name = new JLabel("Name");
			
		    panel.setLayout(new GridBagLayout());
		    //panel.add(label);
		    panel.add(name);
		    panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		    frame.add(panel);
		    frame.setSize(400, 300);
		    frame.setVisible(true);
	}

}
