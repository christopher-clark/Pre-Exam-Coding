package experiments;

public class NullPointException {

		static String s;  // will default to 'null'
		
	public static void main(String[] args) {
		int i = s.length();
		System.out.println(i);

	}
	public static void go(){
		System.out.println("go");
		go();
	}

}
