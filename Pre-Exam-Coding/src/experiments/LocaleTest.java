package experiments;
import java.util.*;
import java.text.*;

public class LocaleTest {

	public static void main(String[] args) {
		// Create a Locale
		Locale locale = new Locale("fr");
		
		Calendar cal = Calendar.getInstance();
		
		Date date = cal.getTime();
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,locale);

		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.UK);
		
		System.out.println("date in french is " + df.format(date));
		
		System.out.println("currency in UK is " + nf.format(100));


	}

}
