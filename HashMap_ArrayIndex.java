import java.util.HashMap;

public class HashMap_ArrayIndex {
  public static void main(String[] args) {
    
	// Cria HashMap com index (key) String e value String
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // keys and values (Country, City)
	System.out.println("List keys and values (Country, City)");
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
	System.out.println(capitalCities);
	System.out.println("Qtde: " + capitalCities.size());
	
	System.out.println("Remover index England...");
	capitalCities.remove("England");
	System.out.println(capitalCities);
	
	System.out.println("Adicionar mais cidades...");
	capitalCities.put("Rio de Janeiro", "Rio de Janeiro");
	capitalCities.put("Sao Paulo", "Sao Paulo");
	capitalCities.put("Amazonas", "Manaus");
	System.out.println(capitalCities);
	System.out.println("Qtde: " + capitalCities.size());
	
	// for-each
	System.out.println("Estados ou Paises com Capital de mesmo nome...");
	for (String i : capitalCities.keySet()) {
		if (i == capitalCities.get(i)) {
			System.out.println("Estado/pais: " + i + "  Capital: " + capitalCities.get(i));
		}
	}
	
	System.out.println("Limpar lista");
	capitalCities.clear();
	System.out.println(capitalCities);
	System.out.println("Qtde: " + capitalCities.size());
	
	// Add keys (String) and values (Integer)
    HashMap<String, Integer> people = new HashMap<String, Integer>();
	
    people.put("John", 32);
    people.put("Steve", 30);
    people.put("Angie", 33);

    for (String i : people.keySet()) {
      System.out.println("key(nome): " + i + " value(idade): " + people.get(i));
    }
  }
}
