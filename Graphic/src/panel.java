import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class panel extends JPanel implements ActionListener{
	final int panel_W = 500;
	final int panel_H = 500;
	Image en;
	Image backg;
	Timer timer;
	int xvel=5;
	int yvel=3;
	int x=0;
	int y=0;
	
	panel(){
		
		
		this.setPreferredSize(new Dimension(panel_W,panel_H));
		this.setBackground(Color.black);
		en=new ImageIcon("en.png.png").getImage();
		backg = new ImageIcon("bg.jpg").getImage();
		timer = new Timer(10,this);
		timer.start();
		
	}
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2D = (Graphics2D) g;
		g2D.drawImage(backg, 0,0, null);
		g2D.drawImage(en, x, y, null);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(x>=panel_W-en.getWidth(null) || x<0) {
			xvel=xvel*-1;
			
		}
		x=x+xvel;
		repaint();
		if(y>=panel_H-en.getWidth(null) || y<0) {
			yvel=yvel*-1;
			
		}
		y=y+yvel;
		repaint();
		
	}

}
