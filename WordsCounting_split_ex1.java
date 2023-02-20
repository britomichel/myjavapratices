import java.io.IOException;
import java.util.Scanner;

public class WordsCounting_split_ex1 {
    public static void main(String[] args) {
        
        int qtde = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma frase qualquer: ");

        try {
            String frase = input.nextLine();
            qtde = frase.split("\\s").length;
            input.close();
            System.out.println("A frase informada contém " + qtde + " palavras.");
        } catch (Exception e) {
            System.out.println("Ocorreu algum erro ao tentar obter a frase.");
            System.out.println("Erro: " + e);
        }

    }
}