package experiments;
import java.util.*;

public class MapInsertRetrieve {
		
	public static void main(String[] args){
	
		Map<Dog,String> dogMap = new HashMap<Dog,String>();

		Dog corgi = new Dog("corgi");
		Dog tom = new Dog("tom");
		Dog baskerville = new Dog("hound of the baskervilles");
		
		dogMap.put(corgi,"The Queen");
		dogMap.put(tom,"Cartoon");
		dogMap.put(baskerville,"Sherlock Holmes");
		
		System.out.println("The dog at corgi is  " + dogMap.get(corgi));
		System.out.println("The dog at baskerville is  " + dogMap.get(baskerville));
		System.out.println("The dog at tom is  " + dogMap.get(tom));
		dogMap.replace(corgi, "sas");
		System.out.println("The dog at ??? is  " + dogMap.get(new Dog("sas")));
		System.out.println("The dog at corgi is  " + dogMap.get(corgi));
	
	}

}
