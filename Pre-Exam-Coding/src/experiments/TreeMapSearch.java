package experiments;
import java.util.*;

public class TreeMapSearch {

	private static TreeMap<Integer,String> myTreeMap = new TreeMap<Integer,String>();
	
	public static void main(String[] args) {
		myTreeMap.put(-100, "Bottom");
		myTreeMap.put(451,"Burning paper");
		myTreeMap.put(0,"Zero");
		myTreeMap.put(-571, "Absolute Zero");
		myTreeMap.put(42,"Level of life");
		myTreeMap.put(40,"Hundred Farenheit");
		
		System.out.println("Value below zero " + myTreeMap.lowerKey(0));
		System.out.println("Value <= -100 " + myTreeMap.floorKey(-100));
		System.out.println("Value >= 40 " + myTreeMap.ceilingKey(40));
		System.out.println("Value > 40 " + myTreeMap.higherKey(40));
	//	System.out.println("\nDescending Map " + myTreeMap.descendingMap());
		
		System.out.println("TreeMap = " + myTreeMap);
		
		SortedMap<Integer, String> headMap = myTreeMap.headMap(0);
		System.out.println("HeadMap 0 = " + headMap);
		SortedMap<Integer, String> tailMap = myTreeMap.tailMap(0);
		System.out.println("HeadMap 0 = " + tailMap);
		
		SortedMap<Integer, String> sMap = new TreeMap<Integer, String>();
		sMap = myTreeMap.subMap(10, 43);
		System.out.println("subMap = " + sMap);
	}

}