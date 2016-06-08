package experiments;
import java.text.*;
import java.util.*;

public class LocaleGermany {
	public static void main(String[] args) {
		
		// Get Locale
		Locale germanLoc = new Locale("de");
		// Get Calendar Instance with Locale as parameter
		Calendar gerCal = Calendar.getInstance(germanLoc);
		// Get date via Calendar
		Date gerDate = gerCal.getTime();
		// Get a DateFormat Object with style and locale parameters
		DateFormat germanDate = DateFormat.getDateInstance(DateFormat.LONG,germanLoc);
		// Output the formatted Date using theDateFormat
		System.out.print("Date in German format : " + germanDate.format(gerDate));		
	}

}
