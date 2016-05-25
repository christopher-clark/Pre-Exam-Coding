package experiments;

public class Overloads {

	public static void main(String[] args) {
		oload(1,2);
		Integer i = 12;
		oload(i,i);
		short s = 12;
		oload(s);
		char c = 1;
		oload(c,c);
		byte b = 0;
		oload(b,s);

	}
	public static void oload(int x, int y){
		System.out.println(" int x, int y " );
	}
	public static void oload(int... x){
		System.out.println(" int... x " );
	}
	public static void oload(Integer x, Integer y){
		System.out.println(" Integer x, Integer y " );
	}
	public static void oload(Short s){
		System.out.println(" Short s " );
	}
	public static void oload(long l){
		System.out.println(" long l " );
	}

}
