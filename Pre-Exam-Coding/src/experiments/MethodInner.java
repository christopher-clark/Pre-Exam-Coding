package experiments;

public class MethodInner {

	public static void main(String[] args){
		MethodInner mi = new MethodInner();
		mi.callInner();
	}
	public void callInner(){
		class Inner {
			public void print(){
				String s = "In Method local inner Class";
				System.out.printf(">> %s  <<", s);
			}
		};
		Inner inner = new Inner();
		inner.print();
	}
}
