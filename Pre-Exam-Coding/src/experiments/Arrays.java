package experiments;

import chapter2.*;

public class Arrays {

	public static void main(String[] args) {
		Animal ani = new Animal();
		Horse horse = new Horse();
		Frog frog = new Frog();
		Cow cow = new Cow();
		Animal[] farm = {ani,horse,frog,cow};
		
		for(Animal an : farm){
			System.out.println(an);
		}
	}

}
