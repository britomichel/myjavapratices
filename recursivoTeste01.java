import java.util.*;

public class recursivoTeste01 {
	
  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um Numero: ");
    String strNum = sc.nextLine();
    sc.close();
    
    System.out.println("O numero informado foi: " + strNum);
    System.out.println("Processando...");
    
    int result = sum( Integer.parseInt(strNum) );
    System.out.println("Soma dos números de 1 até " + strNum + " é " + result);
    
  }
  
  // Recursividade:
  public static int sum(int k) {
    if (k > 0) {
      System.out.println(k);
      return k + sum(k - 1);
    } else {
      System.out.println("0 (end)");
      return 0;
    }
  }
  
}
