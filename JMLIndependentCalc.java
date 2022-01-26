import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JMLIndependentCalc extends JFrame {
	
	public JMLIndependentCalc() {
		setTitle("Donations");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 230);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtFirst = new JTextField("0");
		txtFirst.setBounds(12, 13, 150, 30);
		contentPane.add(txtFirst);
		txtFirst.setColumns(10);
		
		txtSecond = new JTextField("0");
		txtSecond.setColumns(10);
		txtSecond.setBounds(12, 56, 150, 30);
		contentPane.add(txtSecond);
		
		txtThird = new JTextField("0");
		txtThird.setColumns(10);
		txtThird.setBounds(12, 99, 150, 30);
		contentPane.add(txtThird);
		
		txtFour = new JTextField("0");
		txtFour.setColumns(10);
		txtFour.setBounds(12, 142, 150, 30);
		contentPane.add(txtFour);
		
		btnCompute = new JButton("How much would it cost? -- enter the time(in months) for which you would like to be donating");
		btnCompute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double d1,d2,d3,d4;
				try {
				d1 = Double.parseDouble(txtFirst.getText());
				d2 = Double.parseDouble(txtSecond.getText());
				d3 = Double.parseDouble(txtThird.getText());
				d4 = Double.parseDouble(txtFour.getText());
				}catch(NumberFormatException exc) {
					JOptionPane.showMessageDialog(getFrame(), "Invalid data was entered!", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				double sum = d1*(d2+d3+d4);
				lblResult.setText("Total cost: "+sum);
				return;
			}
		});
		btnCompute.setBounds(174, 16, 700, 30);
		contentPane.add(btnCompute);
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFirst.setText("0");
				txtSecond.setText("0");
				txtThird.setText("0");
				txtFour.setText("0");
				lblResult.setText("");
				return;
			}
		});
		btnClear.setBounds(174, 56, 150, 30);
		contentPane.add(btnClear);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				closeTheApplication();
			}
		});
		btnExit.setBounds(174, 99, 150, 30);
		contentPane.add(btnExit);
		
		lblResult = new JLabel("");
		lblResult.setBounds(174, 142, 150, 30);
		contentPane.add(lblResult);
	}

	private JPanel contentPane;
	private JTextField txtFirst;
	private JTextField txtSecond;
	private JTextField txtThird;
	private JTextField txtFour;
	private JButton btnCompute;
	private JButton btnClear;
	private JButton btnExit;
	private JLabel lblResult;
	
	private void closeTheApplication() {
		this.dispose();
		return;
	}
	
	private JFrame getFrame() {
		return this;
	}
	
}