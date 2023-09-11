import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;


public class graphic extends JFrame {
	panel p;
	
		graphic(){
			p = new panel();
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.add(p);
			this.pack();
			this.setSize(500,500);
			this.setVisible(true);
			this.setLocationRelativeTo(null);
		}
		
}
