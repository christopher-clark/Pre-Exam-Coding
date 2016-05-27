package experiments;

class TwoDArray {
 public static void main(String[] args) {
	 float f1 = 2.3f;
	 float[][] f2 = {{42.0f, 99f, 9.0f, 101.1f}, {1.7f, 2.3f}, {2.6f, 2.7f}};
	 float[] f3 = {2.7f};
	 Long x = 42L;
 
	 for(int i = 0; i < f2.length;i++){
		 for(int j = 0; j < f2[i].length;j++)
			 System.out.println(f2[i][j]);
	 }
	 for(float fa : f2[0]){
		 System.out.println("Enhanced for loop " + fa);
	 }
	 // insert code here
	 
	// if(f1 == f2)
	 /*if(f1 == f2[2][1])
		 System.out.println("f1 == f2[2][1] is true f1  =" + f1 + " f2[2][1] =  " + f2[2][1]);
	 if(x == f2[0][0]) 
		 System.out.println("x == f2[0][0] is true x =   " + x + " f2[0][0] =  " + f2[0][0]);
	// if(f1 == f2[1,1])
	 if(f3 == f2[2])
		 System.out.println("f3 == f2[2]is true");
	 
 	System.out.println("f3 == f2[2] " + f2[2]);
 	*/
 	}
 }