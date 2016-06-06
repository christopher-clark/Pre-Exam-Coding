package experiments;
import java.io.*;
import java.util.*;
import java.util.regex.*;



public class Regex {
	
	private static File myFile;
	private static String readline = "";
	
	public static void main(String[] args) {
		try{
		BufferedReader br = new BufferedReader(new FileReader("C:\\SCJP\\SourceData\\PostCodes.txt"));
		while( (readline = br.readLine()) != null){
		//	System.out.println("File contents are " + readline);
			
			Pattern p = Pattern.compile("[-\\s]"); // the expression
			Matcher m = p.matcher(readline); // the source
			while(m.find()) {
			System.out.print(m.start() + " " + m.group());
			}
		}
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		
	}

}
