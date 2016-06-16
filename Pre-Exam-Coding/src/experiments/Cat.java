package experiments;

public class Cat extends Animal{
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void checkup() { // implement Bird-specific code
		System.out.println("Cat checkup");
	}
	public void feedMe(){
		System.out.println("Feed me Milk");
	}
	public Cat(){
	}
	public Cat(String name){
		super(name);
	}
}
