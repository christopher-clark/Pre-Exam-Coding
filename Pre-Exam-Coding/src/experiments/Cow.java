package experiments;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Cow extends Animal implements Serializable {
	
	public String name;
	public transient Bell bell;
	public static String town;
	public boolean equals(Object o){
		if((o instanceof Cow) && ((Cow)(o.name) == this.name))){
			return true;
		else
			return false;
		}
	}
	
	public Cow(){
		super();
	}
	public Cow(String town){
		this.town = town;
	}
		
	public Bell getBell() {
		return bell;
	}
	public void setBell(Bell bell) {
		this.bell = bell;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		town = town;
	}
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
	private void writeObject(ObjectOutputStream os) {
		// throws IOException { // 1
		try {
		os.defaultWriteObject(); // 2
		os.writeInt(bell.getSound());
		} catch (Exception e) { e.printStackTrace(); }
		}
	private void readObject(ObjectInputStream is) {
		// throws IOException, ClassNotFoundException { // 4
		try {
		is.defaultReadObject(); // 5
		bell = new Bell(is.readInt());
		} catch (Exception e) { e.printStackTrace(); }
	}
	
}
