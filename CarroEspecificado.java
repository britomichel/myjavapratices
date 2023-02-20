class VeiculoGeral {
  protected String brand = "Ford";        // VeiculoGeral attribute
  public void honk() {                    // VeiculoGeral method
    System.out.println("Tuut, tuut!");
  }
}

class CarroEspecificado extends VeiculoGeral {
  
  private String modeloNome = "Mustang";    // CarroEspecificado attribute
  
  public static void main(String[] args) {

    // Create a object
    CarroEspecificado myCarroEspecificado = new CarroEspecificado();

    // Call the honk() method (from the VeiculoGeral class)
    myCarroEspecificado.honk();

    // Display brand attribute (from the VeiculoGeral class) 
	// and the value of the modeloNome from the CarroEspecificado class
    System.out.println(myCarroEspecificado.brand + " " + myCarroEspecificado.modeloNome);
  }
  
}
