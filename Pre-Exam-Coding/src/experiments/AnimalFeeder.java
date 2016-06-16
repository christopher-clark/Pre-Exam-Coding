package experiments;
import java.util.*;

public class AnimalFeeder {

	public static void main(String[] args) {
		Frog[] frogs = {new Frog(), new Frog()};
		Cat[] cats = {new Cat(),new Cat()};
		Donkey[] donkeys = {new Donkey(), new Donkey()};
		AnimalFeeder aniFeeder = new AnimalFeeder();
		aniFeeder.feedAnimals(frogs);
		aniFeeder.feedAnimals(donkeys);
		aniFeeder.feedAnimals(cats);
		List<Animal> animal = new ArrayList<Animal>();
		Object o = new Object();
		animal.add(new Animal());
		animal.add(new Cat());
		List<Cat> ani = new ArrayList<Cat>();
		ani.add(new Cat("Pussy"));
		aniFeeder.showName(ani);
		List<Frog> fro = new ArrayList<Frog>();
		fro.add(new Frog("Fredd0"));
		aniFeeder.showName(fro);
		

	}
	public static void feedAnimals(Animal[] animals){
		for(Animal ani : animals){
			ani.feedMe();
		}
		//animals[0] = new Horse();
	}
	public static void showName(List<? extends Animal> animals){
		for(Animal ani : animals){
			ani.showName();
		}
	}
	public static void addName(List<? super Cat> pets){
		
	}
	
}
