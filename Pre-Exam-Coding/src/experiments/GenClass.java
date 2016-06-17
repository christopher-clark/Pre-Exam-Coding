package experiments;
import java.util.*;

public class GenClass<T> {
	
	private T t;
	
	public void showT(T t){
		System.out.println("T was : " + t.toString());
	}
	public static void main(String[] args){
		GenClass<Integer> gClassI = new GenClass<Integer>();
		GenClass<ArrayList<Integer>> gClassAL = new GenClass<ArrayList<Integer>>();
		
		gClassI.showT(1024);
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 0;i<10;i++,al.add(i))
			gClassAL.showT( al );
		
		// Create instance of outer Class
		OuterIn ounterIn = new OuterIn();
		// make static Reference to  Outer Class to create Inner class
		OuterIn.InnerC inner = ounterIn.new InnerC();
		inner.show();
	}

}
