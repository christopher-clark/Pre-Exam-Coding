package experiments;

public class NotifyThread implements Runnable{

	static char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	char ch;
		public void run(){
			while(true){
				synchronized(this){
					ch = alphabet[(int) (Math.random() * alphabet.length)];
					System.out.println(ch);
					if(ch == 'x' || ch == 's' || ch == 'l' || ch == 'a'){
						notify();
						break;
					}	
				}
			}
		}
		public char getCh(){
			return ch;
		}
}
