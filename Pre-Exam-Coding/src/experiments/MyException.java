package experiments;

public class MyException {

	public static void main(String[] args) {
		
		try {
			System.out.println(checkFood(args[0]));
		}
		catch(BadFoodException bfe) {
			bfe.printStackTrace();
		}

	}
	public static String checkFood(String s) throws BadFoodException {
		if(s.equals("Brussels")){
			throw new BadFoodException();
		}
		else if(s.equals("Peas")){
			throw new BadFoodException();
		}
		return s + " is a good food";
	}
}
