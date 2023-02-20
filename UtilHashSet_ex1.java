import java.util.HashSet;

public class UtilHashSet_ex1 {
	
  public static void main(String[] args) {

    // Create a HashSet object called numbers
    HashSet<Integer> numbers = new HashSet<Integer>();

    // Add values to the set
    numbers.add(4);
    numbers.add(7);
    numbers.add(8);
	
	System.out.println("numbers: " + numbers);
	System.out.println("qtd.: " + numbers.size());
	
    // Show which numbers between 1 and 10 are in the set
    for(int i = 1; i <= 10; i++) {
      if(numbers.contains(i)) {
        System.out.println(i + " was FOUND in the set.");
      } else {
        System.out.println(i + " was NOT Found in the set.");
      }
    }
  }
  
}

