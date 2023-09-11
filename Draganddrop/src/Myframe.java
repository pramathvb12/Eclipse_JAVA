import javax.swing.JFrame;

public class Myframe extends JFrame {
	Dragpanel dpanel = new Dragpanel();
	Myframe(){
		this.add(dpanel);
		this.setTitle("Drog and drop" );
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
