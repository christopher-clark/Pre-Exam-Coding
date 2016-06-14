package experiments;
import java.util.*;

public class PriorityQ {

	private static PriorityQueue<String> PQ = new PriorityQueue<String>();
	private static String[] names = {"tom","dick","harry","peter","paul","alfred"};
	
	public static void main(String[] args) {

		for(int i = 0;i<names.length;i++){
			PQ.add(names[i]);
		}
		
		System.out.println("PQ gives " + PQ);
		System.out.println("PQ  poll() gives " + PQ.poll());
		System.out.println("PQ gives " + PQ);
		System.out.println("PQ  peek() gives " + PQ.peek());
		System.out.println("PQ gives " + PQ);
		System.out.println("PQ  poll() gives " + PQ.poll());
		System.out.println("PQ gives " + PQ);

	}

}
