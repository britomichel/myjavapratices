/* cada um dos 3 Outers tem 5 Inners */
public class ForNestedExp {
  public static void main(String[] args) {
    // Outer loop.
    for (int i = 1; i <= 3; i++) {
      System.out.println("Outer: " + i); // Executes 3 times
      
      // Inner loop
      for (int j = 1; j <= 5; j++) {
        System.out.println("  Inner: " + i + "." + j); // Executes 5 times (3 * 5)
      }
    } 
  }
}
