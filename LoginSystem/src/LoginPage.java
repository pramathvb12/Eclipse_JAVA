import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener {
	JFrame frame = new JFrame();
	JButton logbutton = new JButton("Login");
	JButton resetbutton = new JButton("Reset");
	JTextField userId = new JTextField();
	JPasswordField userpassword = new JPasswordField();
	JLabel usIdlabel = new JLabel("UserId: ");
	JLabel uspasslabel = new JLabel("Password: ");
	JLabel usmessagelabel = new JLabel("Login System !!!");
	HashMap<String,String> logininf = new HashMap<String,String>();
	
	LoginPage(HashMap<String,String> logininfoori){
		logininf= logininfoori;
		
		usIdlabel.setBounds(50,100,75,50);
		uspasslabel.setBounds(50,150,75,50);
		usmessagelabel.setBounds(200,20,200,50);
		userId.setBounds(125,100,200,35);
		userpassword.setBounds(125,200,200,35);
		logbutton.setBounds(100,250,100,50);
		logbutton.setFocusable(false);
		logbutton.addActionListener(this);
		resetbutton.setBounds(250,250,100,50);
		resetbutton.setFocusable(false);
		resetbutton.addActionListener(this);
		
		
		frame.add(usIdlabel);
		frame.add(uspasslabel);
		frame.add(usmessagelabel);
		frame.add(userId);
		frame.add(userpassword);
		frame.add(logbutton);
		frame.add(resetbutton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,600);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==resetbutton) {
			userId.setText("");
			 userpassword.setText("");
		}
		if(e.getSource()==logbutton) {
			String u = userId.getText();
			String p = String.valueOf(userpassword.getPassword());
			if(logininf.containsKey(u)) {
				if(logininf.get(u).equals(p)) {
					usmessagelabel.setForeground(Color.blue);
					usmessagelabel.setText("Successfully Loged In !!!");
					frame.dispose();
					welcomePage welcome = new welcomePage(u);
				}else {
					usmessagelabel.setForeground(Color.red);
					usmessagelabel.setText("Wrong password");
				
				}
			}else {
				usmessagelabel.setForeground(Color.red);
				usmessagelabel.setText("Invalid UserId !!!");
			}
		}
		
	}
}
