package experiments;
	
public class Car {
	String name = "";
	
	public Car(){ System.out.println("No-Arg Car Constructor");}
	public Car(String s){
		System.out.println("String Constructor");
		this.name = "String Argument";
	}
}
