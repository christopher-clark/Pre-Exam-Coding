package experiments;

public class Parent extends Grandparent{
	static { System.out.println("Parent static 1 "); }
	{ System.out.println("Parent Instance "); }
	
	public Parent(){
		{ System.out.println("Parent constructor "); }
	}
	static { System.out.println("Parent static 2 "); }
}
