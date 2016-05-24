package experiments;

public class IntegerAndLong {

	public static void main(String[] args) {
		int i = 1;
		go(i);

	}
	static void go(Integer i){
		System.out.println("Going with a Integer " + i);
	}
	static void go(long l){
		System.out.println("Going with a long " + l);
	}
}
