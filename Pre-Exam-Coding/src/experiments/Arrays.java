package experiments;
import chapter2.*;

public class Arrays {

	public static void main(String[] args) {
		Animal ani = new Animal();
		Horse horse = new Horse();
		Frog frog = new Frog();
		Cow cow = new Cow();

		if(cow instanceof AnimalExperiment)
			System.out.println("Frog IS AN ANIMAL");
		frog.makeNoise();
				Animal[] farm = {ani,horse,cow,frog};
		
		for(Animal an : farm){
			an.makeNoise();
		}
	}

}
