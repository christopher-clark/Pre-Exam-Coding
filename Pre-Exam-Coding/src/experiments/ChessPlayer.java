package experiments;
import java.io.*;

public class ChessPlayer extends Player implements Serializable  {

	private Cow c;
	{ System.out.println("c"); }
	
	public static void main(String[] args) {

		ChessPlayer cp = new ChessPlayer();
		
		try {
			FileOutputStream fos = new FileOutputStream("C:\\SCJP\\SerialisedObjects\\ChessPlayer.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(cp);
			oos.flush();
			oos.close();
			
			FileInputStream fis = new FileInputStream("C:\\SCJP\\SerialisedObjects\\ChessPlayer.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ChessPlayer cp1 = (ChessPlayer)ois.readObject();
			ois.close();
		}catch (ClassNotFoundException cnf){
			cnf.printStackTrace();
		} catch (IOException ioe){
			ioe.printStackTrace();
		}
		

	}

}
