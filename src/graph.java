import java.awt.*;
import java.util.Scanner;

import javax.swing.JFrame;


public class graph extends JFrame{
	
	int Width = 800;
	int Height = 600;
	
	
	public graph(){
		initialize();
	}
	
	public graph(String x){
		super(x);
		initialize();
	}

	public void initialize() {
		setSize(Width, Height);
		setBackground(Color.WHITE);
		//repaint();
		
	}
	
	
}
