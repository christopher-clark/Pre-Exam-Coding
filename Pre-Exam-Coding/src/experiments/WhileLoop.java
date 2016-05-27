package experiments;
import java.io.*;

public class WhileLoop {

	public static void main(String[] args) {
		
		//simpleWhile();
		//simpleDoWhile();
		//endlessFor();
		doubleFor();
	}
	public static void simpleWhile(){
		
		for(int i = 0; i < 10;i++){
			while(i < 5){
				System.out.println("in while i = " + i);
				i++;
			}
			System.out.println("in FOR i = " + i);	
		}
	}
	public static void simpleDoWhile(){
		
			int i = 0;
			
			do {
				System.out.println("in while i = " + i);
				i++;
			} while(i < 9);
			
			System.out.println("out of Do loop i = " + i);	
	}
	public static void endlessFor(){
		
	for(int i = 0 ; ;i++ ) {
		System.out.println("Inside an endless loop" + i);
		}
	}
	public static void doubleFor(){
		
		for (int i = 0,j = 0; i < 10 | j<30; i++, j+= 2) {
			System.out.println("i is " + i + " j is " + j);

			if(j < 100 && i < 5){
				System.out.println(" IF i < 10 && j < 100 " + i + " j is " + j);

			}
		}
	}
}

