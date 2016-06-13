package experiments;
import java.util.*;

public class ListToArray {

	public static void main(String[] args) {
		List<Integer> IntegerList = new ArrayList<Integer>();
		
		for(int x=0; x<10; x++){
			IntegerList.add((int)(Math.random() * 100));
			System.out.println("IntegerList value is " + IntegerList.get(x));
		}
		
		
		Object[] oa = IntegerList.toArray(); // create an Object array from the List
		
		// Copy List to Array
		Integer[] ia2 = new Integer[10];
		ia2 = IntegerList.toArray(ia2); // create an Integer array
		for(Integer I : ia2)
			System.out.println("Integer I = " + I);
		
		ia2[0] = 1024;
		
		for(Integer I : ia2)
			System.out.println("Integer I = " + I);
		
		for(Integer Il : IntegerList)
			System.out.println("Integer List I = " + Il);
	}

}
