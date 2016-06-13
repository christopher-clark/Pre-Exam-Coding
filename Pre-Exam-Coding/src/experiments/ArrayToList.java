package experiments;
//import java.util.List;
import java.util.Arrays;
import java.util.*;

public class ArrayToList {

	private static String[] data = {"Chris","Georgie","Liam","Antony","Lil","Brendan","Baka","Snez"};
	private static List<String> sList;
	
	public static void main(String[] args) {
			
		ArrayToList atol = new ArrayToList();
		atol.createInitialList();
		atol.showArray("Before Sorting");
		atol.showList("Before Sorting");
		atol.sortList();
		atol.showArray("After Sorting");
		atol.showList("After Sorting");
		atol.updateList(1,"Zebedee");
		atol.showArray("After Apdating List");
		atol.showList("After Updating List");
		atol.updateArray(0, "peter pan");
		atol.showArray("After Apdating Array");
		atol.showList("After Updating Array");
	}	
		
		
		
	
	public void createInitialList(){
		sList = Arrays.asList(data);
	}
	public void showList(String status){
		for(String str : sList)
			System.out.format("%2$s sList is %1$s \n", str, status);
	}
	public void sortList(){
		Collections.sort(sList);
	}
	public void showArray(String status){
		for(String str : data)
			System.out.format("%2$s Names are %1$s \n", str,status);
	}
	public void updateList(int index, String member){
		sList.set(index,member);
	}
	public void updateArray(int index, String member){
		data[index] = member;
	}
}
