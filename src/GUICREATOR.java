import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;

public class GUICREATOR {

	private JFrame frame;
	private JTextField textField;
	private JTextField searchtxt;
	private JTable Users;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUICREATOR window = new GUICREATOR();
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
	public GUICREATOR() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel Titel = new JLabel("Benutzer Verwaltung LBRM");
		Titel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(Titel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton add = new JButton("Neuen benutzer erstellen");
		panel.add(add);
		
		JButton details = new JButton("Details");
		panel.add(details);
		
		JButton edit = new JButton("Bearbeiten");
		panel.add(edit);
		
		JButton delete = new JButton("L\u00F6schen");
		panel.add(delete);
		
		searchtxt = new JTextField();
		searchtxt.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(searchtxt);
		searchtxt.setColumns(10);
		
		JButton search = new JButton("Suchen");
		panel.add(search);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		
		JSplitPane List = new JSplitPane();
		List.setOrientation(JSplitPane.VERTICAL_SPLIT);
		panel_1.add(List);
		
		Users = new JTable();
		Users.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"ID", "Name", "Vorname", "E-Mail"
			}
		));
		Users.getColumnModel().getColumn(0).setPreferredWidth(150);
		Users.getColumnModel().getColumn(1).setPreferredWidth(150);
		Users.getColumnModel().getColumn(2).setPreferredWidth(150);
		Users.getColumnModel().getColumn(3).setPreferredWidth(200);
		List.setRightComponent(Users);
		
		JLabel ID = new JLabel("ID                                              Name                                         Vorname                                    E-Mail");
		List.setLeftComponent(ID);
	}

}
