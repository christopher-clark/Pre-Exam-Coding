package chapter2;

public class OverloadedObjectReferences {

	public static void main(String[] args) {
		OverloadedObjectReferences or = new OverloadedObjectReferences();
		// make an Array of Animal Objects
		Animal[] animals = {new Dog(), new Cow(), new Horse(), new Frog()};
		// Call the method with subclasses to see which doStuff gets called()
		for(int i = 0; i < animals.length;i++){
			or.doStuff(animals[i]);
		}
	}
	public void doStuff(Animal a) {
		System.out.println("In the Animal version");
		}
		public void doStuff(Horse h) {
		System.out.println("In the Horse version");
		}
		public void doStuff(Cow c) {
			System.out.println("In the Cow version");
		}
		public void doStuff(Frog f) {
			System.out.println("In the Frog version");
		}
}
