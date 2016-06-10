package experiments;
import java.io.*;

public class Maker {

	public static void main(String[] args) {
		
		try {
			File dir = new File("C:\\SCJP\\SerialisedObjects\\dir3");
			dir.mkdir();
			File file = new File(dir,"file3");
			file.createNewFile();
		} catch(Exception e){
			
		}
					
	}

}
