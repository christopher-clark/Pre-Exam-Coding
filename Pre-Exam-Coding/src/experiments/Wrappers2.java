package experiments;

public class Wrappers2 {
	public static void main(String[] args){
		//wrapToPrim();
		//stringToWrapper();
		stringToPrim();
	}
	public static void wrapToPrim(){
		Float fWrap = 101.00123f;
		Integer iWrap = 100;
		int i = fWrap.intValue();
		System.out.println(" int from Float = " + i);
		double d = fWrap.doubleValue();
		System.out.println(" double from Float = " + d);
		System.out.println(" double from Integer = " + iWrap.doubleValue());
	}
	public static void stringToWrapper(){
		Double d = Double.valueOf("-100.024");
		if(d instanceof Double)
			System.out.println(" Double from primitive = " + d);
		Byte b = Byte.valueOf("10",16);
		if(b instanceof Byte)
			System.out.println(" Byte from primitive = " + b);
		Short s = Short.valueOf("-124");
		if(s instanceof Short)
			System.out.println(" Short from primitive = " + s);
	}
	public static void stringToPrim(){
		int i = Integer.parseInt("12",8);
		System.out.println(" int from String = " + i);
		System.out.println(" double from String = " + Double.parseDouble("123.12233"));
		System.out.println(" float from String = " + Float.parseFloat("1923.12233"));
	}
}
