import java.io.File;

public class File_DeleteFolder_ex1 {
    
    public static void main(String[] args) {
        
        File myFile = new File(
            "C:\\Users\\miche\\OneDrive\\Documentos\\Projetos Java\\ProjetosJavaDiversos\\pasta_vazia"
        );
        
        if (myFile.delete()) {
            System.out.println("Pasta deletada: " + myFile.getName());
        } else {
            System.out.println("Falha ao tentar deletar a pasta.");
        }
    }
    
}