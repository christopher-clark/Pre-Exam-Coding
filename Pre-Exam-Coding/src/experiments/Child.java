package experiments;

public class Child extends Parent{
	{ System.out.println("Child Instance "); }
	
	public Child(){
		{ System.out.println("Child constructor "); }
	}
	static { System.out.println("Child static 1 "); }
}
