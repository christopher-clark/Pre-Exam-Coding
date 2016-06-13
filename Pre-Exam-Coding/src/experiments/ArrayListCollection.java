package experiments;
import java.util.*;

public class ArrayListCollection {

	private static List<String> names = new ArrayList<String>();
	private static List<Integer> nums = new ArrayList<Integer>();
	private static List<Animal> animals = new ArrayList<Animal>();

	private static String[] data = {"Chris","Georgie","Liam","Antony","Lil","Brendan","Baka","Snez"};
	private static Set<String> nameSet = new HashSet<String>();
	
	public static void main(String[] args) {
		ArrayListCollection ac = new ArrayListCollection();
		//ac.namesArraylist();
		ac.integerArrayList();
		//ac.sortCollection();
		//ac.hashSetSort();
		//ac.sortAnimals();
		//ac.sortCows();
		//ac.sortDogs();
	}
	public void integerArrayList(){
		/*int i = 3;
		nums.add(1);
		nums.add(i);
		if(nums.get(0) instanceof Integer){
			System.out.println("integer added to Integer arraylist comes out as an Integer " + nums.get(0));
		}
		if(nums.get(1) instanceof Integer){
			System.out.println("integer added to Integer arraylist comes out as an Integer " + nums.get(1));
		}*/
		for(int i = 0;i < 10;i++)
			nums.add((int)(Math.random() * 100));
				
		System.out.println(nums);
		Collections.sort(nums);
		System.out.println(nums);
	}
		public void namesArraylist(){
			for(int i=0;i<data.length;i++)
				names.add(data[i]);

			System.out.println("Arraylist size  is " + names.size());
			
			names.add(6,data[3]+data[4]);
			
			System.out.println("Arraylist size  is " + names.size());
			
			for(int i=0;i<names.size();i++){
				System.out.println("Arraylist names contains " + names.get(i));
			}
			
			if(names.contains("Liam"))
					names.remove("Liam");
			
			System.out.println("Arraylist size  is " + names.size());
			
			for(int i=0;i<names.size();i++){
				System.out.println("Arraylist names contains " + names.get(i));
			}
			names.add(0,"Frank Zappa");
			
			System.out.println("Arraylist size  is " + names.size());
			
			for(int i=0;i<names.size();i++){
				System.out.println("Arraylist names contains " + names.get(i));
			}
		}
		public void sortCollection(){
			// display unsorted String ArrayList
			for(int i=0;i<data.length;i++)
				names.add(data[i]);
			System.out.println("Unsorted ArrayList = " + names);
			
			Collections.sort(names);
			System.out.println("Sorted ArrayList = " + names);
			Collections.reverse(names);
			System.out.println("Reversed ArrayList = " + names);
		}
		public void hashSetSort(){
			for(int i=0;i<data.length;i++)
				nameSet.add(data[i]);
			System.out.println("Unsorted HashSet = " + nameSet);
			
		};
		public void sortCows(){
			List<Cow> cows = new ArrayList<Cow>();
			
			Cow ermintrude = new Cow("ermintrude");
			ermintrude.setCountry("england");
			Cow hamish = new Cow("hamish");
			hamish.setCountry("scotland");
			Cow wayne = new Cow("wayne");
			wayne.setCountry("australia");
			Cow pierre = new Cow("pierre");
			pierre.setCountry("france");
			
			cows.add(ermintrude);
			cows.add(hamish);
			cows.add(wayne);
			cows.add(pierre);
			
			for(int i = 0;i<cows.size();i++)
				System.out.println("Unsorted Cows = " + cows.get(i).getCountry() + " " + cows.get(i).getName());
			
			CowCountrySort ccs = new CowCountrySort();
			
			// Sort using Comparable in the Cows Class - compares names
			Collections.sort(cows);
			
			// Sort the ArrayList using the Comparator Class
		//	Collections.sort(cows, ccs);
			
			for(int i = 0;i<cows.size();i++)
				System.out.println("Unsorted Cows = " + cows.get(i).getCountry() + " " + cows.get(i).getName());
		}
		public void sortAnimals(){
			Animal dog = new Animal("dog");
			dog.setWeight(5);
			Animal cat = new Animal("cat");
			cat.setWeight(1);
			Animal pooch = new Animal("pooch");
			pooch.setWeight(-10);
			Animal zebra = new Animal("zebra");
			zebra.setWeight(99);
			Animal antelope = new Animal("antelope");
			antelope.setWeight(-20);
			animals.add(dog);
			animals.add(cat);
			animals.add(pooch);
			animals.add(zebra);
			animals.add(antelope);
			for(int i = 0;i<animals.size();i++)
				System.out.println("Unsorted Animals = " + animals.get(i).getName() + " " + animals.get(i).getWeight());
			
			WeightSort ws = new WeightSort();
			Collections.sort(animals, ws);
			
			for(int i = 0;i<animals.size();i++)
				System.out.println("Sorted Animals = " + animals.get(i).getName()+ " " + animals.get(i).getWeight());
		}
		public void sortDogs(){
			List<Dog> dogs = new ArrayList<Dog>();
			
			Dog ermintrude = new Dog("ermintrude");
			ermintrude.setBreed("pug");
			Dog hamish = new Dog("hamish");
			hamish.setBreed("terrier");
			Dog wayne = new Dog("wayne");
			wayne.setBreed("alsatian");
			Dog pierre = new Dog("pierre");
			pierre.setBreed("labrador");
			
			dogs.add(ermintrude);
			dogs.add(hamish);
			dogs.add(wayne);
			dogs.add(pierre);
			
			for(int i = 0;i<dogs.size();i++)
				System.out.println("Unsorted Dogs = " + dogs.get(i).getBreed());
			
			DogSort ds = new DogSort();
			
			// Sort the ArrayList using the Comparator Class
			Collections.sort(dogs, ds);
			
			for(int i = 0;i<dogs.size();i++)
				System.out.println("Sorted by Breed Dogs = " + dogs.get(i).getBreed());
		}
}


