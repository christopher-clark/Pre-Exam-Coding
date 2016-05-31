package experiments;
import java.io.*;

public class Files {

	private static File myFile;
	private static String path = "C:\\SCJP";
	private static FileReader fr;
	private static BufferedReader br;
	private static String data;
	
	public static void main(String[] args) {
		createFile("Chris.txt");
		writeFile("Hello World", 99);
		readFile("Chris.txt");
		try{
			PrintWriter pw = new PrintWriter(path+"\\tmp");
			for(int i = 0 ; i < 10; i++){
				pw.write("tmp"+i+"\n");
				if(i ==8)
					assert(false);
			}
			pw.flush();
			pw.close();
		FileReader fr = new FileReader(path+"\\tmp");
		BufferedReader br = new BufferedReader(fr);
			do {
				System.out.println("BufferedReader.readline = " + br.readLine());
			}while( br.readLine() != null);
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
	public static void createFile(String filename){
		// Create File Object
		myFile = new File(path+"\\"+filename);
		// Create an actual file
		try{
			myFile.createNewFile();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
	public static void writeFile(String writeLine, int numberOflines){
		try{
			// create FileWriter Object
			FileWriter fw = new FileWriter(myFile);
			for(int i = 0; i < numberOflines;i++){
				fw.write(writeLine+"\n");
			}
			fw.flush();
			fw.close();
		} catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
	public static void readFile(String filename){
		
		File file =	new File(path+"\\"+filename); 			// create a File object AND open it
				try{										
					fr = new FileReader(file); 				// create a FileReader to get the file contents
					br = new BufferedReader(fr); 			// create a BufferReader to read the contents
					int lineCount = 0;
					do{										// get its data from a Reader
						data = br.readLine();
						System.out.println(data + lineCount++);
					}while(data  != null);
				
				}catch(IOException ioe){
					ioe.printStackTrace();
				}
	}

	
}
	