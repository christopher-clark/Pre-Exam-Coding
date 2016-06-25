package experiments;

public class Beyond1 extends Infinity {
	public static void main(String[] args){
		Infinity inf = new Beyond1();
		Beyond1 b = (Beyond1)inf;
		Animal aniCat = new Cat();
		Cat c = (Cat)aniCat;
		try{
		throw new Exception();
		}catch(Exception e){}
	}
	public void divide(){
		int y = 7/0;
	}
}
