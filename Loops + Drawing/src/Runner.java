import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Runner extends JPanel{
	
	// Practice using Loops, random #s and 
	// methods
	public void paint(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(2));
   
		
		 int var = 0;
		 for (; var < 500; var+=20) {
			 
			 g2.drawLine(20, 545-var, 20+var, 10);
			 g2.drawLine(20, 10+var, 20+var, 545);
		 }
		 
		 var = 0;
		 
		 while (var < 500) {
			 
			 g2.drawLine(765, 545-var, 765-var, 10);
			 g2.drawLine(765, 20+var, 765-var, 545);
			 var+=20;
		 }
			
	
	}
	
	

	
	public static void main(String[] arg) {
		Runner m = new Runner();
	}
	
	public Runner() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800,600);
		f.add(this);
		f.setVisible(true);
		
	}
}
