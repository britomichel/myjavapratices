public class ExercicioDoWhile {
	
	public static void main(String[] args) {
		
		int x = 5;
		System.out.println("Antes do Do-While, x = " + x);
		
		do {
			x--;
			System.out.println(x);
		} while (x > 0);
		
		System.out.println("Depois do Do-While, x = " + x);
	}
	
}