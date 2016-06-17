package experiments;

public class TestMain {

	public static void main(String[] args) {
		// Create Outer Class reference
		TestInner ti = new TestInner();
		ti.callinner();
		
		// Create ref to Inner via Outer.Inner and call new on Instance of Outer
		TestInner.Inner in = ti.new Inner();
		in.showX();
	}

}
