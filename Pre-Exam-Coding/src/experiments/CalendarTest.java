package experiments;
import java.text.*;
import java.util.*;

public class CalendarTest {

	public static void main(String[] args) {
		
		// Create Locale 
		Locale loc = new Locale("de");
		
		// Create Calendar Instance
		Calendar cal = Calendar.getInstance(loc);;
		Date date = cal.getTime();
		
		// Create Date Format Instance
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, loc);
		System.out.println("Date in French format = " + df.format(date));
		
		Locale us = new Locale("de");
		NumberFormat nf = NumberFormat.getCurrencyInstance(us);
		System.out.println("Currency format = " + nf.format(100));
			
	}

}
