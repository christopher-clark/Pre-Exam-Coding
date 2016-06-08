package experiments;
import java.io.*;
import java.util.*;

public class StringSplit {

	public static void main(String[] args) {
		
		try{
			//BufferedReader br = new BufferedReader(new FileReader("C:\\SCJP\\SourceData\\Tokens.txt"));
			String str = new BufferedReader(new FileReader("C:\\SCJP\\SourceData\\Tokens.txt")).readLine();
		//	String readline = br.readLine();
		//	System.out.println(readline);
			
			String[] tokens = str.split(",");
			System.out.println("count " + tokens.length);
			
			for(String s : tokens)
				System.out.println(">" + s + "<");
		} catch(IOException ioe){
			ioe.printStackTrace();
		}
		
	}

}


