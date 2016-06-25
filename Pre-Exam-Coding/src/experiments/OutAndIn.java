package experiments;

public class OutAndIn {

	public static void main(String[] args) {
		OutAndIn oai = new OutAndIn();
		oai.displayRand();

	}
	public void displayRand(){
		FindMe fm = new FindMe();
		fm.showRand();
	}
	class FindMe{
		public void showRand(){
			int rand = 10;
			System.out.println("Rand is " + (int) (Math.random() * rand));
		}
	}
}
