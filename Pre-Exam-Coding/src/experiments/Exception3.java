package experiments;
import java.io.*;

public class Exception3 { 

	public static void main(String[] args) {
		Exception3 e3 = new Exception3();
		try{
		e3.method1();
		}
		catch(IOException ioe){
			ioe.printStackTrace();
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	public void method1 () throws IOException{
		try{
			method2();
		}
		catch(EOFException ioe){
			ioe.printStackTrace();
		}
	}
	public void method2() throws IOException{
		throw new IOException();
	}
	public void method3(){
		throw new NullPointerException();
	}
	public void doStuff() throws FileNotFoundException {
		try {
		// risky IO things
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("foo.out")));

		} catch(IOException ex) {
		// can't handle it
		throw new FileNotFoundException(); // Can't throw it unless you declare it
		}
	}
}
