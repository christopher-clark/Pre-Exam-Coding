package experiments;
import java.io.Serializable;

public class Cow extends Animal implements Serializable {
	
	String name;
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void makeNoise(){
			System.out.println("Moo Moo ");
	}
	public void giveMilk(){
		System.out.println("Milking ");
	}
}
