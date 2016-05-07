package chapter1;

public class Dog extends Animal{
	String Name;
	int size;
	
	Dog(){
		System.out.println("no-args constructor");
	}
	Dog(String name){
		this.name = name;
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
}
