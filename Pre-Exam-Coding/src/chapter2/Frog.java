package chapter2;

public class Frog extends Animal{
	static int frogCount = 0; 							// Declare and initialize
														// instance variable
	static {System.out.println("Static Frog Block");}
	
public Frog() {
	System.out.println("Constructing no-arg Frog");
	frogCount += 1; 							// Modify the value in the constructor
}
public void makeNoise(){
	System.out.println("Ribbet Ribbet ");
}
public static void main (String [] args) {
	new Frog();
	new Frog();
	new Frog();
	System.out.println("Frog count is now " + frogCount);
	}
}
