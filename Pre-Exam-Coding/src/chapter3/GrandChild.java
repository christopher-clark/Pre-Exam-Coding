package chapter3;

public class GrandChild extends Child{
	String name;
	static {
		System.out.println("GrandChild static init block");
	}
	public GrandChild(){
		System.out.println("GrandChild Constructor");
	}
	public GrandChild(String name){
		super();
		this.name = name;
		System.out.println("GrandChild Called " + name);
	}
	public static void main(String[] args){
		GrandChild gc = new GrandChild();
		GrandChild gc1 = new GrandChild("peter");
	}
}
