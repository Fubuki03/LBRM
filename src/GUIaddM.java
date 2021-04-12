
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GUIaddM{
	
	private JFrame frame;
	
	public GUIaddM(){
		
		initialize();
		
	}

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
		
		JTextField username = new JTextField();
		panel_1.add(username);
		username.setColumns(10);
		
		JLabel Password = new JLabel("Passwort");
		Password.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(Password);
		
		JTextField password = new JTextField();
		panel_1.add(password);
		password.setColumns(10);
		
		JLabel Workgroup = new JLabel("Arbeitsgruppe");
		Workgroup.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(Workgroup);
		
		JComboBox workgroup = new JComboBox(Actions.getGroups());
		panel_1.add(workgroup);
		
		JLabel Name = new JLabel("Name");
		Name.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(Name);
		
		JTextField name = new JTextField();
		panel_1.add(name);
		name.setColumns(10);
		
		JLabel Vname = new JLabel("Vorname");
		Vname.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(Vname);
		
		JTextField vname = new JTextField();
		panel_1.add(vname);
		vname.setColumns(10);
		
		JLabel Email = new JLabel("E-Mail");
		Email.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(Email);
		
		JTextField email = new JTextField();
		panel_1.add(email);
		email.setColumns(10);
		
		JLabel Phone = new JLabel("Telefonnummer");
		Phone.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(Phone);
		
		JTextField phone = new JTextField();
		panel_1.add(phone);
		phone.setColumns(10);
		
		JLabel Home = new JLabel("Wohnort");
		Home.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(Home);
		
		JTextField home = new JTextField();
		panel_1.add(home);
		home.setColumns(10);
		
		JLabel Birthdate = new JLabel("Geburtstag");
		Birthdate.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(Birthdate);
		
		JTextField birthdate = new JTextField();
		panel_1.add(birthdate);
		birthdate.setColumns(10);
		
		JLabel Vnumber = new JLabel("Vertragsnummer");
		Vnumber.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(Vnumber);
		
		JTextField vnumber = new JTextField();
		panel_1.add(vnumber);
		vnumber.setColumns(10);
		
		JLabel Mnumber = new JLabel("Mitarbeiternummer");
		Mnumber.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(Mnumber);
		
		JTextField mnumber = new JTextField();
		panel_1.add(mnumber);
		mnumber.setColumns(10);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		
		JButton cancel = new JButton("Abbrechen");
		panel.add(cancel);
	    cancel.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
			frame.dispose();
			GUI G1 = new GUI();		
	    	}  
	    	});  
		
		JLabel txt = new JLabel("Mitarbeiter erstellen");
		panel.add(txt);
		
		JButton next = new JButton("Fertig");
		panel.add(next);
	    next.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent e){  
	        Mitarbeiter newUser = new Mitarbeiter(null, null, null, null, null, null, null, null, null, 0, 0, null);
		    newUser.setArbeitsgruppe(workgroup.getSelectedItem());
		    newUser.setEMail(email.getText());
		    newUser.setExternal(false);
		    newUser.setGeburtsjahr(birthdate.getText());
		    newUser.setName(name.getText());
		    newUser.setTelefon(phone.getText());
		    newUser.setVorname(vname.getText());
		    newUser.setWohnort(home.getText());
		    newUser.setVertragsnr(Integer.parseInt(vnumber.getText()));
		    newUser.setMitarbnr(Integer.parseInt(mnumber.getText()));
	       
			frame.dispose();
			GUI G1 = new GUI();			
	        }  
	        });  
	    
	    frame.setVisible(true);
	}
}