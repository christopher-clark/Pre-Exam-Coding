package experiments;
import java.util.*;

public class Dog  implements Comparable<Dog> {
	
	private String breed;
	private String name;
	
	public Dog(){
		super();
	}
	public int compareTo(Dog d){
		return breed.compareTo(d.getBreed());
	}
	public boolean equals(Object o){
		if((o instanceof Dog) && (((Dog)o).getBreed() == breed))
			return true;
		else
			return false;
	}
	public int hashcode(){
		return name.length();
	}
	public Dog(String name){
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		
	public void makeNoise(){
		System.out.println("Woof Woof ");
	}
	public void playDead(){
		System.out.println("Playing dead ");
	}
}
