import java.awt.*;
import java.util.Scanner;

import javax.swing.JFrame;


public class graph extends JFrame{
	
	int Width = 800;
	int Height = 600;
	boolean working = true;
	
	public graph(){
		initialize();
	}

	public void initialize() {
		setSize(Width, Height);
		setBackground(Color.WHITE);
		repaint();
		
	}
	
	public void paint(Graphics window){
		
		while(working == true){
		String str1 = "bar";
		String str2 = "foo";
		String str3 = "";
		str3 += str1;
		str3 += str2;
		System.out.println(str3);
				
		int ratio = 10;
		window.setColor(Color.BLACK);
		drawnew(window, ratio);
		
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
	public void drawnew(Graphics window, int ratio){
		window.setColor(Color.DARK_GRAY);
		for (int i = 0; i < Width; i+= ratio) {
			window.drawLine(i, 0, i, Height);
			
			
		}

		for(int i = 0; i< Height; i+= ratio) {
			window.drawLine(0, i, Width, i);
		}
		window.setColor(Color.BLACK);
		window.drawLine(Width/2, 0, Width/2, Height);
		window.drawLine(0, Height/2, Width, Height/2);
	}	
}
