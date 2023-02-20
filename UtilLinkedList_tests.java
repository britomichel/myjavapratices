import java.util.LinkedList;

public class UtilLinkedList_tests {
  
  public static void main(String[] args) {
    
	LinkedList<String> cars = new LinkedList<String>();
	
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
	
	System.out.println("Exibir conteúdo da LinkedList...");
    System.out.println(cars);
	
	System.out.println("Adicionar ao inicio um Fiat");
	cars.addFirst("Fiat");
	System.out.println(cars);
	
	System.out.println("Adicionar ao final uma Ferrari");
	cars.addLast("Ferrari");
	System.out.println(cars);
	
	System.out.println("O primeiro carro era: " + cars.getFirst());
	System.out.println("Remover o primeiro");
	cars.removeFirst();
	
	System.out.println(cars);
	
	System.out.println("O primeiro carro agora: " + cars.getFirst());
	System.out.println("O ultimo carro agora: " + cars.getLast());
	
  }
  
}

