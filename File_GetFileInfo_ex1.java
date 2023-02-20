import java.io.File;

public class File_GetFileInfo_ex1 {
    
    public static void main(String[] args) {
        
        File myFile = new File("meu_arquivo.txt");

        if (myFile.exists()) {
            System.out.println("Nome do arquivo: " + myFile.getName());
            System.out.println("Caminho absoluto: " + myFile.getAbsolutePath());
            System.out.println("Permite gravação: " + myFile.canWrite());
            System.out.println("Permite leitura: " + myFile.canRead());
            System.out.println("Tamanho do arquivo: " + myFile.length() + " bytes");
        } else {
            System.out.println("O arquivo não foi encontrado.");
        }
    }
    
}