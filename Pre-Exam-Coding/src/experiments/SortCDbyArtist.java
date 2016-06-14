package experiments;
import java.util.*;

public class SortCDbyArtist implements Comparator<CD>{
	public int compare(CD one, CD two){
		
		return one.getArtist().compareTo(two.getArtist());
		
	}
}
