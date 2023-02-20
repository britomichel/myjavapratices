import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Scanner;

public class MatcherPattern_Adivinhe_oQue_EuGosto {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String sText;
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Digite o nome de frutas e eu lhe digo se tem alguma que eu gosto muito:");
			sText = input.nextLine();
			
			// Padrão a ser buscado
			Pattern objPat = Pattern.compile("abacaxi|melancia|banana", Pattern.CASE_INSENSITIVE);
			
			while ( sText.length() > 1 || sText.charAt(0) != 's' ) {
                // Texto onde buscar o padrão
                Matcher objMat = objPat.matcher( sText );

				boolean boMatFound = objMat.find();
				if ( boMatFound ) {
					System.out.println("Uma fruta foi encontrada.");
				} else {
					System.out.println("Nenhuma fruta que eu gosto muito.");
				}
				
				System.out.println("Digite mais algum texto ou 's' para sair: ");
				sText = input.nextLine();
			}
		} catch(Exception e) {
			System.out.println("Ocorreu algo inesperado! Não foi possível obter o dados informados.");
		}
		
	}
	
}