package experiments;

public class Parent extends Grandparent{
	
	int size;
	String name;
	
	static { System.out.println("Parent static 1 "); }
	{ System.out.println("Parent Instance "); }
	public Parent(int i){
		this.size = i;
	}
	public Parent(){
		{ System.out.println("Parent constructor "); }
	}
	static { System.out.println("Parent static 2 "); }
}
