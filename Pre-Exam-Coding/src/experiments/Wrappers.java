package experiments;

import java.util.ArrayList;

public class Wrappers {

	public static void main(String[] args) {
	//intToPrim();
//	stringToWrap("1024123423");
	stringToWrap("F1",16);
	stringToWrap("F1",16);
	stringToPrim("FF",16);
	
	Integer intWrap = Integer.valueOf("ffff",16);
	if(intWrap instanceof Integer){
	System.out.println("intWrap Integer = " + intWrap);
	
	long l = Long.parseLong("110000",2);
	System.out.println("long primitive from Long.parseLong(\"110000\",2) = " + l);
	}
	
	
	}
	static void intToPrim(){
	// Converting from a Wrapper to a Primitive
	Integer iWrap = 1024*1024;
	int iPrim = iWrap.intValue();
	float fPrim = iWrap.floatValue();
	short sPrim = iWrap.shortValue();
	double dPrim = iWrap.doubleValue();
	long lPrim = iWrap.longValue();	
	byte bPrim = iWrap.byteValue();
	System.out.println("Integer = " + iWrap);
	System.out.println("byte = " + bPrim);
	System.out.println("short = " + sPrim);
	System.out.println("int = " + iPrim);
	System.out.println("long = " + lPrim);
	System.out.println("float = " + fPrim);
	System.out.println("double = " + dPrim);
	}
	// Converting a String (Object to a primitive as it is
	
	static void stringToWrap(String s){
		System.out.println("integer.valueOf = " + Integer.valueOf(s));
		System.out.println("long.valueOf = " + Long.valueOf(s));
	}
	
	// Converting a String (Object to a Wrapper using a radix
	static void stringToWrap(String s, int radix){
		System.out.println("Integer.valueOf = " + Integer.valueOf(s, radix));
		System.out.println("Long.valueOf = " + Long.valueOf(s, radix));
	}
	// Converting a String (Object to a primitive using a radix
	static void stringToPrim(String s, int radix){
		System.out.println("Integer.valueOf = " + Integer.parseInt(s, radix));
		System.out.println("Long.valueOf = " + Long.parseLong(s, radix));
	}
}
