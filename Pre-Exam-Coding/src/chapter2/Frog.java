package chapter2;

class Frog extends Animal{
	static int frogCount = 0; 							// Declare and initialize
												// instance variable
public Frog() {
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
