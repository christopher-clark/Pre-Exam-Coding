package experiments;

public class BasicInnerClass {

	private int x = 1024;
	
	public static void main(String[] args){
		BasicInnerClass bic = new BasicInnerClass();
		bic.makeInner();
		
		// Make an Instance of Outer Class
		BasicInnerClass bic2 = new BasicInnerClass();
		
		BasicInnerClass.InnerC inner =  bic2.new InnerC();
	}
	public void makeInner(){
		InnerC inner = new InnerC();
		inner.showOuterX();
		
	}
	
	class InnerC{
		public void hi(){
			System.out.println("In Inner Class");
		}
		public void showOuterX(){
			System.out.println("X in Outer Class = " + x);
			System.out.println("Inner class ref is " + this);
			System.out.println("Outer class ref is " + BasicInnerClass.this);
		}
	}
}
