package experiments;

public class Starter implements Runnable {
	 void go(String name) {
		 System.out.println(name);
	 }
	 public static void main(String[] args) {
		 System.out.print(Thread.currentThread().getName() + " ");
	 // insert code here
		 //new Thread(new Starter()).run();
		new Thread(new Starter()).start();
		 }
 	public void run() { 
 		go(Thread.currentThread().getName()); 
	}
 }