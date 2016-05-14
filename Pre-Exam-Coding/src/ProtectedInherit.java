import chapter1.Protected;

public class ProtectedInherit extends Protected{

	public void showProt(){
		System.out.println("Inherited Protected Instance Variable = " + protInst);
	}
	public void dontExtend(){
		Protected prot = new Protected();
		System.out.println("Not extended protected var = " + prot.protInst);
	}
}
