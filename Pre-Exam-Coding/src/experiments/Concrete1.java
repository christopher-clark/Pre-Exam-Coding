package experiments;

public class Concrete1 implements Interface1 {
	
	public void sayHi(){
		System.out.println("Hi");
	}
	public void sayBi(){
		System.out.println("Bye");
	}
	public static void main (String[] args){
		Interface1 i1 = new Concrete1();
		i1.sayHi();
		Concrete1 c1 = new Concrete1();
		c1.sayBi();
	}

}
