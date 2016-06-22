package experiments;

public class RandomNumThread implements Runnable{
	public int total;
	
	public void run(){
		synchronized(this) {
			// Create a Random Number and display. If Number > 50 send a notify signal
			for(int i=0;i<10;i++){
				total = (int) (Math.random() * 100);
				System.out.println(" I = " + total );
				if(total > 50){
					System.out.println("Sending Notify()");
					notify();
					break;
				}
			}
		}
	}

}
