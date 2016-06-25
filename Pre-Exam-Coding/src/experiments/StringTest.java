package experiments;

public class StringTest {
	
	public static void main(String[] args) {
	
		/*String s2 = "summer";
		
		System.out.println(s2);
		
		s2 = s2.replaceAll("su", "xx");
		
		if(s2.contains("xx"))
			s2 = s2.replace("xxmmer", "new");
		
		s2 = s2.concat("kladsfalywryhhhdsfasffadf");
		
		StringBuffer sb = new StringBuffer(s2);
		System.out.println("Index of hhh is " + sb.indexOf("hhh"));
		
		System.out.println(s2);
		
		StringBuilder sbnew = new StringBuilder("abc").append("def").reverse().insert(3, "---");
		System.out.println( sbnew )*/;

		StringBuilder sb4 = new StringBuilder("01234567");
		StringBuilder sb55 = (sb4.insert(4, "---"));
		System.out.println( sb55.append("HELP"));
		
	}
	public void equalityTest(){
		
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
