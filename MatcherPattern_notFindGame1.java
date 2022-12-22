/*
	Autoria: Michel Brito, 2022
	
	O Jogo/Desafio consiste em escrever frases 
	sem utilizar alguns artigos e/ou pronomes.
	Ex.:
	- Artigos: a, o, um, uma, uns, umas
	- Pronomes pessoais: eu, tu, voce, ele, ela
	- Pronomes no plural: nos, vos, voces, eles, elas
*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class MatcherPattern_notFindGame1 {
	
	private static final Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

	public static boolean isNumeric(String str) {
		if (str == null) {
			return false;
		} else {		
			return pattern.matcher(str).matches();
		}
	}
	
	public static void main(String[] args) {
		
		int iDesafio;
		boolean boAchou = false, boTemAlgum = false;
		String sFrase = "", sTemp;
		
		// explicar
		JOptionPane.showMessageDialog(null, "O desafio consiste em escrever frases simples ou compostas " +
			"\nsem utilizar Artigos ou Pronomes no inicio ou no meio das oracoes " +
			"\n(conforme o desafio selecionado)." +
			"\n\nLembrando:" +
			"\nArtigos: a, o, as, os, um, uma, uns, umas" +
			"\nPronomes Pessoais: eu, tu, voce, ele, ela, nos, vos, eles, elas");
		
		// Escolher desafio (artigos definidos, indefinidos e, ou, pronomes pessoais)
		
		sTemp = JOptionPane.showInputDialog("Selecione o desafio. Digite..." +
			"\n'1' para Artigos;" +
			"\n'2' para Pronomes Pessoais" +
			"\n'3' para Artigos e Pronomes Pessoais.");
		
		if ( isNumeric(sTemp) ) {
			iDesafio = Integer.parseInt( sTemp );
		} else {
			iDesafio = 3;
		}
		
		sFrase = " " + JOptionPane.showInputDialog("Digite uma frase:") + " ";
		System.out.println( "Frase:" + sFrase );
		
		// carregar Desafio e processar jogo
		String[] arrDesafio;
		if (iDesafio == 1) {
			arrDesafio = new String[] {" a ", " o ", " um ", " uma ", 
			" as ", " os ", " uns ", " umas "};
		} else if (iDesafio == 2) {
			arrDesafio = new String[] {" eu ", " tu ", " voce ", " ele ", " ela ", 
			" vos ", " voces ", " eles ", " elas "};
		} else {
			arrDesafio = new String[] {" a ", " o ", " um ", " uma ", " as ", 
			" os ", " uns ", " umas ", " eu ", " tu ", " voce ", " ele ", " ela ", 
			" vos ", " voces ", " eles ", " elas "};
		}
		
		// Contrutores (inicializar objetos Pattern e Matcher):
		Pattern objPat = Pattern.compile(arrDesafio[0], Pattern.CASE_INSENSITIVE);
		Matcher objMat = objPat.matcher(sFrase);
		
		for (int iDes1 = 0; iDes1 < arrDesafio.length; iDes1++) {
			
			objPat = Pattern.compile(arrDesafio[iDes1], Pattern.CASE_INSENSITIVE);
			objMat = objPat.matcher( sFrase );
			boAchou = objMat.find();
			
			if ( boAchou ) {
				boTemAlgum = true;
				System.out.println("Ops! Achamos um '" + arrDesafio[iDes1] + "'");
			}
		}
		
		if (boTemAlgum == false) {
			System.out.println("Parabens! Voce venceu o desafio!");
		} else {
			System.out.println("Puxa! Voce perdeu! ... Tente novamente.");
		}
		
		
	}
	
}
