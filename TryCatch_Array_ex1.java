/* 
>> Alguns Tipos de Exceção:
	ArithmeticException, 
	FileNotFoundException, 
	ArrayIndexOutOfBoundsException, 
	SecurityException
*/

public class TryCatch_Array_ex1 {
	
	public static void main(String[] args) {
		
		int[] arrNumbers = {1, 2, 3};
		
		for( int i : arrNumbers ) {
			System.out.println( i );
		}
		
		System.out.println("Tentar obter ArrNumbers[9] desse array de 3 elementos...");
		try {
			System.out.println( arrNumbers[9] );
		} catch (Exception e) {
			System.out.println("Algo deu errado ao tentar acessar ArrNumbers[9]");
			System.out.println("Erro: " + e);
		} finally {
			System.out.println("Terminou a 1a secao try-catch.");
		}
		
		System.out.println();
		
		System.out.println("Tentar dividir 9 por 0...");
		try {
			System.out.println( 9 / 0 );
		} catch (Exception e) {
			System.out.println("Algo deu errado ao tentar acessar dividir 9 / 0.");
			System.out.println("Erro: " + e);
		} finally {
			System.out.println("Terminou a 2a secao try-catch.");
		}
		
	}
	
}