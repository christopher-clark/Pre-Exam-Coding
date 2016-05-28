package experiments;

public class StackOverFlow {

	public static void main(String[] args) {
		StackOverFlow so = new StackOverFlow();
		so.go();

	}
	public static void go(){
		System.out.println("go");
		go();
	}
}
