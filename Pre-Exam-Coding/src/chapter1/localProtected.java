package chapter1;

public class localProtected {
	public void dontExtend(){
		Protected prot = new Protected();
		System.out.println("Not extended protected var = " + prot.protInst);
	}
	public void showDef(){
		Protected prot = new Protected();
		System.out.println("Not extended protected var = " + prot.accessible);
	}
}
