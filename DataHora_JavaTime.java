import java.time.LocalTime; // import the LocalTime class
import java.time.LocalDate; // import the LocalDate class

import java.time.LocalDateTime; // import the LocalDateTime class

import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class



public class DataHora_JavaTime {
  
  public static void main(String[] args) {
    
	String formattedDate;
	
	LocalDate myObjDate = LocalDate.now(); // Create a date object
    System.out.println("Date is: " + myObjDate); // Display the current date
	
	LocalTime myObjTime = LocalTime.now();
    System.out.println("Time is: " + myObjTime);
	
	LocalDateTime myDateObj = LocalDateTime.now();
    System.out.println("Date and Time:" + myDateObj);
	
	// Formatar Data e Hora
    System.out.println("Formatting... ");
	
    DateTimeFormatter myFormatObjA = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	formattedDate = myDateObj.format(myFormatObjA);
    System.out.println("dd-MM-yyyy HH:mm:ss formatting: " + formattedDate);
	
	DateTimeFormatter myFormatObjB = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	formattedDate = myDateObj.format(myFormatObjB);
    System.out.println("yyyy-MM-dd formatting: " + formattedDate);
	
	DateTimeFormatter myFormatObjC = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	formattedDate = myDateObj.format(myFormatObjC);
    System.out.println("yyyy-MM-dd HH:mm:ss formatting: " + formattedDate);
	
	
  }
  
}
