package experiments;

public class OuterIn {
	
	private int x = 256;
	
	public void callInner(){
		InnerC inc = new InnerC();
		inc.show();
	}
	class InnerC{
		public void show(){
			System.out.println("In InnerC Outer x = " + x);
			System.out.println("Inner this = " + this);
			System.out.println("Outer this = " + OuterIn.this);
		}
	}
	
}
