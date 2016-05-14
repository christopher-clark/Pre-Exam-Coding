package chapter3;
import chapter2.*;

public class EnhancedForLoop {

	public static void main(String[] args) {
		Animal[] animals = new Animal[26];
		
	//	for (int i = 0;i<animals.length;i++){
			for (int i = 0;i<26;i++){
			animals[i] = new Animal();
		}
		for(Animal ani : animals){
			System.out.println("Animal name = " + ani.name);
		}
	}

}
