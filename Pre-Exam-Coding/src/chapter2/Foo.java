package chapter2;

public class Foo {
	int x = 3;
	float y = 4.3f;
	
	public static void main (String [] args) {
		for (int z = x; z < ++x; z--, y = y + z)
			System.out.println("float y = " + y);
			// complicated looping and branching code
	}
}

