package experiments;

public class Wrappers2 {
	public static void main(String[] args){
		Long l =  123456789l;
		
		long primlong = l.longValue();
		System.out.println("Primitive long = " + primlong);
		
		int primint = l.intValue();
		System.out.println("Primitive int = " + primint);
		
		Integer iWrap = Integer.valueOf("1234567891");
		System.out.println("Integer = " + iWrap);
		
		float f = Float.parseFloat("1.0121");
		System.out.println("float = " + f);
	}
}
