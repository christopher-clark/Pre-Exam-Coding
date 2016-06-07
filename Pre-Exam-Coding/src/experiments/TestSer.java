package experiments;
import java.io.*;

public class TestSer {
	
	public static void main(String[] args) {
	
		SpecialSerial s = new SpecialSerial();
			
	try {
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("C:\\SCJP\\SerialisedObjects\\myFile"));
		os.writeObject(s); 
		os.close();
		
		System.out.print(++SpecialSerial.z + " ");
		ObjectInputStream is = new ObjectInputStream(
		new FileInputStream("myFile"));
		SpecialSerial s2 = (SpecialSerial)is.readObject();
		is.close();
		
		System.out.println(s2.y + " " + SpecialSerial.z);
	} catch (Exception x) {System.out.println("exc"); }
	}
}
