package experiments;
import java.util.*;

public class TemplateClass<T> {
	
	private T t;
	
	public void showElType(T item){
		
		if(item instanceof Integer)
			System.out.println("T was an Integer ");
		if(item instanceof Float)
			System.out.println("T was an Char ");
		if(item instanceof String)
			System.out.println("T was an String ");
		if(item instanceof Double)
			System.out.println("T was an Double ");
		if(item instanceof Character)
			System.out.println("T was an Character ");
	}
	public static void main(String[] args){
		
		Double d = 1.0001212d;
		Float f = 999.900098f;
		Integer i = 1024;
		Character c = 'C';
		String s = "I am a String";
		
		TemplateClass<Integer> IntTClass = new TemplateClass<Integer>();
		IntTClass.showElType(i);
		TemplateClass<Character> CharTClass = new TemplateClass<Character>();
		CharTClass.showElType(c);
		TemplateClass<String> StringTClass = new TemplateClass<String>();
		StringTClass.showElType(s);
		TemplateClass<Double> DoubleTClass = new TemplateClass<Double>();
		DoubleTClass.showElType(d);
		TemplateClass<Float> FloatTClass = new TemplateClass<Float>();
		FloatTClass.showElType(f);
	}

}
