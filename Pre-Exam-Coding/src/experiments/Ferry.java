package experiments;
import java.util.*;

public class Ferry {
	public static void main(String[] args) {
		TreeSet<Integer> times = new TreeSet<Integer>();
		times.add(1205); // add some departure times
		times.add(1505);
		times.add(1545);
		times.add(1830);
		times.add(2010);
		times.add(2100);
		System.out.println("J6 - last before 4pm is: " + times.lower(1600));
		System.out.println("J6 - first after 8pm is: " + times.higher(2000));
		System.out.println("J6 - on or before 3.45pm is: " + times.floor(1545));
		System.out.println("J6 - on or after 1505 is: " + times.ceiling(1505));
	}
}