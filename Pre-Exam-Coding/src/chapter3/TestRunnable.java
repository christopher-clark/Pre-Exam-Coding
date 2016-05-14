package chapter3;

public class TestRunnable {
	public static void main(String[] args){
		T_runnable threadObject1 = new T_runnable();
		T_runnable threadObject2 = new T_runnable();
		T_runnable threadObject3 = new T_runnable();

		Thread t1 = new Thread(threadObject1);
		Thread t2 = new Thread(threadObject2);
		Thread t3 = new Thread(threadObject3);
		
		t1.setName("threadObject1");
		t2.setName("threadObject2");
		t3.setName("threadObject3");
		
		t3.start();
		t1.start();
		t2.start();
		
	}
}
