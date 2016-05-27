package experiments;

public class Twisty {
	{ index = 1; }
	 int index;
 public static void main(String[] args) {
	 new Twisty().go();
 }
 void go() {
	 int [][] dd = {{9,8,7}, {6,5,4},{3,2,1,0}};
	 for(int i = 0;i < dd.length;i++){
		 for(int j = 0; j < dd[i].length;j++)
			 System.out.println(dd[i][j]);
	 }
	 System.out.println(dd[index++][index++]);
	 System.out.println("index = " + index);
 }
 }
