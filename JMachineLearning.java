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

public class JMachineLearning extends JFrame{
	
	private static JPanel left;
	private static JPanel right;
	private static JPanel middlel;
	private static JPanel middler;
	private static JPanel middlerr;
	private static JPanel middlell;
	
	private JButton supervisedlearning;
	private JButton unsupervisedlearning;
	private JButton reinforcementlearning;
	
	private JButton sign;
	private JButton projects;
	private JButton exit;
		
	static JLabel JL;
	
	final int dh = 1000;
	final int dw = 300;
	//main class with the buttons to all of the other frames
	JMachineLearning(){
		super("Introduction to Machine Learning techniques");
		Container content = getContentPane();
		
		JL = new JLabel ("");
		
		left = new JPanel ();
		left.setSize(250, 200);
		left.setLayout(new CardLayout(10,40)); 
		left.setBounds(0, 50, 250, 200);
		left.setBorder(BorderFactory.createMatteBorder(1, 5, 1, 1, Color.LIGHT_GRAY));
		left.setBackground(Color.LIGHT_GRAY);
		content.add(left);
		
		middlel = new JPanel();
		middlel.setSize(250, 200);
		middlel.setLayout(new CardLayout(10,40));
		middlel.setBounds(250, 50, 250, 200);
		middlel.setBorder(BorderFactory.createMatteBorder(1, 5, 1,1, Color.LIGHT_GRAY));
		middlel.setBackground(Color.LIGHT_GRAY);
		content.add(middlel);
		
		middlell = new JPanel();
		middlell.setSize(250, 200);
		middlell.setLayout(new CardLayout(10,40));
		middlell.setBounds(500, 50, 250, 200);
		middlell.setBorder(BorderFactory.createMatteBorder(1, 5, 1,1, Color.LIGHT_GRAY));
		middlell.setBackground(Color.LIGHT_GRAY);
		content.add(middlell);
		
		middler = new JPanel();
		middler.setSize(250, 200);
		middler.setLayout(new CardLayout(10,40));
		middler.setBounds(750, 50, 250, 200);
		middler.setBorder(BorderFactory.createMatteBorder(1, 5, 1,1, Color.LIGHT_GRAY));
		middler.setBackground(Color.LIGHT_GRAY);
		content.add(middler);
		
		middlerr = new JPanel();
		middlerr.setSize(250, 200);
		middlerr.setLayout(new CardLayout(10,40));
		middlerr.setBounds(1000, 50, 250, 200);
		middlerr.setBorder(BorderFactory.createMatteBorder(1, 5, 1,1, Color.LIGHT_GRAY));
		middlerr.setBackground(Color.LIGHT_GRAY);
		content.add(middlerr);
		
		right = new JPanel ();
		right.setSize(250, 200);
		right.setLayout(new CardLayout(10,40)); 
		right.setBounds(1250, 50, 250, 200);
		right.setBorder(BorderFactory.createMatteBorder(1, 5, 1, 1, Color.LIGHT_GRAY));
		right.setBackground(Color.LIGHT_GRAY);
		content.add(right);
		
		
		
		
		supervisedlearning = new JButton ("Check your preliminaries for the ML course");
		supervisedlearning.setSize(50,50);
		supervisedlearning.setBounds(125,200,50,50);
		supervisedlearning.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JMLRadioButtonsCheckbox f1 = new JMLRadioButtonsCheckbox();
				f1.setVisible(true);
			}
		});
		left.add(supervisedlearning);
		
		unsupervisedlearning = new JButton ("Unsupervised learning");
		unsupervisedlearning.setSize(50,50);
		unsupervisedlearning.setBounds(375,200,50,50);
		unsupervisedlearning.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JMLButtons f2 = new JMLButtons();
				f2.setVisible(true);
			}
		});
		middlel.add(unsupervisedlearning);
		
		reinforcementlearning = new JButton("Reinforcement learning");
		reinforcementlearning.setSize(50,50);
		reinforcementlearning.setBounds(625,200,50,50);
		reinforcementlearning.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JMLMouseKeyboard f3 = new JMLMouseKeyboard();
				f3.setVisible(true);
			}
		});
		middler.add(reinforcementlearning);
		
		projects = new JButton ("Donations");
		projects.setSize(50,50);
		projects.setBounds(875,200,50,50);
		projects.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JMLIndependentCalc f4 = new JMLIndependentCalc();
				f4.setVisible(true);
			}
		});
		middlerr.add(projects);
		
		sign = new JButton ("sign up here");
		sign.setSize(50,50);
		sign.setBounds(0,200,50,50);
		sign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JMLButtons f2 = new JMLButtons();
				f2.setVisible(true);
			}
		});
		middlell.add(sign);
		
		exit = new JButton("Exit");
		exit.setSize(50,50);
		exit.setBounds(1125,200,50,50);
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		right.add(exit);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JMachineLearning frame = new JMachineLearning();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(1250,250);
		frame.setLayout(new BorderLayout());
		frame.add(middlel, BorderLayout.NORTH);
		frame.add(middler, BorderLayout.NORTH);
		frame.add(middlell, BorderLayout.NORTH);
		frame.add(middlerr, BorderLayout.NORTH);
		frame.add(left, BorderLayout.NORTH);
		frame.add(right, BorderLayout.NORTH);
		frame.setBackground(Color.white);
		frame.setVisible(true);
		frame.setResizable(false);
		
	}

}
