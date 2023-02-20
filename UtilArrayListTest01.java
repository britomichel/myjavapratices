import java.util.ArrayList;
import java.util.Collections;

public class UtilArrayListTest01 {
	
  static void imprimirLista(ArrayList<String> listCar) {
    for (int i = 0; i < listCar.size(); i++) {
      System.out.println(listCar.get(i));
    }
	System.out.println("Quantidade: " + listCar.size());
  }
  
  public static void main(String[] args) {
    
	ArrayList<String> cars = new ArrayList<String>();
	
    System.out.println("Alimentar lista...");
	cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
	cars.add("Honda");
	cars.add("Ferrari");
		
	imprimirLista(cars);  // enviar e processar um objeto ArrayList<String>
	
	System.out.println("Alterar lista. Sai Mazda e entra Chervrolet e Fiat no final...");
	cars.remove(3);
	cars.add("Chervrolet");
	cars.add("Fiat");
	
	imprimirLista(cars);
	
	// Ordenar COLEÇÃO:
	System.out.println("Ordenar lista por Ordem Alfabética Crescente...");
	Collections.sort(cars);
	imprimirLista(cars);
	
	System.out.println("Limpar lista...");
	cars.clear();
	imprimirLista(cars);
	
  }

}

