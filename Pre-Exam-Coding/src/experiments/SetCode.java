package experiments;
import java.util.*;


public class SetCode {

	private static Set<String> mySet = new TreeSet();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mySet.add("peter");
		mySet.add("paul");
		mySet.add("Mary");
		
		for(Object o : mySet)
			System.out.print(o + " ");
		
	}
}
