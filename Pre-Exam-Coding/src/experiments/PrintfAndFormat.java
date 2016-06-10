package experiments;
import java.io.*;

public class PrintfAndFormat {

	private File myFile;
	private String path = "C:\\SCJP\\SourceData\\";
	
	public static void main(String[] args) {
		int i1 = -123;
		int i2 = 12345;
		int i3 = -987654;
		float f = -123.456f;
		String s = "String s";
		boolean gboole = false;
		
	//	System.out.printf("> %+.4f <\n",f);
	//	System.out.printf("> %1$0+(17d < ****** %2$0+(12d ******  !!!! %3$s !!!!!",i1,i3,s);
		System.out.printf("***>%2$+14d<*** [%1$07d]  ^ %3$.5f ^ \n",i1, i3, f);
		System.out.format("***>%2$+09d<*** [ %1$0(8d ]  ^ %3$.4f ^ \n",i1, i3, f);
		System.out.format(">%+-10d< \n", i2);
		System.out.format("<%1$b>  \"%2$12s\"",gboole,s);
	}
}
