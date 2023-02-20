import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class


public class UtilArrayList_ForEach01 {
  
  static void imprimirLista(ArrayList<Integer> arrNumbers) {
	// Utilizar o 'for-each'
	for (int i : arrNumbers) {
		System.out.println(i);
    }
  }
  
  public static void main(String[] args) {
    
	ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    
	myNumbers.add(10);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(25);
	myNumbers.add(54);
    myNumbers.add(23);
    myNumbers.add(12);
	
    System.out.println("Imprimir lista de numeros...");
	imprimirLista(myNumbers);
	
    System.out.println("ordenar numeros...");
	Collections.sort(myNumbers);
	imprimirLista(myNumbers);
	
  }
  
}

