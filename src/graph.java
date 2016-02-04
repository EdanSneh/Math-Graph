import java.awt.*;
import javax.swing.JFrame;


public class graph extends JFrame{
	
	int Width = 800;
	int Height = 600;
	
	public graph(){
		initialize();
	}

	public void initialize() {
		setSize(Width, Height);
		setBackground(Color.WHITE);
		repaint();
		
	}
	
	public void paint(Graphics window){
		int ratio = 10;
		window.setColor(Color.BLACK);
		drawnew(window, ratio);
		while(true){
			
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
