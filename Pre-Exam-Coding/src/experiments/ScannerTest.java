package experiments;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class ScannerTest {

	private static Scanner scanner1;
	private static String readline;
	
	public static void main(String[] args) {
	
		try{
			BufferedReader br =  new BufferedReader(new FileReader("C:\\SCJP\\SourceData\\Scan.txt"));
			while((readline = br.readLine()) !=null){
				scanner1 = new Scanner(readline);
				
				while(scanner1.hasNext()){
					if(scanner1.hasNextInt())
						System.out.println("Token is an int : " + scanner1.nextInt());
					else if(scanner1.hasNextBoolean())
						System.out.println("Token is a boolean : " + scanner1.nextBoolean());
					else if(scanner1.hasNextFloat())
						System.out.println("Token is a float : " + scanner1.nextFloat());
					else if (scanner1.hasNext())
					System.out.println("Token is a Next : " + scanner1.next());
				}
			}
		br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		}
			
}




