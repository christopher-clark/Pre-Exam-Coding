package experiments;

class TestOR {
 public static void main(String[] args) {
	 if ((isItSmall(3)) || (isItSmall(7))) {
		 System.out.println("Result is true");
	 }
	 if ((isItSmall(6)) || (isItSmall(9))) {
		 System.out.println("Result is true");
	 }
	 System.out.println(10 + "Result is true");
	 Boolean b = true;
	 if(b){
		 System.out.println("Boolean wrapper can be used in Boolean test");
	 }
	 boolean b2 = false;
	 
	 if(b2 = false)
		 System.out.println("B2 = d=false");
 }

 public static boolean isItSmall(int i) {
	 if (i < 5) {
		 System.out.println("i < 5");
		 return true;
	 } else {
		 System.out.println("i >= 5");
		 return false;
	 }
	 }
 }