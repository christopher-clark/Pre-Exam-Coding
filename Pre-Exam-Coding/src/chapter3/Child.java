package chapter3;

public class Child extends Parent{
	static {
		System.out.println("Child static init block");
	}
	public Child(){
		System.out.println("Child Constructor");
	}
}
