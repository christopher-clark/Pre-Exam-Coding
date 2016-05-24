package chapter2;

public class Dog extends Animal{
	static String [] names = {"Fido", "Mutley", "Elsa", "Tiny", "It"};
	String name;
	int size;
	
	{System.out.println("Instance Init Dog Block");}
	
	Dog(){
		this(assignName());
		System.out.println("no-args Dog constructor name = " +  name);
	}
	Dog(String name){
		this.name = name;
		System.out.println("String Dog constructor name = " +  name);
	}
	Dog(int size){
		this.size = size;
	}
	public void makeNoise(){
		System.out.println("Woof Woof ");
	}
	public void eat() {
		System.out.println("Woofer eating ");
	}
	public void woof() {
		System.out.println("Woof Woof ");
	}
	static String assignName(){
		return names[(int) (Math.random() * names.length)];
	}
	public String toString(){
		return ("I am a Dog called " + name);
	}
}
