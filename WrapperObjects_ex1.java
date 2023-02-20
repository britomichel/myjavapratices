public class WrapperObjects_ex1 {
	
	public static void main(String[] args) {
		
		Integer wrapInt = 9500123;
		String wrapString = wrapInt.toString();
		
		System.out.println("wrapInt: " + wrapInt);
		System.out.println("Length: " + wrapString.length());
		
		System.out.println();
		
		// Wrapper Objects:
		Integer myInt = 5;
		Double myDouble = 5.99;
		Character myChar = 'A';
		
		System.out.println("Wrapper Objects:");
		System.out.println("myInt: " + myInt);
		System.out.println("myDouble: " + myDouble);
		System.out.println("myChar: " + myChar);
		
		System.out.println();
		
		// - - - - - - - - - - - - - - - - - -
		
		// Primary Types:
		
		int iInteger = 4, sumInt = 0;
		double nDouble = 4.28, sumDouble = 0.0;
		char cChar = 'B';
		String concatCharToString = "";
		
		System.out.println("Primary Types:");
		System.out.println("iInteger: " + iInteger);
		System.out.println("nDouble: " + nDouble);
		System.out.println("cChar: " + cChar);
		
		System.out.println();
		
		// Somar Wrapper Objects com Primary Types
		
		sumInt = iInteger + myInt.intValue();
		sumDouble = nDouble + myDouble.doubleValue();
		concatCharToString = String.valueOf(cChar) + myChar.charValue();
		
		System.out.println("sumInt = " + sumInt);
		System.out.println("sumDouble = " + sumDouble);
		System.out.println("concatCharToString = " + concatCharToString);
		
	}
	
}