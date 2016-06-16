package experiments;
import java.util.*;

public class AnimalDoctorGeneric {

	// change the argument from Animal[] to ArrayList<Animal>
	public void checkAnimals(List<? extends Animal> animals) {
		for(Animal a : animals) {
			a.checkup();
		}
	}
	public void addAnimal(List<? super Donkey> animals){
		animals.add(new Donkey());
		Animal an = new Animal("Pet Animal");
		animals.add(an);
	}
	public void showArrayList(ArrayList<Animal> animals){
		System.out.println("Animals contains " + animals);
	}
	public static void main(String[] args) {
		// make ArrayLists instead of arrays for Dog, Cat, Bird
		List<Donkey> donkeys = new ArrayList<Donkey>();
		donkeys.add(new Donkey());
		donkeys.add(new Donkey());
		donkeys.add(new Donkey());
		List<Horse> horses = new ArrayList<Horse>();
		horses.add(new Horse());
		horses.add(new Horse());
		horses.add(new Horse());

		// this code is the same as the Array version
		AnimalDoctorGeneric doc = new AnimalDoctorGeneric();
		// this worked when we used arrays instead of ArrayLists
		doc.checkAnimals(donkeys); // send a List<Dog>
		doc.checkAnimals(horses); // send a List<Cat>
		ArrayList<Donkey> dons = new ArrayList<Donkey>();
		dons.add(new Donkey());
	}
}

