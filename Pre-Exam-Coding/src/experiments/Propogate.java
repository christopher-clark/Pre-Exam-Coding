package experiments;

public class Propogate {

	public static void main(String[] args) {
		String s ="abvc";
		
		try{
		System.out.println(reverse(s));
		}
		catch(NullString ns){
			ns.printStackTrace();
		}
		finally{
			System.out.println("In finally block");
		}
	}
	public static String reverse (String s) throws NullString{
		if(s.length() == 0){
			throw new NullString();
		}
		String reverseStr = "";
		for(int i = s.length()-1;i >= 0;i--){
			reverseStr += s.charAt(i);
		}
		return reverseStr;
	}
}
