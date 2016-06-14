package experiments;
import java.util.*;

public class AnimalDoctorGeneric {

	// change the argument from Animal[] to ArrayList<Animal>
	public void checkAnimals(ArrayList<Animal> animals) {
		for(Animal a : animals) {
		a.checkup();
		}
	}
	public static void main(String[] args) {
		// make ArrayLists instead of arrays for Dog, Cat, Bird
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog());
		dogs.add(new Dog());
		List<Cat> cats = new ArrayList<Cat>();
		cats.add(new Cat());
		cats.add(new Cat());
	
		// this code is the same as the Array version
		AnimalDoctorGeneric doc = new AnimalDoctorGeneric();
		// this worked when we used arrays instead of ArrayLists
		doc.checkAnimals(dogs); // send a List<Dog>
		doc.checkAnimals(cats); // send a List<Cat>
		
		}
	}
}
