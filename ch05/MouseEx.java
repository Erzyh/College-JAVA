package ch05;

import javax.swing.*;

import java.awt.event.*;

public class MouseEx extends JFrame implements MouseListener{
	MouseEx(){
		this.setTitle("Mouse Test");
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.addMouseListener(this);
	}
	public static void main(String[] args) {
		new MouseEx();
	}
	public void mouseClicked(MouseEvent e) {
		System.out.println("Mouse Clicked at "+e.getX()+", "+e.getY());
	}
	public void mousePressed(MouseEvent e) {
		System.out.println("Mouse Pressed");
	}
	public void mouseReleased(MouseEvent e) {
		System.out.println("Mouse Released");
	}
	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse Entered");
	}
	public void mouseExited(MouseEvent e) {
		System.out.println("Mouse Exited");
	}
	
	
}
