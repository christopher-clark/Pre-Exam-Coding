package experiments;
import javazoom.jl.player.advanced.*;
import java.io.*;

public class MP3Player {

	public static void main(String[] args) {
		
		try{
		    FileInputStream fis = new FileInputStream("C:\\Users\\Chris\\Documents\\Stella.mp3");
		    AdvancedPlayer playMP3 = new AdvancedPlayer(fis);
		    playMP3.play();
		    fis.close();
		}
		catch(Exception exc){
		    exc.printStackTrace();
		    System.out.println("Failed to play the file.");
		}
		finally{
			
		}

	}

}
