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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JMLButtons extends JFrame {
	
	private JFrame wind2;
	private static JPanel b1;
	private static JPanel b2;
	private static JPanel b3;
	private static JPanel b4;
	
	private JButton goback;
	private JButton picture;
	private JButton text;
	private JButton textarea;
	
     //frame with three buttons, one text, one additional text and image	
	JMLButtons(){
		super("Introduction to Neural Networks");
		Container content = getContentPane();
		
		wind2 = new JFrame();
		
		b1 = new JPanel ();
		b1.setSize(250, 200);
		b1.setLayout(new CardLayout(10,40)); 
		b1.setBounds(0, 50, 250, 200);
		b1.setBorder(BorderFactory.createMatteBorder(1, 5, 1, 1, Color.LIGHT_GRAY));
		b1.setBackground(Color.LIGHT_GRAY);
		content.add(b1);
		
		b2 = new JPanel ();
		b2.setSize(250, 200);
		b2.setLayout(new CardLayout(10,40)); 
		b2.setBounds(250, 50, 250, 200);
		b2.setBorder(BorderFactory.createMatteBorder(1, 5, 1, 1, Color.LIGHT_GRAY));
		b2.setBackground(Color.LIGHT_GRAY);
		content.add(b2);
		
		b3 = new JPanel ();
		b3.setSize(250, 200);
		b3.setLayout(new CardLayout(10,40)); 
		b3.setBounds(500, 50, 250, 200);
		b3.setBorder(BorderFactory.createMatteBorder(1, 5, 1, 1, Color.LIGHT_GRAY));
		b3.setBackground(Color.LIGHT_GRAY);
		content.add(b3);
		
		b4 = new JPanel ();
		b4.setSize(750, 200);
		b4.setLayout(new CardLayout(10,40)); 
		b4.setBounds(0, 50, 250, 200);
		b4.setBorder(BorderFactory.createMatteBorder(1, 5, 1, 1, Color.LIGHT_GRAY));
		b4.setBackground(Color.LIGHT_GRAY);
		content.add(b4);
		
		goback = new JButton("back to the main page");
		goback.setSize(50,50);
		goback.setBounds(125,200,50,50);
		b1.add(goback);
		
		picture = new JButton("neural network architecture");
		picture.setSize(50,50);
		picture.setBounds(375,200,50,50);
		b2.add(picture);
		
		text = new JButton("for more information on ANN");
		text.setSize(50,50);
		text.setBounds(625,200,50,50);
		b3.add(text);
		
		textarea = new JButton("types of networks");
		textarea.setSize(50,50);
		textarea.setBounds(875,200,50,50);
		b4.add(textarea);
		
	}

	public static void main(String[] args) {
		JMachineLearning frame = new JMachineLearning();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(1250,250);
		frame.setLayout(new BorderLayout());
		frame.add(b1, BorderLayout.NORTH);
		frame.add(b2, BorderLayout.NORTH);
		frame.add(b3, BorderLayout.NORTH);
		frame.add(b4, BorderLayout.NORTH);
		frame.setBackground(Color.blue);
		frame.setVisible(true);
		frame.setResizable(false);
		
	}

}
