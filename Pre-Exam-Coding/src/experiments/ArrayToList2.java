package experiments;
import java.util.*;
import java.util.Arrays;

public class ArrayToList2 {

	private static Integer[] intArr = new Integer[5];
	private static List<Integer> intList = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		for(int i = 0;i<5;i++){
			intArr[i] = ((int) ((Math.random() * 50)));
			System.out.print("intArr = " + intArr[i] + " ");
		}
		intList = Arrays.asList(intArr);
		System.out.println("\nintList = " + intList);
		
		intArr[1] = 999;
		System.out.println("\nNew intList = " + intList);
		
		for(int i = 0;i<5;i++)
	}

}
