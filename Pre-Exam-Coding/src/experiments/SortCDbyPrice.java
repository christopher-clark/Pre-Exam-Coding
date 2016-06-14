package experiments;
import java.util.*;

public class SortCDbyPrice implements Comparator<CD>{

	public int compare(CD one, CD two){
		Integer a = one.getPrice();
		Integer b = two.getPrice();
	//	return (Integer)one.getPrice().(compareTo((Integer)two.getPrice());
		return a.compareTo(b);
	}
}
