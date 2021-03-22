import java.awt.BorderLayout;
import java.awt.FlowLayout;
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
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GUIadd extends JFrame implements ActionListener{
	
	private JFrame frame;
	
	public GUIadd(){
		
		initialize();
		
	}

	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel Titel = new JLabel("Benutzer Verwaltung LBRM");
		Titel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(Titel, BorderLayout.NORTH);
		
		JLabel Abfrage = new JLabel("Wollen Sie einen Externen Mitarbeiter oder einen Mitarbeiter hinzuf\u00FCgen?");
		Abfrage.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(Abfrage, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton Exit = new JButton("Abbrechen");
		panel.add(Exit);
		Exit.addActionListener(this);
		
		JRadioButton Extern = new JRadioButton("Externer Mitarbeiter");
		Extern.setSelected(true);
		panel.add(Extern);
		
		JRadioButton Mitarbeiter = new JRadioButton("Mitarbeiter");
		panel.add(Mitarbeiter);
		
		JButton Next = new JButton("Weiter");
		panel.add(Next);
		Next.addActionListener(this);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == panel.Next) {
			model.addElement(t1.getText());
		}
		
	}

	
}
