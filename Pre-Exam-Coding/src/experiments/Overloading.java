package experiments;
public class Overloading {

	public static void main(String[] args) {
		long l = 101212;;
		char c = 'b';
		int i = 1024;
		float f = 1.012f;
		double d = 100.00001;
		go(l);
		go(c);
		go(i);
		go(f);
		go(d);
	}
	static void go(double d){
		System.out.println("Going with a double " + d);
	}
}
