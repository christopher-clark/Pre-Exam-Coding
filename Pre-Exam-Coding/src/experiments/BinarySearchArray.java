package experiments;
import java.util.Arrays;


public class BinarySearchArray {

	private static String[] names = {"tom","dick","harry"};
	private static int[] nums = {10,23,0,1,4,3,8,9};
	
	public static void main(String[] args) {
		BinarySearchArray sa = new BinarySearchArray();
		for(String s : names)
			System.out.println("Names are : " + s);
		
		Arrays.sort(names);
		
		for(String s : names)
			System.out.println("Names are : " + s);
		
		System.out.println("simon is at index : " + Arrays.binarySearch(names, "simon"));
		
		//for(int i : nums)
		//	System.out.println("Nums are : " + i);
		
		Arrays.sort(nums);
		
		for(int i : nums)
			System.out.println("Sorted Nums are : " + i);
		
		System.out.println("Looking for 100 gets : " + Arrays.binarySearch(nums, 100));
		System.out.println("Looking for 22 gets : " + Arrays.binarySearch(nums, 22));
		System.out.println("Looking for 23 gets : " + Arrays.binarySearch(nums, 23));
		System.out.println("Looking for 0 gets : " + Arrays.binarySearch(nums, 0));
		
	
	}
}
