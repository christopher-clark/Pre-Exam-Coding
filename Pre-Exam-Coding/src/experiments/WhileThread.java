package experiments;

public class WhileThread implements Runnable{
	
	private int rand;
	
	public int getRand() {
		return rand;
	}

	public void run(){
		while(true){
			synchronized(this){
				rand = (int) (Math.random() * 100);
				System.out.println("rand = " + rand);
				if(rand > 90){
					notify();
					break;
				}
			}
		}
	}
	public static void main(String[] args){
		WhileThread wt = new WhileThread();
		Thread t1 = new Thread(wt,"WhileThread");
		t1.start();
		synchronized(wt){
			System.out.println("\tWaiting for a Number > 50");
			try{
			wt.wait();
			} catch(InterruptedException ie){
				ie.printStackTrace();
			}
			wt.getRand();
		}
		
	}

}
