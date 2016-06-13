package experiments;
import java.util.*;
import java.util.Arrays;

public class ArraytoListandBack {
	
	private static String[] data = {"Chris","Georgie","Liam","Antony","Lil","Brendan","Baka","Snez"};
	private static List<String> nameList;
	private List<Integer> numList = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		ArraytoListandBack atolAndback = new ArraytoListandBack();
		/*atolAndback.showArray("Initial names");
		atolAndback.AtoL("Initial list");
		atolAndback.updateList(2, "Frank Zappa");
		atolAndback.showArray("names after list mod");
		atolAndback.AtoL("list after list mod");
		atolAndback.updateArray(0,"Wayne Shorter");
		atolAndback.showArray("names after Array mod");
		atolAndback.AtoL("list after Array mod");*/
		atolAndback.initList();
		atolAndback.showList();
		atolAndback.listToArray();
	}
	public void AtoL(String comment){
		nameList = Arrays.asList(data);
		
		for(String s : nameList)
			System.out.println(comment + " " + s);
	}
	public void showArray(String comment){
		for(String s : data)
			System.out.println(comment + " " + s);
	}
	public void updateList(int index, String name){
		nameList.set(index,name);
	}
	public void updateArray(int index, String name){
		data[index] = name;
	}
	public void initList(){
		for(int i = 0;i < 10;i++)
			numList.add((int) (Math.random() * 100));
	}
	public void showList(){
		for(int i : numList)
			System.out.println("Numlist contains " + i);
	}
	public void listToArray(){
		Integer[] intArr = new Integer[10];
		
		intArr = numList.toArray(intArr);
		for(int i : intArr)
			System.out.println("intArr contains " + i);
		
	}
}
