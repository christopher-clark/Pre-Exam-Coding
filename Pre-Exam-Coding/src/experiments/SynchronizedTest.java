package experiments;

public class SynchronizedTest extends Thread{

	private static StringBuffer sb;
		
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("A");
		new SynchronizedTest(sb).start(); 
		new SynchronizedTest(sb).start();
		new SynchronizedTest(sb).start();
		
	}
	public  void run(){
		synchronized(sb) { // #1
			for(int i = 1;i<=100;++i) 
				System.out.print(sb);
				
			System.out.println();
			char temp = sb.charAt(0);
			++temp; // Increment the letter in StringBuffer:
			sb.setCharAt(0, temp);
		}
	}
	public SynchronizedTest(){
		super();
	}
	public SynchronizedTest(StringBuffer sb){
		this.sb = sb;
		}
}
