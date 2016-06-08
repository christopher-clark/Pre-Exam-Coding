package experiments;
import com.prot.test.*;

public class ProtectedAccessTest extends ProtectedInstances {

	public static void main(String[] args) {
		ProtectedAccessTest pat = new ProtectedAccessTest();
		pat.showProtected();
		
	}
	public void showProtected(){
		System.out.println("Protected int variable can be displayed via inheritance = " + protInt);

	}

}
