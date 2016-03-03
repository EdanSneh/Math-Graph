package Core;




public class Updategraph implements Runnable{
	/**
	 * Will execute when thread is created and b4 it is started
	 */
	public Updategraph(){
		System.out.println("Creating new thread");
		
	}
	
	public void run(){
		try{
			while(true){
				Panel.Update();
				Thread.sleep(32);
			}
		}
		catch(Exception e){System.out.println("Updater Error: ");e.printStackTrace();
			
		}
	}
}
