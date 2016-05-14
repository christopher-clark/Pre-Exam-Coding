package chapter3;

public class BreakandContinue {
	public static void main(String[] args){
		for(int i = 0; i < 10;i++){
			System.out.println("I = " + i);
			for(int j = 0; j < 10;j++){
				System.out.println("J = " + j + " I = " + i);
				if(i == 5)
					break;
			}
		}
	}
}
