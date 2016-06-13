package experiments;
import java.util.*;

public class CowCountrySort implements Comparator<Cow> {
	public int compare(Cow one, Cow two){
		return one.getCountry().compareTo(two.getCountry());
	}

}
