package experiments;

public class AssertionTest {

	public static void main(String[] args) {
		AssertionTest at = new AssertionTest();
		while(true){
			at.numGt10((int) (Math.random() * 15));
		}

	}
	public void numGt10(int num){
		System.out.println("Num = " + num);
		assert(num > 10) : "Num > 10 is false - Num was " + num;
	}
}
