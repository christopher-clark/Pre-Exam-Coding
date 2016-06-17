package experiments;

public class Food {
	Popcorn p = new Popcorn() {
		public void pop(){
			System.out.println("Anonymous Inner Class Popcorn popping");
		}
	};
	ChrisInterface cc = new ChrisInterface() {
		public void playBass(){
			System.out.println("Playing the Bass");
		}
	};
	public void demo(){
		p.pop();
		cc.playBass();
	}
}