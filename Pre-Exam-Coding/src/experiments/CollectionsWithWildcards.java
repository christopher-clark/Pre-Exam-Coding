package experiments;
import java.util.*;

public class CollectionsWithWildcards {

	private static ArrayList<Cat> cats = new ArrayList<Cat>();
	private static ArrayList<Animal> animals = new ArrayList<Animal>();
	
	private static TreeSet<Animal> animalset = new TreeSet<Animal>();
	
	public void showNames(ArrayList<? extends Animal> anis){
		for(Animal ani : anis){
			ani.showName();
		}
	}
	public void showSetNames(Set<? extends Animal> aniset){
		for(Animal ani : aniset){
			ani.showName();
		}
	}
	
	public static void main(String[] args){
		cats.add(new Cat("1 Tom"));
		cats.add(new Cat("Tom 100"));
		cats.add(new Cat("Tom 2"));
		animals.add(new Animal("Animal 10"));
		animals.add(new Animal("Animal 112"));
		animals.add(new Animal("Animal 31"));
		CollectionsWithWildcards cww = new CollectionsWithWildcards();
		cww.showNames(animals);
		cww.showNames(cats);
		animalset.add(new Animal("Zebra"));
		animalset.add(new Animal("Alligator"));
		animalset.add(new Animal("Donkey"));
		
		for(Animal ani : animalset)
			System.out.println(ani.getName());
		
		// Create instance of Outer Class
		BasicInnerClass bic = new BasicInnerClass();
		BasicInnerClass.InnerC inner = bic.new InnerC();
		inner.hi();
	
	}	
}
