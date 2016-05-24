package other;
import chapter1.Parent;

class Child extends Parent {

	public void testIt() {
		System.out.println("x is " + x); 						// No problem; Child
																// inherits x
		Parent p = new Parent(); 								// Can we access x using the
		System.out.println("Char in parent is " + c);														// p reference?
	//	System.out.println("X in parent is " + p.x); 			// Compiler
																// error!
		}
}