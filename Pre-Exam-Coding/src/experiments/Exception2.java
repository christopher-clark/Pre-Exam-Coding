package experiments;
import java.io.*;

public class Exception2 {
	
	public static void main(String[] args){
		try{
			BufferedReader in
			   = new BufferedReader(new FileReader("C:\\Users\\Chris\\Documents\\FindAndBook.cs"));
			System.out.println(in.readLine());
		}
		catch(FileNotFoundException fnf){
			fnf.printStackTrace();
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
		
	}

}
