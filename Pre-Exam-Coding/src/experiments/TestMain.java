package experiments;

public class TestMain {

	public static void main(String[] args) {
		// Create Outer Class reference
		BasicInner bi = new BasicInner();
		
		// Create ref to Inner via Outer.Inner and call new on Instance of Outer
		BasicInner.Iclass inner = bi.new Iclass();
		inner.print();
		
		System.out.print("\n");
		
		MethodInner mi = new MethodInner();
		mi.callInner();
		
	}

}
