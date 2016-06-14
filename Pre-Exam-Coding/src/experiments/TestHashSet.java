package experiments;
import java.util.*;
import java.util.Collections;
import java.util.Arrays;


public class TestHashSet {

	private static String[] data = {"Chris","Georgie","Liam","Antony","Lil","Brendan","Baka","Snez","Zebedee"};

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		TreeSet<String> treeSet = new TreeSet<String>();
		for(String str : data){
			hashSet.add(str);
			treeSet.add(str);
		}
		System.out.println("hashSet = " + hashSet);
		System.out.println("treeSet = " + treeSet);
		
		System.out.println("Ceiling Baka " + treeSet.ceiling("Baka"));
		System.out.println("Lower Baka " + treeSet.lower("Baka"));
		System.out.println("Floor Baka " + treeSet.floor("Baka"));
		System.out.println("Higher Baka " + treeSet.higher("Baka"));
		
		SortedSet<String> sSet = treeSet.subSet("Baka", "Zebedee");
		System.out.println("subSet = " + sSet);
		
		System.out.println("headSet ( left to right Liam) " + treeSet.headSet("Liam"));
		System.out.println("tailSet ( right to end of Set Liam) " + treeSet.tailSet("Liam"));
		treeSet.add("Donald");
		System.out.println("treeSet = " + treeSet);
		System.out.println("subSet = " + sSet);
		
		String[] fromCollection = new String[treeSet.size()];
		fromCollection = treeSet.toArray(fromCollection);
		
		for(String str : fromCollection)
			System.out.println("Array from treeSet = " + str);
		
		String[] fromHashSet = new String[hashSet.size()];
		fromHashSet = hashSet.toArray(fromHashSet);
		
		for(String str : fromHashSet)
			System.out.println("Array from HashSet = " + str);
		
		List<String> fromArray = new ArrayList<String>();
		fromArray = Arrays.asList(fromCollection);
		for(String str : fromArray)
			System.out.println("List from TreeSet = " + str);
		
		System.out.println("\n");
			
		List<String> fromArray1 = Arrays.asList(fromHashSet);
		fromArray1 = Arrays.asList(fromHashSet);
		for(String str : fromArray1)
			System.out.println("List from HashSet = " + str);
	}

}
