package experiments;
import java.io.*;

public class SerializeTest {

	public static void main(String[] args) {
		
		Cow[] herd = new Cow[3];
		

		Cow ermintrude = new Cow();
		ermintrude.setName("Ermintrude");
		ermintrude.weight = 10;
		Cow hamish = new Cow();
		hamish.setName("Hamish");
		hamish.weight = 20;
		Cow milky = new Cow();
		milky.setName("Milky");
		milky.weight = 100;
		
		herd[0] = ermintrude;
		herd[1] = hamish;
		herd[2] = milky;
		
		for(Cow c : herd){
			System.out.println("Cow's name is " + c.getName());
			System.out.println("Cow's weight is " + c.weight);
		}
		
		
		// Write Array of Objects to Serialised file
		try{
			FileOutputStream fos = new FileOutputStream("C:\\SCJP\\SerialisedObjects\\cows.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(herd);
			oos.flush();
			oos.close();
		} catch(FileNotFoundException fnf){
			fnf.printStackTrace();
		} catch(IOException ioe){
			ioe.printStackTrace();
		}
		
		// Read Objects back
		
		try{
			FileInputStream fis = new FileInputStream("C:\\SCJP\\SerialisedObjects\\cows.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Cow[] newCows = (Cow[]) ois.readObject();
			fis.close();
			ois.close();
			
			for(Cow c : newCows){
				System.out.println(" New Cow's name is " + c.getName());
				System.out.println("Cow's weight is " + c.weight);
			}
		/*} catch(FileNotFoundException fnf){
			fnf.printStackTrace();*/
		}catch(ClassNotFoundException cnf){
			cnf.printStackTrace();
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
}
