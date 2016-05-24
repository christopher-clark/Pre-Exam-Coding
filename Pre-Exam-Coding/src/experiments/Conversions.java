package experiments;

public class Conversions {

	public static void main(String[] args) {
		// Primitive from Wrapper
		Character ch = 'C';
		Integer i = 1024;
		char c = ch.charValue();
		System.out.println("char from Character = " + c + " int = " + i.floatValue());
		
		// Wrapper from String
		Integer integer = Integer.valueOf("1234");
		System.out.println("Integer from String = " + integer);
		Byte byt = Byte.valueOf("101",8);
		System.out.println("Byte from String = " + byt);
		
		// primitive from String
		Float f = Float.parseFloat("102.0012");
		if (f instanceof Float){
			System.out.println("Float instance from String = " + f);
		}
			
	}

}