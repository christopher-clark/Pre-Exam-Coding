package experiments;

public class Overriding {

	public static void main(String[] args) {
		AnimalExperiment [] kennel = { new AnimalExperiment(), new Dog(), new AnimalExperiment()};
		
		for(AnimalExperiment ani : kennel){
			ani.makeNoise();
			if(ani instanceof Dog){
				((Dog)ani).playDead();
			}
		}
		AnimalExperiment ani = new AnimalExperiment();
		
		Dog d = (Dog) ani;
		/*
		Animal aniHorse = new Horse();
		Animal aniCow = new Cow();
		
		aniHorse.makeNoise();
		aniCow.makeNoise();
		Cow herman = new Cow();
		herman.makeNoise();
		herman.giveMilk();
		ani.makeNoise();
		Animal ermintrude = (Cow) ani;
		if(ermintrude instanceof Cow)
			ani.makeNoise();*/
	}

}
