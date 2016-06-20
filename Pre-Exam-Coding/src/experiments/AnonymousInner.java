package experiments;

public class AnonymousInner {
	
	Car c = new Car() {
		public void drive(){
			System.out.println("Driving an Anonymous Car");
		}
	};
	IFace1 if1 = new IFace1(){
		public void show(){
			System.out.println("Implementing IFace1");
		}
	};
	public void callInner(){
		Car c1 = new Car();
		c1.drive();
		c.drive();
		if1.show();
	}
	public static void main(String[] args){
		AnonymousInner ai = new AnonymousInner();
		ai.callInner();
	}
}
