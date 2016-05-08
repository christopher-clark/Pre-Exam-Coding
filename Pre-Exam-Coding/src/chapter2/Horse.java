package chapter1;

public class Horse extends Animal{
	String name;
	int size;
	
	Horse(){
		System.out.println("no-args Horse constructor");
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