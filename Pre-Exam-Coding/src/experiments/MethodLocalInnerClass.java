package experiments;

public class MethodLocalInnerClass {
	
	private int x = 1024;
	
	public static void main(String[] args){
		MethodLocalInnerClass mil = new MethodLocalInnerClass();
		mil.innerLoc();
	}
	public void innerLoc(){
		int y = 1;
		class Inner{
			public void showOuterx(){
				System.out.println("Outer x squared = " + x * x + " plus local y " + y);
			}
		} 															// End of Class definition
		Inner innerl = new Inner();									//Create instance of InnerClass
		innerl.showOuterx();										// Call method of Inner Class
	}
}
