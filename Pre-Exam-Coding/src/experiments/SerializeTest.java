package experiments;
import java.io.*;

public class SerializeTest {

	public static void main(String[] args) {
		
		Cow[] herd = new Cow[3];
		
		Bell cowbell = new Bell(100);
		
		Cow hamish = new Cow("cornwall");
		hamish.setName("Hamish");
		hamish.weight = 20;
		Bell doorBell = new Bell(144);
		hamish.bell = doorBell;
		Cow milky = new Cow("2Wales");
		milky.setName("Milky");
		Bell bigBen = new Bell(100004);
		milky.weight = 100;
		milky.bell = bigBen;
		Cow ermintrude = new Cow("Devon");
		ermintrude.setName("Ermintrude");
		ermintrude.bell = cowbell;
		ermintrude.weight = 10;
		
		herd[0] = ermintrude;
		herd[1] = hamish;
		herd[2] = milky;
		
		for(Cow c : herd){
			System.out.println("Cow's name is " + c.getName());
			System.out.println("Cow's weight is " + c.weight);
		//	System.out.println("Cow's Bell is " + c.getBell().getSound());
			System.out.println("Static town is " + c.getTown());
		}
		//Horse pegasus = new Horse();
		
		// Write Array of Objects to Serialised file
		try{
			FileOutputStream fos = new FileOutputStream("C:\\SCJP\\SerialisedObjects\\cows.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(herd);
			//oos.writeObject(pegasus);
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
	//			System.out.println("Cow's Bell is " + c.getBell().getSound());
				System.out.println("Static town is " + c.getTown());
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
