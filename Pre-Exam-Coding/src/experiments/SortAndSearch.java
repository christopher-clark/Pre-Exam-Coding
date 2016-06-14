package experiments;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortAndSearch {

	public static void main(String[] args) {
		List<CD> cds = new ArrayList<CD>();
		
		CD cd1 = new CD();
		cd1.setArtist("abba");
		cd1.setTitle("waterloo");
		cd1.setPrice(1000);
		cds.add(cd1);
		CD cd2 = new CD();
		cd2.setArtist("the clash");
		cd2.setTitle("london calling");
		cd2.setPrice(5);
		cds.add(cd2);
		CD cd3 = new CD();
		cd3.setArtist("leonard cohen");
		cd3.setTitle("live at the albert hall");
		cd3.setPrice(15);
		cds.add(cd3);
		CD cd4 = new CD();
		cd4.setArtist("led zeppelin");
		cd4.setTitle("led zeppelin iv");
		cd4.setPrice(120);
		cds.add(cd4);
		CD cd5 = new CD();
		cd5.setArtist("wayne shorter");
		cd5.setTitle("hamer hall");
		cd5.setPrice(50);
		cds.add(cd5);
		
		for(CD cd : cds){
			System.out.println(" Title : " + cd.getTitle());
			System.out.println(" Artist : " + cd.getArtist());
			System.out.println(" Price : " + cd.getPrice());
		}
		System.out.println("\n");
		Collections.sort(cds);
		for(CD cd : cds){
			System.out.println(" Sorted Title : " + cd.getTitle());
			System.out.println(" Artist : " + cd.getArtist());
			System.out.println(" Price : " + cd.getPrice());
		}
		
		// Sort by price
		SortCDbyPrice psort = new SortCDbyPrice();
		Collections.sort(cds,psort);
		
		System.out.println("\n");
		
		for(CD cd : cds){
			System.out.println(" Sorted by Price : " + cd.getPrice());
			System.out.println(" Title : " + cd.getTitle());
			System.out.println(" Artist : " + cd.getArtist());
		}
		SortCDbyArtist asort = new SortCDbyArtist();
		Collections.sort(cds,asort);
		
		System.out.println("\n");
		
		for(CD cd : cds){
			System.out.println(" Sorted by Artist : " + cd.getArtist());
			System.out.println(" Price : " + cd.getPrice());
			System.out.println(" Title : " + cd.getTitle());
			
		}
	}
}
