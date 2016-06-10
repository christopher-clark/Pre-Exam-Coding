package experiments;
import java.util.*;

 public class Looking {
	 
 public static void main(String[] args) {
	 String input = "1 2 a 3 45 true 6 122345245L 12.12 'c' \"String here\"";
	 Scanner sc = new Scanner(input);
	 int x = 0;
 
	 do {
		 if(sc.hasNextInt())
		 	System.out.println("Int found : " + sc.nextInt());
		 else if(sc.hasNextFloat())
			 System.out.println("Float found : " + sc.nextFloat());
		 else if(sc.hasNextBoolean())
			 System.out.println("Boolean : " + sc.nextBoolean());
		 else if(sc.hasNextLong())
			 System.out.println("Long : " + sc.nextLong());
		 else
		 	 System.out.println("Next found : " + sc.next());
	 } while (sc.hasNext());
 }
 }