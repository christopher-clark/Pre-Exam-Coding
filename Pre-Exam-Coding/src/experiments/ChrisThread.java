package experiments;

public class ChrisThread implements Runnable{
	private int x;
	public void run(){
		for(int i = 0;i < 100;i++){
			System.out.println("My name is Chris");
			System.out.println("Running Thread " + Thread.currentThread().getName());
			try{
			Thread.sleep(10);
			} catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
	}
}
