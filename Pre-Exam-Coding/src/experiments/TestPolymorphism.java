package experiments;

public class TestPolymorphism {

	public static void main(String[] args) {
		Cat c = new Cat("Tom");
		c.miew();
		Animal ani  = new Animal();
		ani.makeNoise();
		Animal aniCat = new Cat();
		aniCat.makeNoise();
		aniCat.checkup();
		aniCat = new Animal();
		aniCat.checkup();

		Food food = new Food();
		food.demo();

	}

}
