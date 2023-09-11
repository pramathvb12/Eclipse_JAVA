package gui;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class MyFrame extends JFrame implements KeyListener {
	JLabel label;
	ImageIcon image;
	MyFrame(){
		
		this.pack();
		this.setSize(500,400);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.addKeyListener(this);
		image =new ImageIcon("download");
		label = new JLabel();
		label.setBounds(0, 0,100, 100);
	
		this.getContentPane().setBackground(Color.black);
		label.setIcon(image);
		//label.setBackground(Color.cyan);
		//label.setText("thor (..:..)");
		label.setVisible(true);
		label.setOpaque(true);
		this.add(label);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		switch(e.getKeyChar()) {
		case 'a' : label.setLocation(label.getX()-1, label.getY());
		break;
		case 'w' : label.setLocation(label.getX(), label.getY()-1);
		break;
		case 'd' : label.setLocation(label.getX()+1, label.getY());
		break;
		case 's' : label.setLocation(label.getX(), label.getY()+1);
		break;
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		case 37: label.setLocation(label.getX()-10, label.getY());
		break;
		case 38 : label.setLocation(label.getX(), label.getY()-10);
		break;
		case 39 : label.setLocation(label.getX()+10, label.getY());
		break;
		case 40 : label.setLocation(label.getX(), label.getY()+10);
		break;
		}	
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//System.out.println("u relaseed char "+e.getKeyChar());
		System.out.println("u relaseed char "+e.getKeyCode());
	}

	
}