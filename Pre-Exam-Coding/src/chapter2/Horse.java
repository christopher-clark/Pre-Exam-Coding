package chapter2;

public class Horse extends Animal{
	public String name;
	int size;
	
	static {System.out.println("Static Horse Block");}
	{System.out.println("Instance Init Horse Block");}
	
	public Horse(String name) {
	 super(name);
	}
	public Horse(){
		this(makeRandomName());
		System.out.println("Constructing no-arg Horse");
	}
	public String toString(){
		return ("I am a Horse called " + name);
	}
	static String makeRandomName() {
		 String [] name = {"Black Beauty", "Red Rum","Black Caviar", "Queens Own","Trotter"};
		 return name[(int) (Math.random() * name.length)];
	}
	
	
	public void eat() {
		System.out.println("Horse Eating Hay and Oats");
	}
	public void eat(String s) {
		System.out.println("Horse eating " + s);
	}
	public void eat(int i) {
		System.out.println("Horse eating " + i + " bales of Hay");

	}
	public void eat(float f) {
		System.out.println("Horse eating " + f + " bales of Hay");

	}
}