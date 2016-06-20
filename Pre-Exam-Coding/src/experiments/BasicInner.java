package experiments;

public class BasicInner {

	private String s = "Outer Class Instance Variable";
	
	public static void main(String[] args) {
		BasicInner bi = new BasicInner();
		bi.callInner();
	}	
	public void callInner(){
		Iclass ic = new Iclass();
		ic.print();
	}
	// Basic Inner Class
	class Iclass{
		public void print(){
			System.out.println("Outer String is " + s);
		}
	}
}
