package experiments;
import java.io.*;

public class FileCreationAndTesting {

	static char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	static int[] nums = {1,2,3,4,5,6,7,8,9,0};
	
	static private File file;
	static private boolean fileExists = false;
	static private String fileName;
	static private final String path = "C:\\SCJP\\SourceData\\";
	
	public static void main(String[] args) {
		
		fileName = randomFilename();
		file = new File(path + fileName);
		fileExists = file.exists();
		System.out.println("Does File exist ? " + file.exists());
		System.out.println(file.getName());
		try{
			file.createNewFile();
			System.out.println(file.getName());
			System.out.println("Does File exist Now ? " + file.exists());
		} catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
	private static String randomFilename(){
		
		String filename = "";
		for(int i = 0; i < 10;i++){
			filename += alphabet[(int) (Math.random() * alphabet.length)];
		}
		return filename;
	}
}


