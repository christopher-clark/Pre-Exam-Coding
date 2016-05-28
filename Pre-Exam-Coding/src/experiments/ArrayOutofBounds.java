package experiments;

public class ArrayOutofBounds {

	public static void main(String[] args) {
		int[] nums = new int[10];
		
		for(int i = 0;i < nums.length;i++){
		nums[i] = i;
		System.out.println("Array[i] = " + nums[i]);
		}
		System.out.println("Array[i] = " + nums[10]);
	}

}
