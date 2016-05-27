package experiments;

public class Ternary {

	public static void main(String[] args) {
				
		for (int i = 0;i < 100; i ++){
			int rnd = rndNum();
			System.out.println("Random Number = " + rnd);
			String result = ((rnd == 5) | (rnd == 4)) ? " == 5 | 4 " : " != 5";
			System.out.println("Result = " + result);
		}

	}
	public static int rndNum(){
		return (int) (Math.random() * 10);
	}
}
