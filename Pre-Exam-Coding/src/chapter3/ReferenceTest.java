package chapter3;
import chapter2.*;

class ReferenceTest {
	public static void main (String [] args) {
		Animal yogi = new Animal("Yogi");
		System.out.println("Yogi is called " + yogi.name);
		rename(yogi,"Fred");
		System.out.println("Yogi is called " + yogi.name);
		
		int a = 1;
		ReferenceTest rt = new ReferenceTest();
		System.out.println("Before modify() a = " + a);
		rt.modify(a);
		System.out.println("After modify() a = " + a);
		}
		void modify(int number) {
		number = number + 1;
		System.out.println("number = " + number);
	}
		
		static public void rename(Animal ani, String newName){
		ani.name = newName;
		
	}
}