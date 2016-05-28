package experiments;

public class StaticInt {

	static int i =7;
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = (Child) p; 
		int y = 7/0;
	}
	public static void dummy() throws RuntimeException {
		
	}

}
