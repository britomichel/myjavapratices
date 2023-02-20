public class Throws_ArithmeticException_ex1 {
	
	static void checkAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("Acesso negado. Precisa ter pelo menos 18 anos.");
		} else {
			System.out.println("Acesso permitido. Sua idade permite.");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Checar a idade (maioridade)...");
		
		checkAge(15);
		// checkAge(25);
		
	}
	
}