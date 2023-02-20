import java.io.File;

public class FileDelete_ex1 {
    
    public static void main(String[] args) {
        
        File myFile = new File("meu_arquivo - Copia.txt");

        if ( myFile.delete() ) {
            System.out.println("Pronto! O arquivo foi deletado.");
        } else {
            System.out.println("Falha ao tentar deletar o arquivo.");
        }
    }
    
}