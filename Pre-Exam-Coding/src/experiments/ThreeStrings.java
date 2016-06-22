package experiments;

public class ThreeStrings {

	public static void main(String[] args) {
		// Create Threadjob
		StringFill sf = new StringFill();
		Thread t1 = new Thread(sf);
		Thread t2 = new Thread(sf);
		Thread t3 = new Thread(sf);
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
