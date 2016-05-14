package chapter3;

public class FloatSize {
	byte b = (byte) 128;
	float f = (float) 23.3;
	public static void main(String[] args){
		FloatSize fs = new FloatSize();
		T_runnable trun = new T_runnable();
		String s = "string";
		System.out.println("String s + 1 = "  + s + 1);
		int i = 100;
		System.out.println("++i = "  + ++i);
		int j = 100;
		System.out.println("j++ = "  + j++);
		System.out.println("j = " + j );
		int k = 100;
		System.out.println("--k = "  + --k);
		int l = 100;
		System.out.println("l-- = "  + l--);
		System.out.println("l = " + l);
		
/*		for(int i = 100;i > 90;i--){
			System.out.println("i % 10 = " + i%10); 
		}
		float f = 8.1f;
		for(int i = 1;i < 81;i++){
			System.out.println("i % 0.8 = " + i%f); 
		}
		System.out.println(fs.b);
		byte b = 'a';
		b += 7;
		char c = 'a';
		int i = c;
		System.out.println("int char value of 'a' = " + i);*/
		// char equality is tested on the unicode integer value
		char c = 'a';
		if(c == 97)
			System.out.println("'a' == 97");
		// instanceof can test for an instance of an interface
		if(trun instanceof Runnable){
			System.out.println("trun is an instanceof Runnable");
		}
	}
}
