package experiments;

public class Horse extends Animal{
	
	private String name;
	private int weight;
	
	public boolean equals(Object o){
		if((o instanceof Horse) && (((Horse)o).getName() == name))
			return true;
		else
			return false;
	}
	public int getWeight(){
		return weight;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setWeight(int weight){
		this.weight = weight;
	}
	public void makeNoise(){
			System.out.println("Feed me Hay !!! ");
	}
}
