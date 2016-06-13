package experiments;
import java.util.*;

public class DogSort implements Comparator<Dog>{
	public int compare(Dog one, Dog two){
		return one.getBreed().compareTo(two.getBreed());
	}

}
