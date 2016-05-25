package experiments;

public class Kid extends Adult{

	public static void main(String [] args){
		Kid k = new Kid();
		Kid [] kids = new Kid[5];
		
		if(kids instanceof Object)
			System.out.println("kids[] = Object "); 

		if(kids[0] == null)
			System.out.println("kids[0] = null "); 
		
		for(int i = 0 ;i <kids.length; i++)
			kids[i] = new Kid();
		
		if(kids[0] instanceof Kid){
			System.out.println("kids[0] is a  Kid ");
		}
		if(k instanceof Iface){
			System.out.println("k implements Iface via extending Adult");
		}
		if(k instanceof Adult){
			System.out.println("k is an Adult");
		}
		if(k instanceof Object){
			System.out.println("k is an Object");
		}
	}
	
}
