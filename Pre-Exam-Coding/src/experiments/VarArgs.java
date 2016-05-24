package experiments;

public class VarArgs {

	public static void main(String[] args) {
		byte b = 8;
		go(b,b);

	}
	static void go(Byte b, Byte c){
		System.out.println("Going with a Byte, Byte " + b + " " + c);
	}
	static void go(byte... b){
		System.out.println("Going byte ... ");
	}

}
