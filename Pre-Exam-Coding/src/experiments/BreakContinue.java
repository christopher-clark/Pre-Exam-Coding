package experiments;

public class BreakContinue {

	public static void main(String[] args) {
	
		// Outer for loop
		outer :
		for(int i = 0;i<10;i++){
			if(i == 2)
				continue;
			if(i==5)
				break outer;
			System.out.println("Outer i = " + i);
		}
	}

}
