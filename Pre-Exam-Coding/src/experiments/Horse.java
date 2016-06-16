package experiments;

public class Horse extends Animal{
	
	private int weight;
	private String name;
	
	public String getName() {
		return name;
	}
	public boolean equals(Object o){
		if((o instanceof Animal) && (((Animal)o).getName() == name))
			return true;
		else
			return false;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Horse(String name){
		this.name = name;
	}
	public Horse(){
		super();
	}
	public int getWeight(){
		return weight;
	}
	
	public void setWeight(int weight){
		this.weight = weight;
	}
	public void makeNoise(){
			System.out.println("Feed me Hay !!! ");
	}
	public void feedMe(){
		System.out.println("Feed me Hay");
	}
}
