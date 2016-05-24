package experiments;

public class AutoBoxing {

	public static void main(String[] args) {
		/*Integer x = 1024;
		Integer y = x;
		System.out.println(y==x);
		x++;
		System.out.println("x now = " + x + (y==x));*/
		
		/*Integer i1 = 1000;
		Integer i2 = 1000;
		if(i1 != i2) System.out.println("different objects");
		if(i1.equals(i2)) System.out.println("meaningfully equal");
		
		int int1 = 1000;
		int int2 = 1000;
		if(int1 == int2) System.out.println("same == int objects");
		if(Integer.valueOf(int1).equals(Integer.valueOf(int2))) System.out.println("meaningfully equal");*/
		
		Integer i3 = 10;
		Integer i4 = 10;
		if(i3 == i4) System.out.println("same object");
		if(i3.equals(i4)) System.out.println("meaningfully equal");
	}

}
