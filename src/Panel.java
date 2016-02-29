import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;



public class Panel extends JPanel{
	boolean working = true;
	static int Width = 800;
	static int Height = 600;
	static double ratio = Height/20;
	
	public static void main(String[] args) throws InterruptedException {
		JFrame g = new JFrame("Graphing Calculator");
		g.setSize(Width, Height);
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//g.setUndecorated(true);
		//g.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
		
		//refresh rate
		
		Panel graph = new Panel();
		g.add(graph);
		g.setVisible(true);
		
		while(true){
			Width = g.getWidth();
			Height = g.getHeight();
			if(Width<Height){
				ratio = (double)(Width)/20.0;
			}
			else{
				ratio = (double)(Height)/20.0;
			}
			g.repaint();
			//10 milliseconds
		//	Thread.sleep(10);
			//System.out.println(g.getWidth());
		}
		

	}

	
public void paint(Graphics window){
	drawnew(window);	
	while(working == true){
		int ratio = 10;
		window.setColor(Color.BLACK);
		
			String sequation = "";
			
			Scanner equation = new Scanner(System.in);
			System.out.println("What is your equation?");
			boolean empty = true;
			while(empty){
				sequation = equation.nextLine();
				
				empty = sequation.equals(""); 
				
			}
			System.out.println(sequation);
			
		working = false;	
		}
		
	
	}
	public void drawnew(Graphics window){
		window.setColor(Color.DARK_GRAY);
		for (double i = 0; i < Width; i+= ratio) {
			window.drawLine((int)i, 0, (int)i, Height);
			
		}

		for(double i = 0; i< Height; i+= ratio) {
			window.drawLine(0, (int)i, Width, (int)i);
		}
		window.setColor(Color.BLACK);
		if(Width<Height){
			
			window.drawLine(Width/2, 0, Width/2, Height);
			window.drawLine(0, Width/2, Width, Width/2);
		}
		else{
			window.drawLine(Height/2, 0, Height/2, Height);
			window.drawLine(0, Height/2, Width, Height/2);
		}
	}	
}
