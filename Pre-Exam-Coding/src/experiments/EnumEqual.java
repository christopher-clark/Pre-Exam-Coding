package experiments;

public class EnumEqual {
	enum trafficLight {RED,AMBER,GREEN};
	
	public static void main(String [] args){
		trafficLight t1 = trafficLight.AMBER;
		trafficLight t2 = trafficLight.AMBER;
		if(t1 == t2)
			System.out.println(" t1 == t2");
		if(t1.equals(t2)){
			System.out.println(" t1.equals(t2)");
		}
		Dog d = new Dog();
		if(d instanceof Animal){
			System.out.println(" dog is an Animal ");
		}
			
	}
}
