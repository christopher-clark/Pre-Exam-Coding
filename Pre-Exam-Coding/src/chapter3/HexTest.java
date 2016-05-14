package chapter3;

public class HexTest {
	public static void main(String[] args){
		long hex = 0xffffff;;
		System.out.println("Hex = " + hex);
		int octal = 010;
		System.out.println("Octal 10 = " + octal);
		int octal100 = 0100;
		System.out.println("Octal 100 = " + octal100);
		char c = (char)70000; 										// The cast is required; 70000 is
		System.out.println("(char)70000 = " + c);				// out of char range
		int byt = (byte)7000;
		System.out.println("(byte)70000 = " + byt);
		int shrt = (short)70000;
		System.out.println("(short)70000 = " + shrt);
		int x = (int) 3957.929;
		System.out.println("int x = " + x);
		float f = 2348888.56F;
		short sh = (short)f;
		System.out.println("short sh = " + sh);

	}
}
