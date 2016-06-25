package experiments;

public class NotifyTest {

	public static void main(String[] args) {
		NotifyThread not = new NotifyThread();
		Thread th = new Thread(not,"Notify Thread");
		th.start();
		
		synchronized(not){
			try{
				System.out.println("Waiting for ch");
				not.wait();
				System.out.println("Got ch " + not.getCh());
			} catch (InterruptedException ie){
				ie.printStackTrace();
			}
		
		}
	}
}
