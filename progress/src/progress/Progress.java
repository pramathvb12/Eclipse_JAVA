package progress;
import java.awt.*;
import javax.swing.*;
public class Progress {
	JFrame frame = new JFrame();
	JProgressBar demo = new JProgressBar();
	Progress(){
		demo.setValue(10);
		demo.setBounds(0, 0, 250, 90);
		demo.setStringPainted(true);
		demo.setForeground(Color.YELLOW);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(450, 450);
		frame.setLayout(null);
		frame.add(demo);
		fill();
	}
	public void fill() {
		int counter = 100;
		while(counter>=0) {
			demo.setValue(counter);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter-=1;
		}
		demo.setString("finished :)");
		
	}
}
