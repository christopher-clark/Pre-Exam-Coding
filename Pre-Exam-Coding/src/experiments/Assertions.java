package experiments;

public class Assertions {
	public static void main(String[] args){
		Parent p = new Parent(11);
		p.name = "Assertive parent";
		comp(p,10);
	}
	public static void comp(Parent p, int j){
		assert(p.size > j) : "i is " + p.size + " j is " + j + " Parent name = " + p.name;
		assert false;
	}
}
