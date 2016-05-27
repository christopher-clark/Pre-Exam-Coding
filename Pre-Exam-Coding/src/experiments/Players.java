package experiments;

public class Players {

	static int players = 0;
	
	public static void main(String[] args) {
		System.out.println("Number of players = " + players++);
		System.out.println("Number of players = " + players);
		System.out.println("Number of players = " + ++players);
		
		int x = 2; int y = 3;
		if ((y == x++) | (x <= y--)) {
		System.out.println("x = " + x + " y = " + y);
		}
	}

}
