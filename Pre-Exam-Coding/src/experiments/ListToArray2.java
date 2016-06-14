package experiments;
import java.util.*;
import java.util.Arrays;

public class ListToArray2 {

	private static List<Integer> intList = new ArrayList<Integer>();
	
	public static void main(String[] args) {

		for(int i = 0;i<10;i++){
			intList.add((int) ((Math.random() * 50)));
		}
		System.out.println("intList = " + intList);
		
		Collections.sort(intList);
		
		System.out.println("intList = " + intList);
		
		System.out.println(Collections.binarySearch(intList, 19));
		Integer[] intArr = new Integer[intList.size()];
		intArr = intList.toArray(intArr);
		
		for(int I : intArr)
			System.out.print(I + " ");
		
		Arrays.sort(intArr);
		System.out.println("\n" + Arrays.binarySearch(intArr,3));
	}
}
