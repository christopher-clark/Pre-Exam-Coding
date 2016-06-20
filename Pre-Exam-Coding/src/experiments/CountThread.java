package experiments;

public class CountThread implements Runnable{
	private int x;
	public void run(){
		for(int i = 0;i < 10;i++){
			System.out.println("I = " + i);
			System.out.println("Running Thread " + Thread.currentThread().getName());
			try{
			Thread.sleep(1000);
			} catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
	}
}
