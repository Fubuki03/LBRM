
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GUIremove extends JFrame{
	
	public JFrame frame;
	
	public GUIremove(){
		
		initialize();
		
	}

	public void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel Titel = new JLabel("Benutzer Verwaltung LBRM");
		Titel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(Titel, BorderLayout.NORTH);
		
		JLabel Abfrage = new JLabel("Wollen Sie den Benutzer (xy) wirklich löschen?\n\n");
		Abfrage.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(Abfrage, BorderLayout.CENTER);
		
		JSplitPane splitPane = new JSplitPane();
		frame.getContentPane().add(splitPane, BorderLayout.SOUTH);
		
		JButton delete = new JButton("Benutzer l�schen");
		splitPane.setRightComponent(delete);
	    delete.addActionListener(new ActionListener(){  
	        public void actionPerformed(ActionEvent e){
	        	
	        	
	        	
	        	
	        }  
	        });  
		
		JButton cancel = new JButton("Abbrechen");
		splitPane.setLeftComponent(cancel);
	    cancel.addActionListener(new ActionListener(){  
	        public void actionPerformed(ActionEvent e){  


	        	
	        	
	        	
	        }  
	        });  
		
	}
}
