package chapter2;

public class Horse extends Animal{
	public String name;
	int size;
	
	public Horse(String name) {
	 this.name = name;
	}
	public Horse(){
		this(makeRandomName());
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