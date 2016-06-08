package experiments;
import java.io.*;
import java.util.regex.*;

public class RegexSmall {
	public static void main(String [] args) {
		
		
	/*	Pattern p = Pattern.compile("0[xX]([0-9a-fA-F])+"); // Finds 0x with 1 or more alpha characters eg 0xf123213 oxa 0x12
		Pattern p = Pattern.compile("0[xX]([0-9a-fA-F])*"); // Finds 0x with zero or more alpha characters eg 0xFf 0x12 0xfdf45454 0x 
		Pattern p = Pattern.compile("0[xX]([0-9a-fA-F])?"); // Finds 0x with zero or one alpha characters eg 0X1 0xf 0xe 0xa 
		Matcher m = p.matcher("ada$%$0X1ABCDE2#@#@rtr0xaa@#0x12341qwQWQ00XAAAMMM0XMMMM"); // the source	
		
		Pattern p = Pattern.compile("proj[13]([^,])*");		// Finds proj1 proj1sched.pdf proj1.java
		Matcher m = p.matcher("proj3.txt,proj1sched.pdf,proj1,proj2,proj1.java,podfdf"); // the source				
	
		Pattern p = Pattern.compile("\\d\\d\\d[\\s-]?\\d+");		// Finds 123 4567, 123-4567, 1234567 1231212121 - Assumes fixed length
		Matcher m = p.matcher("123 2344,1234567, aasdds, 567, !#!@414, 123-4567, 123121244564"); // the source		
		
		Pattern p = Pattern.compile(".*?xx");		// Finds EVERYTHING !!! 7, aasddsxx, 123121244564
		Matcher m = p.matcher("7, aasddfred.txtsxx, 1alb.txt23121244564xx"); // the source*/	
		
		Pattern p = Pattern.compile("\\w+");
		try{
			BufferedReader br = new BufferedReader(new FileReader("C:\\SCJP\\SourceData\\Token.txt"));
			
			//String searchPattern = "ba";
			String searchPattern = br.readLine();
			//	System.out.println(searchPattern);
				
				Matcher m = p.matcher(searchPattern);
				while(m.find()){
					System.out.println(m.start() + " " + m.group());
				}
			
			br.close();
		} catch(IOException ioe){
			ioe.printStackTrace();
		}
		/*while(m.find()) {
		System.out.println(m.start() + " " + m.group());
		}*/
	}
}
