package experiments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CowSort {

	public static void main(String[] args) {
		List<Cow> cows = new ArrayList<Cow>();
		
		Cow ermintrude = new Cow("ermintrude");
		ermintrude.setCountry("england");
		ermintrude.setBreed("Welsh Shorthair");
		ermintrude.setWeight(99);
		Cow hamish = new Cow("hamish");
		hamish.setCountry("scotland");
		hamish.setWeight(50);
		hamish.setBreed("Irish Black");
		Cow wayne = new Cow("wayne");
		wayne.setCountry("australia");
		wayne.setBreed("Aussie Beef");
		wayne.setWeight(-10);
		Cow pierre = new Cow("pierre");
		pierre.setCountry("france");
		pierre.setWeight(-150);
		pierre.setBreed("Boef en Crout");
		cows.add(ermintrude);
		cows.add(hamish);
		cows.add(wayne);
		cows.add(pierre); 
		
		for(int i = 0; i < cows.size();i++)
			System.out.printf("<Name %1$s> *** Breed - %2$s ***  ( Weight =%3$+(05d ) [ Country = %4$s ]\n",cows.get(i).getName(),cows.get(i).getBreed(),cows.get(i).getWeight(),cows.get(i).getCountry());
	
		Collections.sort(cows);

		System.out.println("after Sorting by Collections.sort(cows) ");
		for(int i = 0; i < cows.size();i++)
			System.out.printf("<Name %1$s> *** Breed - %2$s ***  ( Weight =%3$+(05d ) [ Country = %4$s ]\n",cows.get(i).getName(),cows.get(i).getBreed(),cows.get(i).getWeight(),cows.get(i).getCountry());
		
		System.out.println("after Sorting by Weight using Comparator Collections.sort(List<>,comparator");
		CowSortbyWeight comp1 = new CowSortbyWeight();
		Collections.sort(cows,comp1);
		
		for(int i = 0; i < cows.size();i++)
			System.out.format("<Breed %2$s> *** Name - %1$s ***  ( Weight =%3$+05d )\n",cows.get(i).getName(),cows.get(i).getBreed(),cows.get(i).getWeight());
	}

}
