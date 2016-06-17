package experiments;

public class TestInner {
	
	private int x = 9919;
	
	Cat cat = new Cat() {
		public void makeNoise(){
			System.out.println("Cat noise from Anon inner Class"); 
		}
	};
	IFace1 iface = new IFace1(){
		public void show(){
			System.out.println("Inner Class Implementation of IFace1");
		}
	};
	public void callinner(){
		Inner inner = new Inner();
		inner.showX();
		cat.makeNoise();
		iface.show();
	}
	class Inner{
		public void showX(){
			System.out.println("Outer X = " + x);
		}
		
	}
}
