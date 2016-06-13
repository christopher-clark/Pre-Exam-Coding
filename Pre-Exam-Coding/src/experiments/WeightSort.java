package experiments;
import java.util.*;

class WeightSort implements Comparator<Animal> {
	public int compare(Animal one, Animal two){
		Integer a = one.getWeight();
		Integer b = two.getWeight();
		return a.compareTo(b);
	}
}
