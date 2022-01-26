import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JMLCalculations extends JFrame {
	private static JPanel timezones;
	
	JMLCalculations(){
		super("Time zones");
		Container content = getContentPane();
		
		timezones = new JPanel ();
		timezones.setSize(250, 200);
		timezones.setLayout(new CardLayout(10,40)); 
		timezones.setBounds(0, 50, 250, 200);
		timezones.setBorder(BorderFactory.createMatteBorder(1, 5, 1, 1, Color.LIGHT_GRAY));
		timezones.setBackground(Color.LIGHT_GRAY);
		content.add(timezones);
	}
	

	public JMLCalculations() throws HeadlessException {
		// TODO Auto-generated constructor stub
	}

	public JMLCalculations(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	public JMLCalculations(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public JMLCalculations(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}
	
	

}