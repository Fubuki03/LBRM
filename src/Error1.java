import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextPane;


public class Error1{
	
	private JFrame frame;
	
	public Error1(){
		
		initialize();
		
	}

	private void initialize() {
		
		frame = new JFrame();
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
		    next.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  	
				frame.dispose();
		    	} 
		    	});  
			frame.getContentPane().add(next, BorderLayout.SOUTH);
	    frame.setVisible(true);
  }
}
