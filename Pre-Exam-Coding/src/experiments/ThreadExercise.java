package experiments;

public class ThreadExercise {

	/*  create a simple counting thread. It will count to 100, pausing
	one second between each number. Also, in keeping with the counting theme, it will
	output a string every ten numbers. 													*/
	
	public static void main(String[] args) {
		// Create a Thread which will use the Runnable implementation which will count to 100
		// and output a String after every 10 

		ExerciseRunnable exr = new ExerciseRunnable();
		Thread t1 = new Thread(exr,"String");
		t1.start();
	}

}
