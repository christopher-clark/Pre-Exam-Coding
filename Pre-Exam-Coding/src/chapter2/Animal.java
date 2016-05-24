package chapter2;

public class Animal {
	public String name;
	Integer size;
	
	static {System.out.println("Static Init Animal Block");}
	{System.out.println("Instance Init Animal Block");}
	
	public String toString(){
		return ("I am an Animal called " + name);
	}
	public Animal(String name) {
	 this.name = name;
	 System.out.println("Constructing Animal called " + name);
	}
	public Animal(){
		this(makeRandomName());
		System.out.println("Constructing no-arg Animal called " + name);
	}
	
	static String makeRandomName() {
		 String [] name = {"Fluffy", "Fido","Rover", "Spike","Gigi"};
		 return name[(int) (Math.random() * name.length)];
	}
	public void makeNoise(){
		System.out.println("Animal Noise ");
	}
	public void eat() {
		System.out.println("Generic Animal Eating Generically");
	}
	public void eat(int i) {
		System.out.println("Animal eating " + i + " pieces of Food");

	}
}

