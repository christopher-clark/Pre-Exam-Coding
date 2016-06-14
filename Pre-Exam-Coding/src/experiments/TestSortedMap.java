package experiments;
import java.util.*;

public class TestSortedMap {

	private static String[] data = {"Chris","Georgie","Liam","Antony","Lil","Brendan","Baka","Snez","Zebedee"};

	public static void main(String[] args) {
		TreeMap<Integer,String> myTreeMap = new TreeMap<Integer,String>();

		for(int i = 0;i < data.length;i++){
			myTreeMap.put(i, data[i]);
		}
		
		System.out.println("TreeMap = " + myTreeMap);
		
		SortedMap<Integer,String> sMap = myTreeMap.subMap(3, 6);
		System.out.println("TreeMap = " + myTreeMap);
		System.out.println("SubMap = " + sMap);
		
		SortedMap<Integer,String> sMap1 = myTreeMap;
		System.out.println("sMap1 = " + sMap1);
		System.out.println("myTreeMap CeilingValue 3 = " + myTreeMap.ceilingEntry(3));
		System.out.println("myTreeMap lowerValue 3 = " + myTreeMap.lowerEntry(3));
		System.out.println("myTreeMap higherValue 3 = " + myTreeMap.higherEntry(3));
		
		System.out.println("myTreeMap CeilingKey 5 = " + myTreeMap.ceilingKey(5));
		System.out.println("myTreeMap lowerValue 3 = " + myTreeMap.lowerEntry(3));
		System.out.println("myTreeMap higherKey 3 = " + myTreeMap.higherKey(3));

	}

}
