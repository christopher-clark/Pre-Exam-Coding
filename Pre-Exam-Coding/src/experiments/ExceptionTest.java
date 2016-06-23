package experiments;
import java.io.*;

public class ExceptionTest {

	public static void main(String[] args) {
		ExceptionTest et = new ExceptionTest();
		try{
			et.reverse("Hello");
			//et.reverse("");
		} catch(Exception e){
			System.out.println("Exception caught");
			e.printStackTrace();
		}
		finally{
			System.out.println("Finally runs regardless");
		}
		try{
			et.throwThrow();
		} catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
	public void reverse(String s) throws IllegalArgumentException  {
		if(s.length() == 0)
			throw new IllegalArgumentException();
		
		StringBuffer sb = new StringBuffer(s);
		System.out.println("String before reversing = " + sb + " Reversed String is " + sb.reverse());
	}
	public void thrower() throws IOException {
		System.out.println("Thrower");
		//throw new IOException();
	}
	public void throwThrow() throws IOException{
		thrower();
	}

}
