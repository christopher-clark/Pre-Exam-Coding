package chapter3;

public class Parent {
	static {
		System.out.println("Parent static init block");
	}
	public Parent(){
		System.out.println("Parent Constructor");
	}
}
