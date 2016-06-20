package experiments;

public class StringThread implements Runnable{
	
	private String[] names = {"Georgie","Liam","Chris","Lil","Brendan","Baka","AJ","Ebony"};
		
	public void run(){
		for(int i = 0;i < 10;i++){
			System.out.println("Running Thread " + Thread.currentThread().getName());
			System.out.println("Name is : " + names[(int)((Math.random() * names.length))]);
			try{
				Thread.sleep(1000);
				} catch(InterruptedException ie){
					ie.printStackTrace();
			}
		}
	}
}
