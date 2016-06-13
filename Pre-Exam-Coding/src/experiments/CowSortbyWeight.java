package experiments;
import java.util.*;


public class CowSortbyWeight implements Comparator<Cow>{
	public int compare(Cow one, Cow two){
		Integer w1 = one.getWeight();
		Integer w2 = two.getWeight();
		return w1.compareTo(w2);
	//return one.getWeight().(compareTo(two.getWeight());
	}

}
