import java.util.ArrayList;
import java.util.Iterator;

public class UtilIteratorEx1 {
  public static void main(String[] args) {

    // Make a collection
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
	
	System.out.println(cars);

    // Get the iterator
    Iterator<String> it = cars.iterator();

    // Print the first item
    System.out.println(it.next());
	it.next();
    System.out.println(it.next());
  }
}

