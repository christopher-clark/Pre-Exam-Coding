package experiments;

public class SubSubThrower1 extends SubThrower{
	public void thrower() throws SubSubException {
		System.out.println("SubSubThrower1 throws SubSubException");
	}
}
