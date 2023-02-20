import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileRead_ex1 {
    
    public static void main(String[] args) {
        
        try {
            
            File myFile = new File("meu_arquivo.txt");
            Scanner myReader = new Scanner( myFile );

            while ( myReader.hasNextLine() ) {
                String sLinhaAtu = myReader.nextLine();
                System.out.println(sLinhaAtu);
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Ocorreu algum erro.");
            e.printStackTrace();
        }
    }

}