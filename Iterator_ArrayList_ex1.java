import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_ArrayList_ex1 {
	
	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("Ferrari");
		cars.add("Volks Wagen");
		
		// criar o objeto 'Iterator'
		Iterator<String> it = cars.iterator();
		
		while ( it.hasNext() ) {
			System.out.println( it.next() );
		}
		
		// - - - - - - - - - - - - - - - - - - - - - - - - - - - -
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(12);
		numbers.add(8);
		numbers.add(2);
		numbers.add(23);
		
		System.out.println("numbers: " + numbers);
		
		Iterator<Integer> itNum = numbers.iterator();
		
		System.out.println("Remover numbers menores que 10...");
		while(itNum.hasNext()) {
		  Integer i = itNum.next();
		  if(i < 10) {
			itNum.remove();
		  }
		}
		
		System.out.println("numbers: " + numbers);
		
	}
	
}