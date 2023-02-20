public class ForArrayStringExp {
	public static void main( String[] args ) {
		/* esse For percorre o Array */
		String[] cars = {"Ferrari", "Porch", "BMW", "Mazda", "Ford", "Fiat"};
		for (String carNames : cars) {
			System.out.println(carNames);
		}
	}
}