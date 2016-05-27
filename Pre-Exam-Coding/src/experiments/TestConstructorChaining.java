package experiments;

public class TestConstructorChaining {

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println("Car name = " + c.name);
	//	Car c1 = new Car(" ");
	//	SportsCar sc = new SportsCar();
		Car scCar = new SportsCar();
		System.out.println("scCar name = " + scCar.name);

	}

}
