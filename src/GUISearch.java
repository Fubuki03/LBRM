import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.desktop.UserSessionEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class GUISearch{
	private JFrame frame;
	private List<Angestellter> Ergebniss;
	
	public GUISearch(List<Angestellter> Ergebniss){
	this.Ergebniss = Ergebniss;
		initialize();
		
	}

	private void initialize() {
		
    	Actions Actions = new Actions();
    	
    	DefaultTableModel model = new DefaultTableModel(); 
		JTable Users = new JTable(model); 

		model.addColumn("ID"); 
		model.addColumn("Name");
		model.addColumn("Vorname");
		model.addColumn("E-Mail"); 
		
		TableColumn column = Users.getColumnModel().getColumn(3);
		column.setPreferredWidth(250);
		
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
	    add.addActionListener(new ActionListener(){  
	        public void actionPerformed(ActionEvent e){  
	        frame.setVisible(false);
	        GUIadd G2 = new GUIadd();	
	        }  
	        });  
		
		JButton edit = new JButton("Bearbeiten");
		panel.add(edit);
	    edit.addActionListener(new ActionListener(){  
	        public void actionPerformed(ActionEvent e){  
	        
	        int column = 0;
		    int row = Users.getSelectedRow();
		    String value = Users.getModel().getValueAt(row, column).toString();
		    
		    Angestellter A = Actions.GetUserbyID(Integer.parseInt(value));
		    
	        System.out.println(A.getClass().getName());
		    if ( "Externer" == A.getClass().getName()) {
		    	DetailsX G9 = new DetailsX(A);
		    	frame.dispose();
		    }else {
		    	DetailsM G10 = new DetailsM(A);
		    	frame.dispose();
		    }	
	        }  
	        });

		JButton delete = new JButton("Löschen");
		panel.add(delete);
	    delete.addActionListener(new ActionListener(){  
	        public void actionPerformed(ActionEvent e){  
	        frame.dispose();
	        int column = 0;
	        int row = Users.getSelectedRow();
	        String value = Users.getModel().getValueAt(row, column).toString();
	        
	        GUIremove G3 = new GUIremove(Integer.parseInt(value));      
	        }  
	        });  
		 
		
		JButton cancel = new JButton("Abbrechen");
		panel.add(cancel);
	    cancel.addActionListener(new ActionListener(){  
	        public void actionPerformed(ActionEvent e){  
	        frame.dispose(); 
	        GUI G1 = new GUI();
	        }  
	        });
	    
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);

		model.addRow(new Object[]{"ID", "Name", "Vorname", "E-Mail"});
		for (Angestellter A : Ergebniss){
			model.addRow(new Object[]{String.valueOf(A.getID()), A.getName(),  A.getVorname(), A.getEMail()});
		} 
		
		
		
		Actions.getAllUsers().size();
		
		panel_1.add(Users, BorderLayout.CENTER);
		

		
		frame.setVisible(true);
 }
}