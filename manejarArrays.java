public class manejarArrays {
  /* atualizar um array */
  
  static void imprimeLista(String[] carsImp) {
	for (String carName: carsImp) {
		System.out.println( carName );
	}
  }

  public static void main(String[] args) {
    
	String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "Porch", "Volks"};
	
	// imprimir lista dos carros ORIGINAIS
	System.out.println("\nANTES de atualizar:");
    imprimeLista(cars);
    
	// ATUALIZAR lista dos carros
    cars[0] = "Opel";
    cars[2] = "Ferrari";
    
    // imprimir lista dos carros atualizada
	System.out.println("\nDEPOIS de atualizar:");
    imprimeLista(cars);
    
  }
}