import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Scanner;

public class RegexMatcherPattern_ex1 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String sText;
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Digite algum texto contendo ou nao a PALAVRA 'W3Schools':");
			sText = input.nextLine();
			
			// Padrão a ser buscado
			Pattern objPat = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
			
			while ( sText.length() > 1 || sText.charAt(0) != 's' ) {
				// Texto onde buscar o padrão
				Matcher objMat = objPat.matcher( sText );
				
				boolean boMatFound = objMat.find();
				if ( boMatFound ) {
					System.out.println("Match foi encontrado.");
				} else {
					System.out.println("Match NAO foi encontrado.");
				}
				
				System.out.println("Digite mais algum texto ou 's' para sair: ");
				sText = input.nextLine();
			}
		} catch(Exception e) {
			System.out.println("Ocorreu algo inesperado! Não foi possível obter o dados informados.");
		}
		
	}
	
}