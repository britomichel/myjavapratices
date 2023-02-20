import java.util.ArrayList;

public class WrapperClass_ArrayList_ex1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		
		myNumbers.add(10);
		myNumbers.add(15);
		myNumbers.add(20);
		myNumbers.add(25);
		myNumbers.add(30);
		
		// Que bruxaria é essa ???
		for (int i : myNumbers) {
			System.out.println( i );
		}
		
		
	}
	
}