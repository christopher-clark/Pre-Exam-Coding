package chapter2;

public class PolymorphCall {

	public static void main(String[] args) {
		PolymorphCall poly = new PolymorphCall();
		poly.polyTest();
	}
	public void polyTest(){
		Animal[] animals = {new Dog(), new Cow(), new Horse(), new Frog()};
		for(int i = 0; i < animals.length;i++){
			animals[i].makeNoise();
			//Animal dog = new Dog();
			//dog.makeNoise();
		}
	}

}
