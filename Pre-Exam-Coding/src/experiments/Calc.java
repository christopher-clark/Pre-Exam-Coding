package experiments;

public class Calc {
	
	Animal ani = new Animal() {
		public void checkup(){
			System.out.println("Anonymous Animal checkup");
		}
	};

	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.showSquare();
		calc.methodInner();
		calc.ani.checkup();

	}
	public void methodInner(){
		class Inner{
			public void hello(){
				System.out.println("Hello ... Hello ...");
			}
		}
		Inner in = new Inner();
		in.hello();
	}
	public void showSquare(){
		Square square = new Square();
		square.show(99);
	}
	class Square{
		public void show(int x){
			System.out.println("X Squared = " + x * x);
			Calc c = new Calc();
			c.ani.checkup();
		}
	}
}
