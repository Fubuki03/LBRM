import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GUIaddX{
	
	private JFrame frame;
	
	public GUIaddX(){
		
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
		
		JLabel Birthdate = new JLabel("Geburtjahr");
		Birthdate.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(Birthdate);
		
		JTextField birthdate = new JTextField();
		panel_1.add(birthdate);
		birthdate.setColumns(10);
		
		JLabel ID = new JLabel("Benutzer ID");
		ID.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(ID);
		
		JTextField id = new JTextField(6);
		panel_1.add(id);
		id.setColumns(10);
		
		JLabel Workgroup = new JLabel("Arbeitsgruppe");
		Workgroup.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(Workgroup);
		
		JComboBox<Arbeitsgruppe> workgroup = new JComboBox<Arbeitsgruppe>(new Vector(Actions.getGroups()));
		panel_1.add(workgroup);
		
		JLabel Contractor = new JLabel("Anstellungsfirma");
		Contractor.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(Contractor);
		
		JTextField contractor = new JTextField();
		panel_1.add(contractor);
		contractor.setColumns(10);
		
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
		JLabel txt = new JLabel("Externer Mitarbeiter erstellen");
		panel.add(txt);
		
		JButton next = new JButton("Fertig");
		panel.add(next);
	    next.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
		    Externer newUser = new Externer(null, null, null, null, null, 0, null, null, null, null);
			newUser.setName(name.getText());
			newUser.setVorname(vname.getText());
			newUser.setEMail(email.getText());
			newUser.setTelefon(phone.getText());
			newUser.setWohnort(home.getText());
		    newUser.setID(Integer.parseInt(id.getText()));
			newUser.setGeburtsjahr(birthdate.getText());
			newUser.setArbeitsgruppe((Arbeitsgruppe) workgroup.getSelectedItem());
			newUser.setExternal(false);
			newUser.setContractor(contractor.getText());
			boolean ret = Actions.AddAngestellter(newUser);
			if (ret == false) {
			Error1 Error = new Error1();
			}
	    	frame.dispose();
			GUI G1 = new GUI();	
	    	}  
	    	});  
	    
	    frame.setVisible(true);
	}
}