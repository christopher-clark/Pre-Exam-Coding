package experiments;

public class LabelledBreak {
	
	static boolean isTrue = true;
	
	public static void main(String [] args){
		//brk();
		//cont();
		ageTest();
		
	};
	public static void ageTest(){
		
		int age = 0;
	
	outer:
		while(age < 21){
			age++;
			if(age == 16){
				System.out.println("Get Licence");
				continue outer;
			}
			else {
				System.out.println("Another Year");
			}
			System.out.println("Age = " + age);
			
		}
		
	}

	public static void brk(){
		$outer:
			for(int i=0; i<5; ) {
				while (isTrue) {
				System.out.println("Hello");
				i++;
				if(i == 4)
					break $outer;
				} // end of inner while loop
				
				System.out.println("Outer loop."); // Won't print
			
			} // end of outer for loop
			System.out.println("Good-Bye");
	}
	public static void cont(){
		$outer:
			for(int i=0; i<5;i++ ) {
				while (isTrue) {
				System.out.println("Hello");
				
				continue $outer;
				} // end of inner while loop
				
				System.out.println("Outer loop."); // Won't print
			
			} // end of outer for loop
			System.out.println("Good-Bye");
	}
}	
