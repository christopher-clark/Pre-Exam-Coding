package experiments;

public class Strings {

	public static void main(String[] args) {
		
		Strings strings = new Strings();
		strings.stringEqual();
		strings.stringBufferEqual();
		//strings.concatStr();
		//strings.teaser();
		//strings.bufferTest();
		//strings.generalMethods();
	//	Parent adult = new Child();
	//	Child c = (Child) adult;
		
	}
		public void generalMethods(){
			
			//comp();
			//chAt();
			//subStr();
			//sbuilder();
			//sbuffer();
			//buffDelete();
			//buffInsert();
			//buffDelete();
			chain();
			
		}
		public void chain(){
			String x = "abc";
			String y = x.concat("def").toUpperCase().replace('C','x');
			//chained methods
			System.out.println("y = " + y); // result is "y = ABxDEF"
		}
		public void buffInsert(){
			StringBuilder sb = new StringBuilder("123456789");
			System.out.println(sb);
			sb = sb.insert(1, "Hello");
			System.out.println(sb);
			
		}
		public void buffDelete(){
			StringBuilder sb = new StringBuilder("0123456789");
			System.out.println(sb.delete(4,6));
		}
		public void sbuffer(){
			StringBuffer sb = new StringBuffer("set ");
			sb.append("point");
			System.out.println(sb); // output is "set point"
			StringBuffer sb2 = new StringBuffer("pi = ");
			sb2.append(0x80);
			System.out.println(sb2);
		}
		public void sbuilder(){
			StringBuilder sbuild  = new StringBuilder("Stringbuilder");
			System.out.println("sbuild = " + sbuild);
			System.out.println("reversed = " + sbuild.reverse());
			System.out.println("Appended = " + sbuild.append("Appended"));
		}
		public void comp(){
			String s = "string1";
			String s1 = s.toUpperCase();
			if(s.equalsIgnoreCase(s1)){
				System.out.println("S1 = " + s1 + " s = " + s.length());
			}
		}
		public void chAt(){
			String s = "string1";
			char c = s.charAt(4);
			System.out.println("charAt(0) = " + c);
		}
		public void subStr(){
			String s = "Sub_string";
			System.out.println("substring(0) = " + s.substring(1,7));
		}
		public void bufferTest(){
			StringBuffer sb = new StringBuffer("StringBuffer");
			System.out.println("StringBuffer sb.toString() = " + sb.toString() + " sb = " + sb.length());
		}
		public void teaser(){
			String s1 = "spring ";
			String s2 = s1 + "summer ";
			s1.concat("fall ");
			s2.concat(s1);
			s1 += "winter ";
			System.out.println(s1 + " " + s2);
		}
		public void concatStr(){
			String s = "String 1";
			System.out.println(" s = " + s);
			System.out.println(" s  s.toUpperCase() = " + s.toUpperCase());
			System.out.println(" s = " + s);
			System.out.println(" s = s.toUpperCase() = " + (s = s.toUpperCase()));
			System.out.println(" s = " + s);
		    System.out.println(" After s.replace(\"ri\",\" ro\") = " + s.replace("ri","ro"));
		    System.out.println(" s = " + s);
		    System.out.println(" After s = s.replace(\"RI\",\" RO\") = " + (s= s.replace("RI","RO")));
		    System.out.println(" s = " + s);
		}
		public void stringEqual(){
			String s = "Dummy";
			String s1 = "Dummy";
			if(s == s1){
				System.out.println(" Two Strings with the same chars are == ");
			} else
			{
				System.out.println(" Two Strings with the same chars are != ");
			}
			if(s.equals(s1)){
				System.out.println(" Two Strings with the same chars are s.equals(s1) ");
			} else
			{
				System.out.println(" Two Strings with the same chars are != ");
			}
			
			/* .equals() */
			String s2 = s1;
			
			if(s2 == s1) {
				System.out.println(" Two Strings where s1 = S2 are == ");
			} else
			{
				System.out.println(" Two Strings where s1 = S2 are != ");
			}
			if(s2.equals(s1)) {
				System.out.println(" Two Strings where s1 = S2 s2.equals(s1)");
			} else
			{
				System.out.println(" Two Strings where string 1 = String2 are != ");
			}
		}
			public void stringBufferEqual(){
				
				System.out.println();
				StringBuffer s = new StringBuffer("Dummy");
				StringBuffer s1 = new StringBuffer("Dummy");
				if(s == s1){
					System.out.println(" Two StringBuffers s == s1   == ");
				} else
				{
					System.out.println(" Two StringBuffers s == s1 are != ");
				}
				if(s.equals(s1)){
					System.out.println(" Two StringBuffers s == s1  are s.equals(s1) ");
				} else
				{
					System.out.println(" Two StringBuffers s == s1  s.equals(s1) != ");
				}
				
				/* .equals() */
				StringBuffer s2 = s1;
				
				if(s2 == s1) {
					System.out.println(" Two StringBuffers a = b are == ");
				} else
				{
					System.out.println(" Two StringBuffers a = b are != ");
				}
				if(s2.equals(s1)) {
					System.out.println(" Two StringBuffers a = b  s2.equals(s1");
				} else
				{
					System.out.println(" Two StringBuffers a = b s2.equals(s1) are != ");
			}

	}

}
