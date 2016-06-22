package experiments;

public class StringFill implements Runnable{
	
	StringBuffer sb = new StringBuffer("A");
	
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
}
