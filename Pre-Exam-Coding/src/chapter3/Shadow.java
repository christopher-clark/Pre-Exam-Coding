package chapter3;

class Shadow {
	static int size = 7;							// Instance variable size = 7
	static String s = "Instance Variable";
	
	static void changeIt(int size) {
		size = size + 200;
		System.out.println("size in changeIt is " + size);
	}
	static void changeIt(String s) {
		s = s + "200";
		System.out.println("s in changeIt is " + s);
	}
	public static void main (String [] args) {
		Shadow shadow = new Shadow();
		System.out.println("Instance variable size ( should be 7 ) = " + size);
		System.out.println("\"Instance String is \" " + s);

		changeIt(size);
		changeIt(s);
		System.out.println("size after changeIt is " + size);
		System.out.println("s after changeIt is " + s);
	}
}
