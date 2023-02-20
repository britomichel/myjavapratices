import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ex1 {

    public static void main(String[] args) {

        try {
            
            FileWriter myWriter = new FileWriter("meu_arquivo.txt");
            myWriter.write(
                "O programa esta escrevendo neste arquivo." + 
                "\nParece bacana essa funcionalidade."
            );
            myWriter.close();

            System.out.println("O arquivo foi salvo com sucesso");

        } catch (IOException e) {
            System.out.println("Ocorreu algum erro.");
            e.printStackTrace();
        }

    }
}