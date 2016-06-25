package experiments;

public class Ebb {
	
	 static int x = 7;
	 static { x++; }
	 
	 public static void main(String[] args) {
		 
		 String s = "";
		 
		 for(int y = 0; y < 3; y++) {
			 x++;
			 System.out.println("x = " + x + " y = " + y + " s = " + s);
			 switch(x) {
				 case 8: s += "8 ";
				 case 9: s += "9 ";
				 case 10: { s+= "10 ";
				 			break; 
				 			}
				 default: s += "d ";
				 case 13: s+= "13 ";
			 }
			 System.out.println("Outside switch s = " + s + " y = " + y);
		 }
	  System.out.println(s);
	  }
  }