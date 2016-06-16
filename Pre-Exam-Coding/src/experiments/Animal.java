package experiments;
import java.util.*;

public class Animal implements Comparable<Animal> {
	
	private String name;
	private int weight; 
		
	public Animal(){
		super();
	}
	public Animal(String name){
		this.name = name;
	}
	public int compareTo(Animal ani) {
		return name.compareTo(ani.getName());
	}
	public boolean equals(Object o){
		if((o instanceof Animal) && (((Animal)o).getName() == name))
			return true;
		else
			return false;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public int getWeight(){
		return weight;
	}
	public void setWeight(int weight){
		this.weight = weight;
	}
	public void makeNoise(){
		System.out.println("Animal noise ");
	}
	public void checkup() { 
		System.out.println("Animal checkup");
	}
	public void showName(){
		System.out.println("My name is : " + name);
	}
	public void feedMe(){
		System.out.println("Feed me Animal Food");
	}
}
