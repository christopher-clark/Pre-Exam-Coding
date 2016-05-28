package experiments;

public class ContinueTest {

	static String [] names = {"Tom", "Dick", "Harry", "Peter", "Mary", "Paul"};
	
	public static void main(String[] args) {
		
		// loop x number of times and see if the name is Paul	
		//breakLoop();
		continueLoop();
	}
	public static void breakLoop(){
		// loop x number of times and see if the name is Paul		
		for(int i = 0; i < names.length;i++,System.out.println(i)){
			String guessName = names[(int) (Math.random() * names.length)];
			System.out.println(guessName);
			if(guessName.equals("Paul")){
				System.out.println("Found Paul ");
				break;
			}
						
		}
	}
	public static void continueLoop(){
		
		for(int j = 0; j < names.length;j++){
			System.out.println("J = " + j);
			
			// loop x number of times and see if the name is Paul		
			for(int i = 0; i < names.length;i++){
				String guessName = names[(int) (Math.random() * names.length)];
				System.out.println(guessName);
				if(guessName.equals(names[i])){
					System.out.println("\t I = " + i);
					System.out.println("Found - " + guessName + " " + names[i] + " Continue");
					continue;
				}
				else {
					System.out.println("No Match, I = " + i);
				}
			}
		}
	}
	

}
