import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

public class GUI{
	
	private JFrame frame;
	
	public GUI(){
		
		initialize();
		
	}

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
	    add.addActionListener(new ActionListener(){  
	        public void actionPerformed(ActionEvent e){  
	        frame.setVisible(false);
	        GUIadd G2 = new GUIadd();	
	        }  
	        });  
		
		JButton details = new JButton("Details");
		panel.add(details);
	    details.addActionListener(new ActionListener(){  
	        public void actionPerformed(ActionEvent e){  
	        	

	        	
	        	
	        	
	        }  
	        }); 
		
		JButton delete = new JButton("L�schen");
		panel.add(delete);
	    delete.addActionListener(new ActionListener(){  
	        public void actionPerformed(ActionEvent e){  
	        frame.dispose();    
	        GUIremove G3 = new GUIremove();      
	        }  
	        });  
		
		JTextField searchtxt = new JTextField();
		searchtxt.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(searchtxt);
		searchtxt.setColumns(10);
		
		JButton search = new JButton("Suchen");
		panel.add(search);
	    search.addActionListener(new ActionListener(){  
	        public void actionPerformed(ActionEvent e){  
	        	
	        	
	        	
	        	
	        	
	        	
	        }  
	        });  
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		
		JSplitPane List = new JSplitPane();
		List.setOrientation(JSplitPane.VERTICAL_SPLIT);
		panel_1.add(List);
		
		
//		JTable Users = new JTable(Actions.getAllUsers());
		JTable Users = new JTable();
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
		
		frame.setVisible(true);
		
	}
}