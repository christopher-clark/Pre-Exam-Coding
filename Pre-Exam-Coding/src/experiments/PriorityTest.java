package experiments;

public class PriorityTest implements Runnable{

	public static void main(String[] args) {
		// Create a Runnable
		PriorityTest pt = new PriorityTest();
		Thread t1 = new Thread(pt,"Priority10");
		t1.setPriority(10);
		Thread t2 = new Thread(pt,"Priority1");
		t2.setPriority(1);
		Thread t3 = new Thread(pt,"Priority5");
		t1.setPriority(5);
		
		t2.start();
		t3.start();
		t1.start();
		System.out.println("\t Thread before join is " + Thread.currentThread().getName());
		try{
			t3.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
	public void run(){
		for(int i = 0; i < 50;i++){
			System.out.println("Current I = " + i + " Thread is " + Thread.currentThread().getName());
		}
	}

}
