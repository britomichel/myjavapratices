public class ArrayDuasDimensoes {
   
   public static void main(String[] args) {
     
	 int[][] myNumbers = { {1, 2, 3, 4}, {27, 28, 29}, {-18, -2, 176, 13, -98} };
	 
     for (int i = 0; i < myNumbers.length; ++i) {
		for(int j = 0; j < myNumbers[i].length; ++j) {
           System.out.println( i + "." + j + " = " + myNumbers[i][j] );
        }
     }
	 
   }
   
}
