package experiments;

public class StringTest {
	static String s = "String Instance variable";
	static int i = 100;
	public static void main(String[] args) {
	
		System.out.println("StringTest + String = " + s + "u");
		System.out.println("StringTest + int = " + (i + 199));
		
		String s = "String";
		String s2 = "String";
		
		StringBuilder sb = new StringBuilder("String");
		StringBuilder sb1 = new StringBuilder("String");
		
		if(s == s2)
			System.out.println("s == s2");
		if(s.equals(s2))
			System.out.println("s.equals(s2)");
		
		if(sb == sb1)
			System.out.println("sb == sb1");
		if(sb.equals(sb1))
			System.out.println("sb.equals(sb1)");
		
		sb = sb1;
		if(sb == sb1)
			System.out.println("\nafter sb=sb1: sb == sb1");
		if(sb.equals(sb1))
			System.out.println("after sb=sb1: sb.equals(sb1)");
	}

}
