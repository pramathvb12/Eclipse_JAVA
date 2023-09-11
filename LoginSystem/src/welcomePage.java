import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class welcomePage {
	JFrame frame = new JFrame();
	JLabel wellabel = new JLabel("Hi !! ");
	welcomePage(String u){
		
		wellabel.setBounds(0,0,250,75);
		wellabel.setFont(new Font("BOLD",Font.ITALIC,30));
		wellabel.setText("Hello "+u);
		frame.add(wellabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
