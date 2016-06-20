package experiments;

public class ExerciseRunnable implements Runnable{

	public void run(){
		for(int i = 1; i <= 100; i++){
			System.out.println("Count i = " + i);
			if(i%10 == 0)
				System.out.println("\tString output");
			try{
				Thread.sleep(100);
			} catch (InterruptedException ie){
				ie.printStackTrace();
			}
		}
	}
}
