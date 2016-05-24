package chapter2;

public class Cow extends Animal {
	
	static {System.out.println("Static Cow Block");}
	{System.out.println("Instance Init Cow Block");}
	public Cow(){
		System.out.println("Constructing no-arg Cow");
	}
	public void makeNoise(){
		System.out.println("Moo Moo ");
	}
	public String toString(){
		return ("I am an Cow called " + name);
	}
}
