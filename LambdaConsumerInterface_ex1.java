import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaConsumerInterface_ex1 {
    
    public static void main(String[] args) {
        ArrayList<Integer> arNros = new ArrayList<Integer>();

        arNros.add(7);
        arNros.add(14);
        arNros.add(21);
        arNros.add(28);
        arNros.add(35);
    
        Consumer<Integer> method = (n) -> {
            System.out.println("_");
            System.out.println(n);
        };
    
        arNros.forEach( method );
    }
    
}