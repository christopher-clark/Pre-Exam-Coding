package experiments;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class HashSetTest { 

	private static Set<Integer> myHashSet = new HashSet<Integer>(); 
	private static Set<Integer> sortedSet = new TreeSet<Integer>(); 

	
	public static void main(String[] args) {
		
		
		for(int i = 0;i < 5;i++){
			int  x = (int) ((Math.random() * 50));
			System.out.println("Adding x " + x + " " + myHashSet.add(x));
			sortedSet.add(x);
		}
		
		myHashSet.add(11);
	
		for(Integer i : myHashSet)
			System.out.println("Set contains " + i);
		
		for(Integer i : sortedSet)
			System.out.println("Sorted Set contains " + i);
		
		System.out.println(myHashSet.size());
		
		TreeSet<Integer> sset = new TreeSet<Integer>();
		sset = sortedSet.s
	}
	
}
