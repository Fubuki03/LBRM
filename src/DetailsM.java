
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class DetailsM{
	
	private JFrame frame;
	private Angestellter oldUser;
	
	public DetailsM(Angestellter oldUser){
		this.oldUser = oldUser;
		initialize();
		
	}

	private void initialize() {

		Actions Actions = new Actions();
		
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
		
		JTextField username = new JTextField(((Mitarbeiter)oldUser).getUsername());
		panel_1.add(username);
		username.setColumns(10);
		
		
		JLabel Workgroup = new JLabel("Arbeitsgruppe");
		Workgroup.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(Workgroup);
		
		JComboBox workgroup = new JComboBox(new Vector(Actions.getGroups()));
		panel_1.add(workgroup);
		
		JLabel Name = new JLabel("Name");
		Name.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(Name);
		
		JTextField name = new JTextField(((Mitarbeiter)oldUser).getName());
		panel_1.add(name);
		name.setColumns(10);
		
		JLabel Vname = new JLabel("Vorname");
		Vname.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(Vname);
		
		JTextField vname = new JTextField(((Mitarbeiter)oldUser).getVorname());
		panel_1.add(vname);
		vname.setColumns(10);
		
		JLabel Email = new JLabel("E-Mail");
		Email.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(Email);
		
		JTextField email = new JTextField(((Mitarbeiter)oldUser).getEMail());
		panel_1.add(email);
		email.setColumns(10);
		
		JLabel Phone = new JLabel("Telefonnummer");
		Phone.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(Phone);
		
		JTextField phone = new JTextField(((Mitarbeiter)oldUser).getTelefon());
		panel_1.add(phone);
		phone.setColumns(10);
		
		JLabel Home = new JLabel("Wohnort");
		Home.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(Home);
		
		JTextField home = new JTextField(((Mitarbeiter)oldUser).getWohnort());
		panel_1.add(home);
		home.setColumns(10);
		
		JLabel Birthdate = new JLabel("Geburtstag");
		Birthdate.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(Birthdate);
		
		JTextField birthdate = new JTextField(((Mitarbeiter)oldUser).getGeburtsjahr());
		panel_1.add(birthdate);
		birthdate.setColumns(10);
		
		JLabel Vnumber = new JLabel("Vertragsnummer");
		Vnumber.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(Vnumber);
		
		JTextField vnumber = new JTextField(String.valueOf(((Mitarbeiter)oldUser).getVertragsnr()));
		System.out.println(((Mitarbeiter)oldUser).getVertragsnr()	);
		panel_1.add(vnumber);
		vnumber.setColumns(10);
		
		JLabel ID = new JLabel("ID");
		ID.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(ID);
		
		JTextField id = new JTextField(String.valueOf(((Mitarbeiter)oldUser).getID()));
		panel_1.add(id);
		id.setColumns(1);
		
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
		
		JLabel txt = new JLabel("Mitarbeiter bearbeitungen speichern");
		panel.add(txt);
		
		JButton next = new JButton("Speichern");
		panel.add(next);
	    next.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent e){  
	        Mitarbeiter updatedUser = new Mitarbeiter(null, null, null, null, null, 0, null, null, null, null, null, 0);
	        updatedUser.setName(name.getText());
	        updatedUser.setVorname(vname.getText());
	        updatedUser.setEMail(email.getText());
	        updatedUser.setTelefon(phone.getText());
	        updatedUser.setWohnort(home.getText());
	        updatedUser.setID(Integer.parseInt(id.getText()));
	        updatedUser.setGeburtsjahr(birthdate.getText());
	        updatedUser.setArbeitsgruppe((Arbeitsgruppe)workgroup.getSelectedItem());
	        updatedUser.setExternal(false);
		    updatedUser.setUsername(username.getText());
		    updatedUser.setVertragsnr(Integer.parseInt(vnumber.getText()));
		    Actions.UpdateUser(oldUser, updatedUser);
			frame.dispose();
			GUI G1 = new GUI();
			}  
	        });  
	    
	    frame.setVisible(true);
	}
}