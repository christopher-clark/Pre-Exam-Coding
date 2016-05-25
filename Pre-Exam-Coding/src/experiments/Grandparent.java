package experiments;

public class Grandparent {
	static { System.out.println("Grandparent static 1 "); }
	{ System.out.println("Grandparent Instance "); }
	
	public Grandparent(){
		{ System.out.println("Grandparent constructor "); }
	}
}