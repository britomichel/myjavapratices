import java.util.ArrayList;

public class Lambda_ex1 {

    public static void main(String[] args) {
        
        ArrayList<Integer> arNros = new ArrayList<Integer>();

        arNros.add(3);
        arNros.add(9);
        arNros.add(12);
        arNros.add(15);

        arNros.forEach(
            (num) -> { 
                System.out.println("_"); 
                System.out.println(num); 
            } 
        );
    }

}