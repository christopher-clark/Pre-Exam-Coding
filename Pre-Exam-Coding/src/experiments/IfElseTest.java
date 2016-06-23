package experiments;

public class IfElseTest {

	public static void main(String[] args) {
		int val = 9;
		boolean loop = true;
		
		if(loop)
		if(val < 10)
			System.out.println("Val < 10");
		else
			System.out.println("Val > 10");

		if (loop)
			if (val < 10)
			System.out.println("Try again.");
			else
			System.out.println("Java master!");

	}

}
