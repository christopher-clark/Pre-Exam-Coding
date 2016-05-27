package experiments;

public class Spock {
 public static void main(String[] args) {
	 int mask = 0;
	 int count = 0;
	 if( ((5<7) || (++count < 10)) | mask++ < 10 ) 
		 mask = mask + 1;
	 if( (6 > 8) ^ false) 
		 mask = mask + 10;
	 if( !(mask > 1) && ++count > 1) 
		 mask = mask + 100;
	 	System.out.println(mask + " " + count);
	 	
	 Long L = 41l;
	 float f = 41.0f;
	 if(L == f)
		 System.out.println("Long L = float f");
	 
	
	 }
 }