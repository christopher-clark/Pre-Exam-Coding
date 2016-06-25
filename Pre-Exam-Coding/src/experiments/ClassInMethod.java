package experiments;

public class ClassInMethod {

	public static void main(String[] args) {
		ClassInMethod cim = new ClassInMethod();
		cim.testInner();

	}
	public void testInner(){
		class Rand{
			public void showRand(){
				int rand = 100;
				System.out.println("Random number < 100 = " + (int) (Math.random() * rand));
			}
		}
		Rand ran = new Rand();
		ran.showRand();
	}
}
