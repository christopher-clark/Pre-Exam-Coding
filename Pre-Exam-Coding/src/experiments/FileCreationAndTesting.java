package experiments;
import java.io.*;

public class FileCreationAndTesting {

	static char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	static int[] nums = {1,2,3,4,5,6,7,8,9,0};
	
	static private File file;
	static private boolean fileExists = false;
	
	private final String path = "C:\\SCJP\\SourceData";
	
	public static void main(String[] args) {
		
		file = new File(randomFilename());
		fileExists = file.exists();
		System.out.println("Does File exist ? " + fileExists);
		System.out.println(file.getName());

	}
	private static String randomFilename(){
		
		String filename = "";
		for(int i = 0; i < 10;i++){
			filename += alphabet[(int) (Math.random() * alphabet.length)];
		}
		return filename;
	}
}


