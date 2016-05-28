package experiments;

import java.io.IOException;

public class Exception1 {
	public static void main(String[] args) {
		
		SubSubThrower1 sst1 = new SubSubThrower1();
		try {
			sst1.thrower();
		} catch(SubSubException sse){
			sse.printStackTrace();
		} finally{
			System.out.println("Cleaning up in finally block");
		}
	}
	public void method1(){
		System.out.println("method1");
		method2();
	}
	public void method2(){
		System.out.println("method2");
		int i = 1/0;
		
	}
	public void doStuff() throws IOException{
		try {
			throw new IOException();
		// risky IO things
		} catch(IOException ex) {
		// can't handle it
			ex.printStackTrace();
			throw ex;
		 // Can't throw it unless you declare it
		}
	}
}
