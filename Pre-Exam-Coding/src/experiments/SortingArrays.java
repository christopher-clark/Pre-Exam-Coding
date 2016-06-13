package experiments;
import java.util.Arrays;


public class SortingArrays {

	private static Animal[] animals =  {new Animal("Iguana"), new Animal("Koala"), new Animal("Zebra"), new Animal("Donkey")};
	private static Cow[] cows = {new Cow("Ermintrude"), new Cow("Mooer"), new Cow("Hamish"), new Cow("Milky")};
	private static Horse[] horses = {new Horse("Pegasus"), new Horse("Red Rum"), new Horse("Black Caviar")};
	private static Dog[] dogs = {new Dog("Ali"), new Dog("Tom"), new Dog("Kujo"), new Dog("Queenie")};
	private static String[] names = {"tom","dick","harry"};
	private static int[] nums = {10,23,0,1,4,3,8,9};
	
	public static void main(String[] args) {
		SortingArrays sa = new SortingArrays();
		for(String s : names)
			System.out.println("Names are : " + s);
		
		Arrays.sort(names);
		
		for(String s : names)
			System.out.println("Names are : " + s);
		
		System.out.println("simon is at index : " + Arrays.binarySearch(names, "simon"));
		
		//for(int i : nums)
		//	System.out.println("Nums are : " + i);
		
		Arrays.sort(nums);
		
		for(int i : nums)
			System.out.println("Sorted Nums are : " + i);
		
		System.out.println("Looking for 100 gets : " + Arrays.binarySearch(nums, 100));
		System.out.println("Looking for 22 gets : " + Arrays.binarySearch(nums, 22));
		System.out.println("Looking for 23 gets : " + Arrays.binarySearch(nums, 23));
		System.out.println("Looking for 0 gets : " + Arrays.binarySearch(nums, 0));
		
	/*	sa.showAnimals();
		Arrays.sort(animals);
		sa.showAnimals();
		
		sa.showCows();
		Arrays.sort(cows);
		sa.showCows();
		sa.showHorses();
		dogs[0].setBreed("Boxer");
		dogs[1].setBreed("Guard Dog");
		dogs[2].setBreed("Alsation");
		dogs[3].setBreed("Corgi");
		sa.showDogs();
		DogSort sorter = new DogSort();
		Arrays.sort(dogs,sorter);
		for(Dog d : dogs)
			System.out.println("Dogs are : " + d);*/
	}
	void showAnimals(){
		for(int i=0;i < animals.length;i++)
			System.out.println("Animal names are : " + animals[i].getName());
	}
	void showCows(){
		for(int i=0;i < cows.length;i++)
			System.out.println("Cow names are : " + cows[i].getName());
	}
	void showHorses(){
		for(int i=0;i < horses.length;i++)
			System.out.println("Horse names are : " + horses[i].getName());
	}
	void showDogs(){
		for(int i=0;i < dogs.length;i++)
			System.out.println("Dog names are : " + dogs[i].getName() + " Breeds are : " + dogs[i].getBreed());
	}

}
