package experiments;
import java.lang.Character.Subset;
import java.util.*;


public class TreeSetTest {

	private static TreeSet<Integer> myTreeSet = new TreeSet<Integer>(); 
	private static Integer[] intArr = {-10,-20,-1,0,10,20,30,40,100};
	public static void main(String[] args) {
		
		for(int i = 0;i < intArr.length;i++){
			myTreeSet.add(intArr[i]);
		}
		
		
		for(Integer i : myTreeSet){
			System.out.println("Set contains " + i);
		}
		
		System.out.println(myTreeSet.size());
		
		System.out.println("Floor of 0 = " + myTreeSet.floor(0));
		System.out.println("Lower of 0 = " + myTreeSet.lower(0));

		System.out.println("Higher of 0 = " + myTreeSet.higher(0));
		System.out.println("Ceiling of 10 = " + myTreeSet.ceiling(10));
//		System.out.println("\nTreeSet Descending " + myTreeSet.descendingSet()); 
		
		System.out.println("Treeset = " + myTreeSet);
		SortedSet<Integer> headSet = myTreeSet.headSet(10,true);
		System.out.println("Headset 10 = " + headSet);
		SortedSet<Integer> tailSet = myTreeSet.tailSet(10,false);
		System.out.println("Tailset 10 = " + tailSet);
		
		SortedSet<Integer> sSet = new TreeSet<Integer>();
		sSet = myTreeSet.subSet(-1, 21);
		System.out.println("subSet = " + sSet);
		
	}
}
