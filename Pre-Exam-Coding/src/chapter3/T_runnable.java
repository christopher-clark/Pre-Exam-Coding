package chapter3;

public class T_runnable implements Runnable{
	public void run(){
		for(int i = 0;i < 1500;i++)
			System.out.println("Running " + i + " " +Thread.currentThread().getName());
	}
	
}
