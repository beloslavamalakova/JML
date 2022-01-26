import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JMLRadioButtonsCheckbox extends JFrame {
	
	JFrame wind1;
	private static JPanel knowledge;
	private JCheckBox c1;
	private JCheckBox c2;
	private JCheckBox c3;
	private JCheckBox c4;
	private JCheckBox c5;
	private JCheckBox c6;
	private JTextField tf1;
	
	//checkbox frame has to have an added function to change the frame in a way when clicking a checkbox
	JMLRadioButtonsCheckbox(){
		super("Check your preliminatires");
		Container content = getContentPane();
			
		knowledge = new JPanel ();
		knowledge.setSize(250, 200);
		knowledge.setLayout(new CardLayout(10,40)); 
		knowledge.setBounds(0, 50, 250, 200);
		knowledge.setBorder(BorderFactory.createMatteBorder(1, 5, 1, 1, Color.LIGHT_GRAY));
		knowledge.setBackground(Color.LIGHT_GRAY);
		content.add(knowledge);
		
		c1 = new JCheckBox("Python OOP");
		knowledge.add(c1);
		c2 = new JCheckBox("Basic understanding of neural network architectures");
		knowledge.add(c2);
		c3 = new JCheckBox("CPU/GPU differences");
		knowledge.add(c3);
		c4 = new JCheckBox("generative algorithms");
		knowledge.add(c4);
		c5 = new JCheckBox("bottlenecks and data preprocessing");
		knowledge.add(c5);
		c6 = new JCheckBox("data science libraries");
		knowledge.add(c6);
		tf1 = new JTextField(5);
		knowledge.add(tf1);
	}
	
	public static void main(String[] args) {
		JMachineLearning frame = new JMachineLearning();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(1250,250);
		frame.setLayout(new BorderLayout());
		frame.add(knowledge, BorderLayout.NORTH);
		frame.setBackground(Color.blue);
		frame.setVisible(true);
		frame.setResizable(false);
		
	}

}
