package experiments;

public class ConditionTesting {
	
	static String[] names = {"Chris", "Georgie", "Liam", "Antony", "Jane", "Grandma", "Grandad"};
	
	public static void main(String[] args){
		//testIf2();
		//testIfElse();
		//for(int i = 0 ; i < 9;i++,switchTest(i));
		//sTest();
		//switchChar();
		switchTest();
	}
	public static void testIf(){
		int x = 1;
		if ( x == 3 ) { }
		else if (x < 4) {System.out.println("<4"); }
		else if (x < 2) {System.out.println("<2"); }
		else { System.out.println("else"); }
	}
	public static void testIf2(){
		float score = 0.63f; 
	if (done())
		if (score < 0.61)
		System.out.println("Try again.");
		// Which if does this belong to?
		else System.out.println("Java master!");
	}
	static boolean done(){
		return true;
	}
	public static void testIfElse(){
		int rand = (int) (Math.random() * 5); 
		System.out.println("Random " + rand);
		
		if(rand == 0)
			System.out.println("Random = 0 " + rand);
		else if(rand == 1)
			System.out.println("Random = 1 " + rand);
		else if(rand == 2)
			System.out.println("Random = 2 " + rand);
		else if(rand == 3)
			System.out.println("Random = 3 " + rand);
		else
			System.out.println("Random > 3 " + rand);
	}

	public static void switchTest(){
		String test = names[(int) (Math.random() * names.length)];
		
		switch(test){
			case "Chris": 
			{
				System.out.println("Chris " + test );
				break;
			}
			default : 
			{
				System.out.println("Not Chris or Georgie ");
				break;
			}
			case "Georgie": 
			{
				System.out.println("Georgie " + test );
				break;
			}
			
		}
		
	}
	public static void sTest(){
		int x = 4;
		
		switch (x) {
			case 2: System.out.println("2");
			
			case 3: { System.out.println("3");break;
			}
			case 4: System.out.println("4");
			default: System.out.println("default");

		}
	}
	public static void switchChar(){
		Character c = 'c';
		
		switch (c) {
			case 'a': System.out.println("a");
			
			case 'c': { System.out.println("c");break;
			}
			case 'x': System.out.println("x");
			default: System.out.println("default");

		}
	}
}
