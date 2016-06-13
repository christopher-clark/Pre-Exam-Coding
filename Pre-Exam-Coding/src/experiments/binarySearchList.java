package experiments;
import java.util.*;
import java.util.Arrays;

public class binarySearchList {

	private static ArrayList<String> genres = new ArrayList<String>();
	
	public static void main(String[] args) {
		genres.add("Pop Music");
		genres.add("Classical Music");
		genres.add("Modern Jazz");
		genres.add("Bebop");
		genres.add("Rap Music");
		genres.add("Punk Rock");
		
		for(String str : genres)
			System.out.println("Unsorted list = " + str);
		
		String[] types = new String[6];
		types = genres.toArray(types);
		
		/*for(String str : types)
			System.out.println("Unsorted Array = " + str);
		
		System.out.println("Search for Classical Music  "+ Collections.binarySearch(genres, "Classical Music"));
		
		System.out.println("Search for Classical Music  "+ Arrays.binarySearch(types, "Classical Music"));
		Collections.sort(genres);
		*/
		
		
	/*	for(String str : genres)
			System.out.println("" + "Sorted list = " + str);
		for(String str : types)
			System.out.println("Array after List Sort = " + str);
		
		System.out.println("Search for Classical Music  "+ Collections.binarySearch(genres, "Classical Music"));
		
		
		System.out.println("Classical Music array search before sort of list  "+ Arrays.binarySearch(types, "Classical Music"));
		
		Arrays.sort(types);
		
		for(String str : types)
			System.out.println("Sorted Array = " + str);
		
		System.out.println("Classical Music array search after sort of list  "+ Arrays.binarySearch(types, "Classical Music"));*/
		
		Iterator<String> musicIt = genres.iterator();
		
		while(musicIt.hasNext()){
			System.out.println("Music Type is " + musicIt.next()); 
		}
	}

}
