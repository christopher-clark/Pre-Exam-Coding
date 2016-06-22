package experiments;

class waitingThread {
	public static void main(String[] args){
		
		
		RandomNumThread rn = new RandomNumThread();
		Thread t1 = new Thread(rn,"Number Generator");
		t1.start();
			
		synchronized(rn){
			try {
				 System.out.println("Waiting for rn to Get a number > 50 ...");
				 rn.wait();
				 System.out.println("Random Number > 50 = " + rn.total + " getID = " + Thread.currentThread().getId());
			} catch (InterruptedException ie) {
					ie.printStackTrace();
			}
		}
	}	
		
}


