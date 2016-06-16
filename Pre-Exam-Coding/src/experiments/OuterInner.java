package experiments;

public class OuterInner {

	private static int x = 9;
	
	public static void main(String[] args){
		OuterInner oc = new OuterInner();
		oc.callInner();
		
		OuterInner secondInstance = new OuterInner();
		
		// create new InnerClass reference by dotting Outer.Inner instance 
		OuterInner.InnerClass innerClass = secondInstance.new InnerClass();
		innerClass.showOuterXsquared();
	}
	public void callInner(){
		InnerClass ic = new InnerClass();
		ic.showOuterX();
	}

	class InnerClass{
		public void showOuterX(){
			System.out.println("Outer x instance var = " + x);
		}
		public void showOuterXsquared(){
			System.out.println("Outer x squared = " + x*x);
		}
		public void showOuterXcubed(){
			System.out.println("Outer x cubed = " + x*x*x);
		}
	}
}
