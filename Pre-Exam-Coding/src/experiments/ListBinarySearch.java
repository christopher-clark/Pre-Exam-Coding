package experiments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListBinarySearch {

	public static void main(String[] args) {
		List<Integer> IntegerList = new ArrayList<Integer>();
		
		for(int x=0; x<10; x++){
			IntegerList.add((int)(Math.random() * 100));
			System.out.println("IntegerList value is " + IntegerList.get(x));
		}
		
		Collections.sort(IntegerList);
		
		for(int x=0; x<  IntegerList.size(); x++){
			System.out.println("Sorted List value is " + IntegerList.get(x));
		}
				System.out.println("Binary Search for 91 returns " + Collections.binarySearch(IntegerList, 91));
		

	}

}
