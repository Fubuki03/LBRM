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
	private JTextField username;
	private JTextField password;
	private JTextField workgroup;
	private JTextField name;
	private JTextField vname;
	private JTextField email;
	private JTextField phone;
	private JTextField home;
	private JTextField birthdate;
	private JTextField vnumber;
	private JTextField mnumber;

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
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(11, 2, 0, 0));
		
		JLabel Username = new JLabel("Benutzernamen");
		Username.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(Username);
		
		username = new JTextField();
		panel_1.add(username);
		username.setColumns(10);
		
		JLabel Password = new JLabel("Passwort");
		Password.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(Password);
		
		password = new JTextField();
		panel_1.add(password);
		password.setColumns(10);
		
		JLabel Workgroup = new JLabel("Arbeitsgruppe");
		Workgroup.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(Workgroup);
		
		workgroup = new JTextField();
		panel_1.add(workgroup);
		workgroup.setColumns(10);
		
		JLabel Name = new JLabel("Name");
		Name.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(Name);
		
		name = new JTextField();
		panel_1.add(name);
		name.setColumns(10);
		
		JLabel Vname = new JLabel("Vorname");
		Vname.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(Vname);
		
		vname = new JTextField();
		panel_1.add(vname);
		vname.setColumns(10);
		
		JLabel Email = new JLabel("E-Mail");
		Email.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(Email);
		
		email = new JTextField();
		panel_1.add(email);
		email.setColumns(10);
		
		JLabel Phone = new JLabel("Telefonnummer");
		Phone.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(Phone);
		
		phone = new JTextField();
		panel_1.add(phone);
		phone.setColumns(10);
		
		JLabel Home = new JLabel("Wohnort");
		Home.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(Home);
		
		home = new JTextField();
		panel_1.add(home);
		home.setColumns(10);
		
		JLabel Birthdate = new JLabel("Geburtstag");
		Birthdate.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(Birthdate);
		
		birthdate = new JTextField();
		panel_1.add(birthdate);
		birthdate.setColumns(10);
		
		JLabel Vnumber = new JLabel("Vertragsnummer");
		Vnumber.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(Vnumber);
		
		vnumber = new JTextField();
		panel_1.add(vnumber);
		vnumber.setColumns(10);
		
		JLabel Mnumber = new JLabel("Mitarbeiternummer");
		Mnumber.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(Mnumber);
		
		mnumber = new JTextField();
		panel_1.add(mnumber);
		mnumber.setColumns(10);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		
		JButton cancel = new JButton("Abbrechen");
		panel.add(cancel);
		
		JLabel txt = new JLabel("Mitarbeiter erstellen");
		panel.add(txt);
		
		JButton next = new JButton("Fertig");
		panel.add(next);
	}

}
