package experiments;

public class FailedIf {

	public static void main(String[] args) {
		FailedIf fi = new FailedIf();
	//	fi.switching();
	//	fi.switch1();
	//	fi.caseTest();
	//	fi.oldFor();
	//	fi.continueTest();
	//	fi.breakTest();
		fi.labelExercise();
	}
	public void labelExercise(){
		
		int age = 0;
		
		outer:
			while(age<=21){
				age++;
				if(age == 16){
					System.out.println("Get Your License");
					continue outer;
				}
				System.out.println("Another Year");
				
			}
	}
	public void ifTest(){
		boolean test = false;
		
		if(test = true)
			System.out.print("test = True " + (test = true));
	}
	public void breakTest(){
		outer:
			for (int i=0; i<5; i++) {
				for (int j=0; j<5; j++) {
					System.out.println("Hello");
					continue outer;
				} // end of inner loop
				System.out.println("outer"); // Never prints
			}
			System.out.println("Good-Bye");
	}
	public void continueTest(){
		
		for(int i = 0; i < 20;i++){
			if(i%2 ==0)
				continue;	
			System.out.println("i = " + i);
		}
	}
	public void caseTest(){
		
		char[] chars = {'a','b','c','d','e','A','B','C','D','E'};
		
		char ch = chars[(int) (Math.random() * chars.length)];
		
		switch(ch){
			case 'a':
			case 'b':
			case 'c':
			case 'd':
			case 'e':
				System.out.println("lower case " + ch);
				break;
			case 'A':
			case 'B':
			case 'C':
			case 'D':
			case 'E':
				System.out.println("upper case " + ch);
				break;	
		}
	}
	public void oldFor(){
		for(int i = 0, j = 10;i<10;i++,j+=10)
			System.out.println("i = " + i + " j = " + j);
	}
	public void switch1(){
	int x = 3;
	switch (x) {
		case 2:
		case 4:
		case 6:
		case 8:
		case 10: {
			System.out.println("x is an even number"); 
			break;
			}
		default:
			System.out.println("x is an odd number"); 
		}
	}
	public void switching(){
		
		for(int i =0;i< 10;i++){
		int rand = (int) (Math.random() * 5);
		
			switch(rand){
			case 0:
				System.out.println("Case 0 Rand = " + rand);
				break;
			case 1:
				System.out.println("Case 1 Rand = " + rand);
				break;
			case 2:
				System.out.println("Case 2 Rand = " + rand);
				break;
			case 3:
				System.out.println("Case 3 Rand = " + rand);
				break;
			case 4:
				System.out.println("Case 4 Rand = " + rand);
				break;
			default:
				System.out.println("Default Rand != 0-4 " + rand);
				assert false : "Rand  is " + rand;
			}
		}
	}

}
