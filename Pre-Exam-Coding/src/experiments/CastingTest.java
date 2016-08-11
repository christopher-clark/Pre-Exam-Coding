package experiments;

public class CastingTest {

	public static void main(String[] args) {
		Animal aniHorse = new Horse();
		Animal aniCat = new Cat();
		Cat aniCat2 = (Cat)aniHorse;
		aniCat2.feedMe();
	}

}
