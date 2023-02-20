import java.io.File;
import java.io.IOException;

public class CreateFile_ex1 {

    public static void main(String[] args) {
        
        try {
            
            File myFile = new File("meu_arquivo.txt");
            // File myFile = new File("C:\\Users\\MyName\\filename.txt");
            
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occureed.");
            e.printStackTrace();
        }
    }
    
}
