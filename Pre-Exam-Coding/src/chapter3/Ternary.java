package chapter3;

public class Ternary {

	public static void main(String[] args) {
		int i = 1;
		int j = 2;
		String result =	(i ==j )? " i == j" : " i != j";
		System.out.println(result);
		int hex1 = 0x10;
		int hex2 = 0x10;
		System.out.println(" ff && ff = " + (hex1 & hex2));
		
		for(int count = 0 ; count <10; count+=1){
			switch(count){
				case 0: System.out.println("count = 0 ");
				break;
				case 1: System.out.println("count = 1 ");
				break;
				case 2: System.out.println("count = 2 ");
				break;
				case 3: System.out.println("count = 3 ");
				break;
				case 4: System.out.println("count = 4 ");
				break;
				case 5: System.out.println("count = 5 ");
				break;
				case 6: System.out.println("count = 6 ");
				break;
				case 7: System.out.println("count = 7 ");
				break;
				case 8: System.out.println("count = 8 ");
				System.out.println("count = 88");
				System.out.println("count = 888 ");
				break;
				case 9: System.out.println("count = 9 ");
				break;
				case 10: System.out.println("count = 10 ");
				break;
			}
			
		}
	}

}
