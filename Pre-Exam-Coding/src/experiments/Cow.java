package experiments;
import java.io.ObjectInputStream;
import java.util.*;

import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Cow  implements Serializable, Comparable<Cow> {
	
	private static final long serialVersionUID = 10000121L;
	
	
	private String country;
	private String name;
	private String breed;
	private int weight;
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public transient Bell bell;
	public static String town;
	public boolean equals(Object o){
		if((o instanceof Cow) && (((Cow)o).getName() == this.name))
			return true;
		else
			return false;
	}
	public int compareTo(Cow cow){
		return name.compareTo(cow.getName());
	}
	public Cow(){
		super();
	}
	public Cow(String name){
		this.name = name;
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
