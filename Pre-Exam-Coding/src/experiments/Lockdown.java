package experiments;

public class Lockdown implements Runnable{
	public static void main(String[] args){
		new Thread(new Lockdown()).start();
		new Thread(new Lockdown()).start();
	}
	public void run(){
		locked(Thread.currentThread().getId());
	}
	synchronized private void locked(long id){
		System.out.println(id + "a");
		System.out.println(id + "b");
	}

}
