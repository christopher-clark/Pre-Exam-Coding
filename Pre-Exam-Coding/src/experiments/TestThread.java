package experiments;

public class TestThread {

	public static void main(String[] args) {
		
		CountThread threadjob1 = new CountThread();
		Thread t1 = new Thread(threadjob1, "Count_Thread");
		StringThread threadjob2 = new StringThread();
		Thread t2 = new Thread(threadjob2,"String_Thread");
		CountThread threadjob3 = new CountThread();
		Thread t3 = new Thread(threadjob3,"RandomName_Thread");
		t3.start();
		t1.start();
		t2.start();
	}

}
