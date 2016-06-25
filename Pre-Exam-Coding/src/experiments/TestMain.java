package experiments;

public class TestMain {

	static char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

	public static void main(String[] args) {
		/*// Create Outer Class reference
		BasicInner bi = new BasicInner();
		
		// Create ref to Inner via Outer.Inner and call new on Instance of Outer
		BasicInner.Iclass inner = bi.new Iclass();
		inner.print();
		
		System.out.print("\n");
		
		MethodInner mi = new MethodInner();
		mi.callInner();*/
		
		// Create Outer Class
		/*Calc calc = new Calc();
		Calc.Square inner = calc.new Square();
		inner.show(101);
		calc.methodInner();*/
		
		// java.lang.ClassCastException
		//Animal ani = new Animal();
		//Cat c;
		//c = (Cat) ani;
		
		// java.lang.ArrayIndexOutOfBoundsException
		//int[] nums = new int[2];
		//int i = nums[3];
		
		// java.lang.StackOverflowError
		//TestMain tm = new TestMain();
		//tm.loop();
		
		// java.lang.NullPointerException
		//Cat c = new Cat();
		//c.d.checkup();
		
		 
		// java.lang.NumberFormatException
		// int i = Integer.parseInt("WE");
		
		// Wrapper to primitive Wrapper.xxxValue();
		//Integer intWrap = 10;
		//int i = intWrap.intValue();
		//Float f = 1.00001f;
		//float fint = f.floatValue();
		//System.out.println(fint);
		
		// primitive from a String Wrapper.parseXXX("String");
		//int x = Integer.parseInt("12");
		//System.out.println("int from String " + x);
		//float f = Float.parseFloat("12.009");
		//System.out.println(f);
		
		// Wrapper from a String Wrapper.valueOf("String");
		//Integer iValue = Integer.valueOf("10");
		//if(iValue instanceof Integer)
		//	System.out.println("iValue is an Integer " + iValue);
		
		/*Float f = Float.valueOf("12.0232");
		if(f instanceof Float)
			System.out.println("f is a Float " + f);*/
		
		// Create Outer Class
		/*OutAndIn oai = new OutAndIn();
		//oai.displayRand();
		// Create a Outer.Inner var = outer.new Inner()
		OutAndIn.FindMe findme = oai.new FindMe();
		findme.showRand();*/
		
		while(true){
			char ch = alphabet[(int) (Math.random() * alphabet.length)];
			System.out.println(ch );
		}
		
	}
	public void loop(){
		 loop();
	 }
}
