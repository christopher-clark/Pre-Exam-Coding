package experiments;

public class AnonInner {

	private Cat c = new Cat() {
		public void feedMe(){
			System.out.println("Feeding an anonymous inner Cat");
		}
	};
	public void feedCat(){
		c.feedMe();
	}
	public static void main(String[] args) {

		AnonInner anonInner = new AnonInner();
		anonInner.feedCat();
		anonInner.c.feedMe();

	}

}
