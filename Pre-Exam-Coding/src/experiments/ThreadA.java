package experiments;

class ThreadA {
	 public static void main(String [] args) {
		 ThreadB b = new ThreadB();
		 b.start();
		
		 synchronized(b) {
			 try {
				 System.out.println("Waiting Random num > 50 ...");
				 b.wait();
				 System.out.println("Random num > 50: " + b.total);
				 } catch (InterruptedException e) {
					 e.printStackTrace();
			 }
		 }
	}
}
