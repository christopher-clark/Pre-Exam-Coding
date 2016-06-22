package experiments;

public class LessThanThread implements Runnable{

	private int rnd;
	
	public int getRnd() {
		return rnd;
	}
	public static void main(String[] args) {
		// Create Threadjob
		LessThanThread lt = new LessThanThread();
				
		// Create Thread
		Thread t1 = new Thread(lt);
		t1.start();
		
		System.out.println("Waiting for value less than 10");
		synchronized(lt){
			try{
				lt.wait();
				System.out.println("Value less than 10 is: " + lt.getRnd());
			} catch (InterruptedException ie){
				ie.printStackTrace();
			}
		}

	}	
	public void run(){
		synchronized (this){
			while(true){
				rnd = (int) (Math.random() * 100);
				System.out.println("Rnd = " + rnd);
				if(rnd < 10){
					notify();
					break;
				}
			}
		}
		
	}

}
