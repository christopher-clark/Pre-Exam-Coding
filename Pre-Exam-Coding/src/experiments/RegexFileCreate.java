package experiments;
import java.io.*;

public class RegexFileCreate {

	private static File myFile;
	private String path = "C:\\SCJP\\SourceData\\"; 
	
	public static void main(String[] args) {
		RegexFileCreate rfc = new RegexFileCreate();
		//rfc.createFile();
		rfc.randomHex();
		rfc.randomOct();
	}
	public void createFile(){
		myFile = new File(path+"RandomData.txt");
		try{
			myFile.createNewFile();
		} catch (IOException ioe){
			ioe.printStackTrace();
		}
	}
	public void randomHex(){
		System.out.println("Random hex = " + Integer.toHexString((int) (Math.random() * 1024)));
	}
	public void randomOct(){
		System.out.println("Random octal value = " + Integer.toOctalString((int) (Math.random() * 1024)));
	}

}
