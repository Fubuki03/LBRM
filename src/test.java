import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JSeparator;
import javax.swing.BoxLayout;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class test {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JTextPane txtpnErrorUserId_1 = new JTextPane();
		txtpnErrorUserId_1.setText("                                                      \r\n                                                 ERROR\r\n\r\n                                     USER ID already used");
		txtpnErrorUserId_1.setForeground(Color.RED);
		txtpnErrorUserId_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(txtpnErrorUserId_1, BorderLayout.CENTER);
		
		JButton next = new JButton("Weiter");
		frame.getContentPane().add(next, BorderLayout.SOUTH);
	}

}
