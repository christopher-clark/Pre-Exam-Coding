package experiments;
class Dudes {
	static long flag = 0;
 // insert code here
	synchronized void chat(long id) {
	//	void chat(long id) {
		if(flag == 0) 
			flag = id;
	 
		for(int x = 1; x < 3; x++) {
			if(flag == id) 
				System.out.print("yo ");
			else 
				System.out.print("dude ");
		}
	}
}
