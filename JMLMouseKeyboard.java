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

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JMLMouseKeyboard {
	
	private JPanel contentPane;
	private JPanel pan;
	private JButton btnDraw;
	private JButton btnErase;

	//0 - Draw, 1 - Erase
	private int mode = 0;
	
	private int width = 10;
	
	public JMLMouseKeyboard(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		pan = new JPanel();
		pan.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Graphics2D g = (Graphics2D) pan.getGraphics();
				if(mode==0) {
					g.setColor(Color.black);
				}else {
					g.setColor(Color.white);
				}
				g.fillOval(e.getX()-width, e.getY()-width, 2*width, 2*width);
				return;
			}
		});
		pan.setBackground(Color.WHITE);
		pan.setBounds(12, 13, 842, 527);
		contentPane.add(pan);
		
		btnDraw = new JButton("Draw");
		btnDraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mode=0;
				return;
			}
		});
		btnDraw.setFont(new Font("Arial", Font.PLAIN, 12));
		btnDraw.setBounds(866, 13, 104, 25);
		contentPane.add(btnDraw);
		
		btnErase = new JButton("Erase");
		btnErase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mode=1;
				return;
			}
		});
		btnErase.setFont(new Font("Arial", Font.PLAIN, 12));
		btnErase.setBounds(866, 51, 104, 25);
		contentPane.add(btnErase);
		return;
	}


	
}



