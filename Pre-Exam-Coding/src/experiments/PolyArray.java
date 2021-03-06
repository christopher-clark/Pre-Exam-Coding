package experiments;

import experiments.OuterInner.InnerClass;

public class PolyArray {

	public static void main(String[] args) {
		Animal[] animals = new Animal[5];
		
		Animal ani = new Animal();
		animals[0] = ani;
		Animal aniHorse = new Horse();
		animals[1] = aniHorse;
		Animal aniDonkey = new Donkey();
		animals[2] = aniDonkey;
		Horse h = new Horse();
		animals[3] = h;
		Donkey d = new Donkey();
		animals[4] = d;
		Cow c = new Cow();
		
		for(int i=0;i<animals.length;i++){
			animals[i].makeNoise();
			if(animals[i] instanceof Donkey){
				System.out.println("Animal at " + i + " == a Donkey");
			}
		}
		c.makeNoise();
		
		OuterInner outerInstance = new OuterInner();
		
		// create new InnerClass reference by dotting Outer.Inner instance 
		OuterInner.InnerClass innerClass = outerInstance.new InnerClass();
		innerClass.showOuterXsquared();
		
		// Create in one line
		OuterInner.InnerClass  innercubed =  new OuterInner().new InnerClass();
		innercubed.showOuterXcubed();
		
	}
}
